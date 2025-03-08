package elevator.building;

import elevator.elevator.Elevator;
import elevator.floor.Floor;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Floor> floors = new ArrayList<>();
    private String name;
    private List<Elevator> elevators;
    public Building(String name){
        this.name = name;
    }
    public void addFloor(Floor floor){
        this.floors.add(floor);
    }
    public List<Elevator> getElevators(){
        return elevators;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setElevators(List<Elevator> elevators){
        this.elevators = elevators;
    }

}
