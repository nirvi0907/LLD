package LLD.parkinglot;

import java.util.List;

import LLD.parkinglot.vehicles.IVehicle;

public class ParkingLot {
    List<Level> levels = null;

    public void addLevel(Level level){
        levels.add(level);
    }
    public void getLevels(){
        return levels;
    }
    public boolean assign_spot_to_vehicle(IVehicle vehicle){
        for(Level level : levels){
            if(level.parkVehicle(vehicle))
                return true;
        
        }
        return false;
    }
    public boolean exit_vehicle(Vehicle vehicle){
        for(Level level : levels){
            if(level.unparkVehicle(vehicle))
                return true;

        }
        return false;

    }
}
