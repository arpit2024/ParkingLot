package models;

import java.util.List;

public class ParkingSlot extends BaseModel {

    private String slotNumber;//ParkingSlot has a slot number
    private ParkingSlotStatus parkingSlotStatus;//ParkingSlot has a status of parking slot which can be open or closed
    private List<SupportedVehicleType> vehicleTypes;//ParkingSlot supports many vehicle types
    private ParkingFloor parkingFloor;//ParkingSlot belongs to a parking floor



    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public List<SupportedVehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
