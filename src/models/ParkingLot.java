package models;

import java.util.List;

public class ParkingLot extends BaseModel{

    private String name;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> entrygates;
    private List<Gate> exitgates;

    //Don't use hashmap it is more complex to handle, better create a new class for this
    //becoz in future whenever a new feature need to be added to vehicle type,then in hashMap we need to crate a new HashMap<HashMap<HashMap........
    private List<SupportedVehicleType> supportedVehicleTypes;


}
