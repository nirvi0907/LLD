package LLD.parkinglot;
import java.util.List;

import LLD.parkinglot.Spot;
import LLD.parkinglot.vehicles.IVehicle;

public class Level {
    private List<Spot> spots = null;
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
    public List<Spot> getSpots(){
        return spots;
    }

    public void createSpots(){
        for(int spotNum: totalSpotCap){
            Spot spot = new Spot(spotNum);
            this.spots.add(spot);
        }
    }

    public boolean parkVehicle(IVehicle vehicle){
        if allocateSpot(vehicle)
            return true;

        return false;
    }

    public boolean allocateSpot(IVehicle vehicle){
        if (this.curSpotCap<this.totalSpotCap){
            this.curSpotCap+=1
            for(Spot spot:spots){
                if(spot.parkVehicle(vehicle)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean unparkVehicle(IVehicle vehicle){
        for(Spot spot:spots){
            if(spot.unparkVehicle(vehicle))
                return true;
        }
        return false;
    }
}
