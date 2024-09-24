package models;

import java.util.List;

public class ParkingLot extends BaseModel{

    private String name;
    private List<ParkingFloor> parkingFloors;//ParkingLot has many parking floors
    private ParkingLotStatus parkingLotStatus;//
    private List<Gate> entrygates;//ParkingLot has many entry gates
    private List<Gate> exitgates;//ParkingLot has many exit gates
    //Don't use hashmap it is more complex to handle, better create a new class for this
    //becoz in future whenever a new feature needs to be added to a vehicle type,then in hashMap we need to crate a new HashMap<HashMap<HashMap........
    private List<SupportedVehicleType> supportedVehicleTypes;
    private SlotAssignmentStrategyType slotAssignmentStrategyType;


    public SlotAssignmentStrategyType getSlotAssignmentStrategyType() {
        return slotAssignmentStrategyType;
    }

    public void setSlotAssignmentStrategyType(SlotAssignmentStrategyType slotAssignmentStrategyType) {
        this.slotAssignmentStrategyType = slotAssignmentStrategyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getEntrygates() {
        return entrygates;
    }

    public void setEntrygates(List<Gate> entrygates) {
        this.entrygates = entrygates;
    }

    public List<Gate> getExitgates() {
        return exitgates;
    }

    public void setExitgates(List<Gate> exitgates) {
        this.exitgates = exitgates;
    }

    public List<SupportedVehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<SupportedVehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }
}
