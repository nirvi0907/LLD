package LLD.parkinglot.ParkingStrategy;

import LLD.parkinglot.level.ILevel;
import LLD.parkinglot.level.Level;
import LLD.parkinglot.vehicles.IVehicle;

import java.util.ArrayList;
import java.util.List;
import LLD.parkinglot.ParkingStrategy.ParkingStrategy;

public class FirstAvailableParkingStrategy implements ParkingStrategy {

    @Override
    public boolean parkVehicle(List<ILevel> levels, IVehicle vehicle){
        for(ILevel level : levels){
            if(level.parkVehicle(vehicle)) {
                System.out.println("parked vehicle, :" + vehicle.getPlateNum());
                return true;
            }
        }
        throw new IllegalArgumentException("Couldnt park vehicle, insufficient space or wrong vehicletype:" + vehicle.getPlateNum());
    }

    @Override
    public void unParkVehicle(List<ILevel> levels, IVehicle vehicle){
        for(ILevel level : levels){
            if(level.unparkVehicle(vehicle)) {
                System.out.println("UNparked vehicle, :" + vehicle.getPlateNum());
                return;
            }
        }
        throw new IllegalArgumentException("Vehicle already unparked or wrong vehicle type:" + vehicle.getPlateNum());

    }
}
