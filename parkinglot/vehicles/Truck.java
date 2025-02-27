package LLD.parkinglot.vehicles;
import LLD.parkinglot.vehicles.IVehicle;

public class Truck implements IVehicle{
    private String num;
    private VehicleType vehicleType;

    public Truck(String num, VehicleType vehicleType){
        this.num = num;
        this.vehicleType = vehicleType;
    }

    @Override
    public String getPlateNum() {
        return num;  // Example plate number, replace with actual logic if needed
    }
    @Override
    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
