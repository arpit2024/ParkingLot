package Repository;

import models.Gate;
import models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {

    private Map<Integer , ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLot findParkingLotByEntryGate(Gate gateToCheck){
        for(ParkingLot parkingLot : parkingLots.values()){
        //here traverse all the entry gates of the parking lot and check if the gateToCheck is present in the entry gates
            for(Gate gate : parkingLot.getEntrygates()){
                if(gate.getId() == gateToCheck.getId()){
                    return parkingLot;
                }
            }
        }
        //here its taking O(n^2) time complexity, but if client had sent parking lot id- it would be easy for the process
        //int the IssueTicketRequestDto the client could send the Parking lot id too.than we could use below method
        return null;
    }

    public ParkingLot findParkingLotById(int id){
        if(parkingLots.containsKey(id)){
            return parkingLots.get(id);
        }
        return null;
    }
}



// i don't have DB But which DataStructure resembles our db very closely
// Map : treeMap-> because it has keys sorted in natural order , hashMap-> no order