package com.epam.atm;

import com.epam.atm.classification.models.*;
import com.epam.atm.classification.planes.*;
import java.util.*;

public class Airport {
    private List<? extends Plane> planesList;

    public List<PassengerPlane> getPassengerPlane() {
        List<? extends Plane> airportPlanesList = this.planesList;
        List<PassengerPlane> passengerPlanesList = new ArrayList<>();
        for (Plane passengerPlane : airportPlanesList) {
            if (passengerPlane instanceof PassengerPlane) {
                passengerPlanesList.add((PassengerPlane) passengerPlane);
            }
        }
        return passengerPlanesList;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planesList) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPlanePassengersCapacity() > planeWithMaxCapacity.getPlanePassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getMilitaryPlaneType() == MilitaryPlaneType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getMilitaryPlaneType() == MilitaryPlaneType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planesList) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planesList, new Comparator<Plane>() {
            public int compare(Plane maxPlaneDistance1, Plane maxPlaneDistance2) {
                return maxPlaneDistance1.getPlaneMaxFlightDistance() - maxPlaneDistance2.getPlaneMaxFlightDistance();
            }
        });
        return this;
    }


    public Airport sortByMaxSpeed() {
        Collections.sort(planesList, new Comparator<Plane>() {
            public int compare(Plane maxPlaneSpeed1, Plane maxPlaneSpeed2) {
                return maxPlaneSpeed1.getPlaneMaxSpeed() - maxPlaneSpeed2.getPlaneMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planesList, new Comparator<Plane>() {
            public int compare(Plane maxPlaneCapacity1, Plane maxPlaneCapacity2) {
                return maxPlaneCapacity1.getPlaneMaxLoadCapacity() - maxPlaneCapacity2.getPlaneMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanesList() {
        return planesList;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "epam.Airport{" +
                "Planes=" + planesList.toString() +
                '}';
    }


    public Airport(List<? extends Plane> planes) {
        this.planesList = planes;
    }

}
