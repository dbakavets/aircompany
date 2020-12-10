package com.epam.atm.classification.planes;
import java.util.*;

abstract public class Plane {
    private final String planeModel;
    private final int planeMaxSpeed;
    private final int planeMaxFlightDistance;
    private final int planeMaxLoadCapacity;

    public Plane(String planeModel, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity) {
        this.planeModel = planeModel;
        this.planeMaxSpeed = planeMaxSpeed;
        this.planeMaxFlightDistance = planeMaxFlightDistance;
        this.planeMaxLoadCapacity = planeMaxLoadCapacity;
    }


    public int getPlaneMaxSpeed() {
        return planeMaxSpeed;
    }

    public int getPlaneMaxFlightDistance() {
        return planeMaxFlightDistance;
    }

    public int getPlaneMaxLoadCapacity() {
        return planeMaxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + planeModel + '\'' +
                ", maxSpeed=" + planeMaxSpeed +
                ", maxFlightDistance=" + planeMaxFlightDistance +
                ", maxLoadCapacity=" + planeMaxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return planeMaxSpeed == plane.planeMaxSpeed &&
                planeMaxFlightDistance == plane.planeMaxFlightDistance &&
                planeMaxLoadCapacity == plane.planeMaxLoadCapacity &&
                Objects.equals(planeModel, plane.planeModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
    }
}
