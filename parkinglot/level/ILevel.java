package LLD.parkinglot.level;

import LLD.parkinglot.spot.ISpot;
import LLD.parkinglot.vehicles.IVehicle;

import java.util.List;

public interface ILevel {

    public List<ISpot> getSpots();

    public void createSpots();

    public boolean parkVehicle(IVehicle vehicle);
    //available alots
    //unavailable slots
    public boolean allocateSpot(IVehicle vehicle);

    public boolean unparkVehicle(IVehicle vehicle);

    public int getlevelNum();
}

