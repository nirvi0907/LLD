package LLD.parkinglot.spot;

import LLD.parkinglot.vehicles.IVehicle;
import LLD.parkinglot.vehicles.VehicleType;

public interface ISpot {
    public boolean unparkVehicle(IVehicle vehicle);
    public boolean parkVehicle(IVehicle vehicle);
    public boolean isAvailable(VehicleType vehicleType);
    }
