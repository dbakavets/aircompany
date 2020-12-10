package com.epam.atm.classification.planes;
import com.epam.atm.classification.models.*;


public class ExperimentalPlane extends Plane {

    private final ExperimentalPlaneType experimentalPlaneType;
    private final ClassificationPlaneLevel classificationPlaneLevel;

    public ExperimentalPlane(String planeModel, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity, ExperimentalPlaneType experimentalPlaneType, ClassificationPlaneLevel classificationPlaneLevel) {
        super(planeModel, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
        this.experimentalPlaneType = experimentalPlaneType;
        this.classificationPlaneLevel = classificationPlaneLevel;
    }

    public ClassificationPlaneLevel getClassificationPlaneLevel() {
        return classificationPlaneLevel;
    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        String planeModel = null;
        return "experimentalPlane{" +
                "model='" + planeModel + '\'' +
                '}';
    }
}
