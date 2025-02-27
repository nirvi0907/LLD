package LLD.parkinglot.ParkingStrategy;

import LLD.parkinglot.level.ILevel;
import LLD.parkinglot.vehicles.IVehicle;

import java.util.List;

public interface ParkingStrategy {
    public boolean parkVehicle(List<ILevel> levels, IVehicle vehicle);
    public void unParkVehicle(List<ILevel> levels, IVehicle vehicle);
}
