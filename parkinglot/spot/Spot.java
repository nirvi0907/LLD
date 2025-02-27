package LLD.parkinglot.spot;
import LLD.parkinglot.vehicles.IVehicle;
import LLD.parkinglot.vehicles.VehicleType;

public class Spot implements ISpot{
    private int num;
    private IVehicle vehicle;
    private VehicleType vehicleType;

    public Spot(int num, VehicleType vehicleType){
        this.num = num;
        this.vehicleType = vehicleType;
    }

    public int getNum(){
        return num;
    }

    public boolean isAvailable(VehicleType vehicleType){
        if(this.vehicle==null && this.vehicleType.equals(vehicleType))
            return true;
        return false;
    }
    public boolean parkVehicle(IVehicle vehicle){
        if(isAvailable(vehicle.getVehicleType())){
            this.vehicle = vehicle;
            return true;
        }
        return false;
    }

    public boolean unparkVehicle(IVehicle vehicle) {
        if (this.vehicle!=null && this.vehicleType.equals(vehicleType) && this.vehicle.equals(vehicle)){
            this.vehicle = null;
            return true;
        }

        return false;
    }

}
