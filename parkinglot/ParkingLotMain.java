package LLD.parkinglot;

import LLD.parkinglot.vehicles.*;

import java.util.*;


//map-spot:boolean

public class ParkingLotMain{
    public static void main(String[] args) {
        Map<Integer, Integer> levelSpotNumMap = new HashMap<>();
        levelSpotNumMap.put(1, 2);
        levelSpotNumMap.put(2, 0);
        levelSpotNumMap.put(3, 0);
        ParkingLot parkingLot = ParkingFactory.createParkingLot(levelSpotNumMap);

        List<IVehicle> vehicles = VehicleFactory.createVehicles(new ArrayList<>
                (Arrays.asList(VehicleType.TRUCK, VehicleType.CAR)));
        for(IVehicle vehicle:vehicles) {
            parkingLot.parkVehicle(vehicle);
            parkingLot.unParkVehicle(vehicle);
        }

//        IVehicle truck2 = new Truck("truck2", VehicleType.TRUCK);
//        parkingLot.parkVehicle(truck2);
//        parkingLot.unParkVehicle(truck);
        //factory pattern
    }
}