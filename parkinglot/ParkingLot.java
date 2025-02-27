package LLD.parkinglot;

import LLD.parkinglot.ParkingStrategy.ParkingStrategy;
import LLD.parkinglot.level.ILevel;
import LLD.parkinglot.vehicles.IVehicle;

import java.util.List;
import java.util.ArrayList;
//to avoid DIP use strategy instead of direct impl of level ,and spot clases

public class ParkingLot {
    private List<ILevel> levels = new ArrayList<>();
    private ParkingStrategy parkingStrategy;
    public ParkingLot(ParkingStrategy parkingStrategy){
        this.parkingStrategy = parkingStrategy;
    }
    public boolean parkVehicle(IVehicle vehicle){
        return parkingStrategy.parkVehicle(levels, vehicle);
    }
    public void unParkVehicle(IVehicle vehicle){
        parkingStrategy.unParkVehicle(levels, vehicle);
    }
    public void addLevel(ILevel level){
        System.out.println("Adding level "+ Integer.toString(level.getlevelNum()));
        levels.add(level);
    }
    public List<ILevel> getLevels(){
        return levels;
    }
}
