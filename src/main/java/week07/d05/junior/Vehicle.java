package week07.d05.junior;

public abstract class Vehicle {

    private int numberOfGears = 5;
    private TransmissionType transmissionType = TransmissionType.MANUAL;

    public Vehicle() {
    }

    public Vehicle(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}

