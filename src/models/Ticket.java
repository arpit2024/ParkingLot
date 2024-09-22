package models;

import java.util.Date;

public class Ticket extends BaseModel{

   private Date entryTime;
   private Gate gate;//Gate will contain the current gate at which the ticket was issued
   //Gate will contain the current operator at the gate
   //this operator will contain the operator details who was present at the gate when the ticket was issued
   private Operator operator;
   private ParkingSlot parkingSlot;//ticket contain the parking slot at which the ticket was issued
   private Vehicle vehicle;
   private ParkingFloor parkingFloor;


    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
