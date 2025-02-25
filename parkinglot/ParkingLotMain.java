package LLD.parkinglot;

import java.util.ArrayList;
import java.util.List;

import LLD.parkinglot.vehicles.IVehicle;

public class ParkingLotMain{
    public static void main(String[] args) {
        Level level1 = new Level(1);
        Level level2 = new Level(2);
        Level level3 = new Level(3);
        List<Level> levels = new ArrayList<>();
        levels.add(level1);
        levels.add(level2);
        levels.add(level3);
        ParkingLot parkingLot  = new ParkingLot();
        for(Level level:levels)
            parkingLot.addLevel(level);
        IVehicle car = new Car("IW23");
        IVehicle truck = new Truck("IW23");
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        
    }
}