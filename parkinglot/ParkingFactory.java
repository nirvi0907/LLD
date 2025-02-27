package LLD.parkinglot;

import LLD.parkinglot.ParkingStrategy.FirstAvailableParkingStrategy;
import LLD.parkinglot.level.ILevel;
import LLD.parkinglot.level.Level;

import java.util.Map;

public class ParkingFactory {
    public static ParkingLot createParkingLot(Map<Integer, Integer> levelSpotsNumMap){
        ParkingLot parkingLot = new ParkingLot(new FirstAvailableParkingStrategy());
        for(Map.Entry<Integer, Integer> levelSpotEntry : levelSpotsNumMap.entrySet()) {
            ILevel level = new Level(levelSpotEntry.getKey(), levelSpotEntry.getValue());
            parkingLot.addLevel(level);
        }
        return parkingLot;
    }
}
