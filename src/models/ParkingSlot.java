package models;

import java.util.List;

public class ParkingSlot {

    private String slotNumber;//ParkingSlot has a slot number
    private ParkingLotStatus parkingLotStatus;//ParkingSlot has a status of parking slot which can be open or closed
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

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<SupportedVehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
