package models;

import java.util.List;

public class ParkingLot extends BaseModel{

    private String name;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> entrygates;
    private List<Gate> exitgates;

}
