package LLD.parkinglot;
import LLD.parkinglot.vehicles.*;
import LLD.parkinglot.customer.*;
import java.util.*;
//map-spot:boolean

public class ParkingLotMain{
    public static void main(String[] args) {
        Map<Integer, Integer> levelSpotNumMap = new HashMap<>();
        levelSpotNumMap.put(1, 2);
        levelSpotNumMap.put(2, 0);
        levelSpotNumMap.put(3, 0);
        ParkingLot parkinglot = ParkingFactory.createParkingLot(levelSpotNumMap);

        List<IVehicle> vehicles = VehicleFactory.createVehicles(new ArrayList<>
                (Arrays.asList(VehicleType.TRUCK, VehicleType.CAR)));

        LLD.parkinglot.customer.ICustoemr customer = new Customer("nirvi", "12", "@gmail.com");
        LLD.parkinglot.realtime.IParkingLotRealTimeInfoMgr parkinglotRealTimeMgr = parkinglot.getParkingLotRealTimeMgr();

        parkinglotRealTimeMgr.addObserver(customer);
        for(IVehicle vehicle:vehicles) {
            parkinglot.parkVehicle(vehicle);
            parkinglotRealTimeMgr.updateObserver("Parked vehicle");

            parkinglot.unParkVehicle(vehicle);
            parkinglotRealTimeMgr.updateObserver("Unparked vehicle");

        }
//        IVehicle truck2 = new Truck("truck2", VehicleType.TRUCK);
//        parkingLot.parkVehicle(truck2);
//        parkingLot.unParkVehicle(truck);
        //factory pattern
    }



}