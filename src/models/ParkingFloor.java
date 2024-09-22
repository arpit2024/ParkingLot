package models;

import java.util.List;

public class ParkingFloor extends BaseModel{

    private String floorNumber;//ParkingFloor has a floor number
    private List<ParkingSlot> parkingSlots;//ParkingFloor has many parking slots
    private ParkingFloorStatus parkingFloorStatus;//ParkingFloor has a status of parking floor
    private List<SupportedVehicleType> supportedVehicleTypes;//ParkingFloor supports many vehicle types



    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<SupportedVehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<SupportedVehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }
}
