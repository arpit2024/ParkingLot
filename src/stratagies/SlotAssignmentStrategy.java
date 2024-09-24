package stratagies;

import models.ParkingLot;
import models.ParkingSlot;
import models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);

}

// to assign the parking slot what data is required
// vehicleType + floors
// Do we have floors directly available
// floors are in the lot
// do we have parkingLot id ot did the client send the parking lot id
//No, the client sent the gateId

// using the gate object can I find the parking lot

