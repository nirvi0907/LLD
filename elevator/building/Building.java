package elevator.building;

import elevator.elevator.Elevator;
import elevator.elevator.IElevator;
import elevator.elevator.requesthandler.IElevatorRequestHandler;
import elevator.floor.Floor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Building {
    private List<Floor> floors = new ArrayList<>();
    private String name;
    private List<Elevator> elevators;
    private Map<Elevator, IElevatorRequestHandler> handlerElevatorMap = new HashMap<>();
    public Building(String name){
        this.name = name;
    }
    public void addFloor(Floor floor){
        this.floors.add(floor);
    }
    public void setElevators(List<Elevator> elevators){
        this.elevators = elevators;
    }
    public List<Elevator> getElevators(){
        return elevators;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setElevatorHandlers(Map<Elevator, IElevatorRequestHandler> handlerElevatorMap){
        this.handlerElevatorMap = handlerElevatorMap;
    }
    public Map<Elevator, IElevatorRequestHandler> getElevatorHandlers(){
        return handlerElevatorMap;
    }

}
