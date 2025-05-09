package LLD.parkinglot.vehicles;

public class Car implements IVehicle {
    private String num;
    private VehicleType vehicleType;

    public Car(String num, VehicleType vehicleType){
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
