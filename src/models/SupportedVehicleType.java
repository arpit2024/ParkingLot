package models;

public class SupportedVehicleType {

    private VehicleType type;// VehicleType.CAR, VehicleType.TRUCK, VehicleType.ELECTRIC

    private int capacity;// number of vehicles of this type that can be parked



    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
