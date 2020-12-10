package com.epam.atm;

import com.epam.atm.classification.models.*;
import com.epam.atm.classification.planes.*;
import java.util.*;

public class Airport {
    private final List<? extends Plane> planesList;

    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlanesList = new ArrayList<>();
        for (Plane passengerPlane : this.planesList) {
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
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPlanePassengersCapacity() > planeWithMaxCapacity.getPlanePassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getMilitaryPlaneType() == MilitaryPlaneType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {
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
        planesList.sort((Comparator<Plane>) (maxPlaneDistance1, maxPlaneDistance2) -> maxPlaneDistance1.getPlaneMaxFlightDistance() - maxPlaneDistance2.getPlaneMaxFlightDistance());
        return this;
    }


    public Airport sortByMaxSpeed() {
        planesList.sort((Comparator<Plane>) (maxPlaneSpeed1, maxPlaneSpeed2) -> maxPlaneSpeed1.getPlaneMaxSpeed() - maxPlaneSpeed2.getPlaneMaxSpeed());
        return this;
    }

    public void sortByMaxLoadCapacity() {
        planesList.sort((Comparator<Plane>) (maxPlaneCapacity1, maxPlaneCapacity2) -> maxPlaneCapacity1.getPlaneMaxLoadCapacity() - maxPlaneCapacity2.getPlaneMaxLoadCapacity());
    }

    public List<? extends Plane> getPlanesList() {
        return planesList;
    }

    private void print(Collection<? extends Plane> collection) {
        for (Plane plane : collection) {
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
