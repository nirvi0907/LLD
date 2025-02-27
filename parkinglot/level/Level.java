package LLD.parkinglot.level;
import java.util.List;
import java.util.ArrayList;

import LLD.parkinglot.spot.ISpot;
import LLD.parkinglot.spot.Spot;
import LLD.parkinglot.vehicles.IVehicle;
import LLD.parkinglot.vehicles.VehicleType;

public class Level implements ILevel{
    private List<ISpot> spots = new ArrayList<>();
    private int levelNum;
    private int totalSpotCap;
    private int curSpotCap;

    public Level(int levelNum, int totalSpotCap){
        this.levelNum = levelNum;
        this.totalSpotCap = totalSpotCap;
        createSpots();
    }

    public int getlevelNum(){
        return levelNum;
    }
    public List<ISpot> getSpots(){
        return spots;
    }

    public void createSpots(){
        //50:50 cars, trucks
        for (int i = 1; i<=Math.round(totalSpotCap/2); i++) {
            ISpot spot = new Spot(i, VehicleType.CAR);
            this.spots.add(spot);
        }
        for (int i = 1; i<=Math.round(totalSpotCap/2); i++) {
            ISpot spot = new Spot(i, VehicleType.TRUCK);
            this.spots.add(spot);
        }
    }

    public boolean parkVehicle(IVehicle vehicle){
        if (allocateSpot(vehicle))
            return true;

        return false;
    }
//available alots
    //unavailable slots
    public boolean allocateSpot(IVehicle vehicle){
        if (this.curSpotCap<this.totalSpotCap){
            this.curSpotCap+=1;
            for(ISpot spot:spots){
                if(spot.parkVehicle(vehicle)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean unparkVehicle(IVehicle vehicle){
        for(ISpot spot:spots){
            if(spot.unparkVehicle(vehicle))
                return true;
        }

        return false;
    }
}
