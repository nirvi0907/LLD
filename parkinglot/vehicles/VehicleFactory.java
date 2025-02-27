package LLD.parkinglot.vehicles;

import java.util.ArrayList;
import java.util.List;

public class VehicleFactory {
    public static List<IVehicle> createVehicles(List<VehicleType> vehicleTypes) {
        List<IVehicle> vehicles = new ArrayList<>();
        for(VehicleType vehicleType:vehicleTypes) {
            switch (vehicleType) {
                case VehicleType.CAR:
                    vehicles.add(new Car("car1", VehicleType.CAR));
                    continue;
                case VehicleType.TRUCK:
                    vehicles.add(new Truck("truck1", VehicleType.TRUCK));
            }
        }
        return vehicles;
    }
}
