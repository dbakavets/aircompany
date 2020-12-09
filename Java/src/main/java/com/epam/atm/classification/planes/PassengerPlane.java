package com.epam.atm.classification.planes;
import java.util.*;

public class PassengerPlane extends Plane {

    private int planePassengersCapacity;

    public PassengerPlane(String planeModel, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity, int planePassengersCapacity)  {
        super(planeModel, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
        this.planePassengersCapacity = planePassengersCapacity;
    }

    public int getPlanePassengersCapacity() {
        return planePassengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", planePassengersCapacity=" + planePassengersCapacity +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return planePassengersCapacity == plane.planePassengersCapacity;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), planePassengersCapacity);
    }
}
