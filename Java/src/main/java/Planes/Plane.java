package planes;

import java.util.Objects;

abstract public class Plane {
    private String planeModel;
    private int planeMaxSpeed;
    private int planeMaxFlightDistance;
    private int planeMaxLoadCapacity;

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
