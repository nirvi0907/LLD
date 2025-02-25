package LLD.parkinglot;
import LLD.parkinglot.vehicles.IVehicle;

public class Spot {
    public int num;
    public List<IVehicle> vehicles;
    public int totalCap;
    public int curCap=0;
    public Spot(int num, int totalCap){
        this.num = num;
        this.totalCap = totalCap;
    }

    public int getNum(){
        return num;
    }

    public boolean isAvailable(){
        if(this.curCap<this.totalCap)
            return true;
        return false;
    }
    public boolean parkVehicle(IVehicle vehicle){
        if(isAvailable()){
            this.vehicles.add(vehicle)
            return true;
        }
        return false;
    }

    public boolean unparkVehicle(IVehicle vehicle){
        if(vehicles.contains(vehicle))
            return true;
        return false;
    }

}
