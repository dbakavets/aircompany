package com.epam.atm.classification.planes;
import com.epam.atm.classification.models.*;
import java.util.*;

public class MilitaryPlane extends Plane {

    private final MilitaryPlaneType militaryPlaneType;

    public MilitaryPlane(String planeModel, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity, MilitaryPlaneType militaryPlaneType) {
        super(planeModel, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
        this.militaryPlaneType = militaryPlaneType;
    }

    public MilitaryPlaneType getMilitaryPlaneType() {
        return militaryPlaneType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", military plane type=" + militaryPlaneType +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return militaryPlaneType == that.militaryPlaneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryPlaneType);
    }
}
