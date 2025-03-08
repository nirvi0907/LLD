package elevator.factory;

import java.util.List;

public class Config {
    private int numFloors;
    private String buildingName;
    private List<Integer> elevators;
    public Config(String name, int numFloors, List<Integer> elevators){
        this.buildingName = name;
        this.numFloors = numFloors;
        this.elevators = elevators;
    }
    public String getBuildingName(){
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public  void setNumFloors(int numFloors){
        this.numFloors = numFloors;
    }
    public void setNumElevators(List<Integer> elevators){
        this.elevators = elevators;
    }

    public int getNumFloors() {
        return numFloors;
    }
    public List<Integer> getNumElevators(){
        return elevators;
    }
}
