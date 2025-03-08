package elevator.factory;

import elevator.building.Building;
import elevator.elevator.Elevator;
import elevator.elevator.requesthandler.ElevatorRequestHandler;
import elevator.floor.Floor;

import java.util.ArrayList;
import java.util.List;

public class BuildingFactory {
    public static Building createBuilding(Config config){
        Building building = new Building(config.getBuildingName());
        for(int floorsNum=0;floorsNum<config.getNumFloors();floorsNum++){
            Floor floor = new Floor(floorsNum);
            building.addFloor(floor);
        }
        building.setName(config.getBuildingName());
        List<Elevator> elevators = new ArrayList<>();
        for(int elevatorNum=0;elevatorNum<config.getNumElevators().size();elevatorNum++){
            Elevator elevator = new Elevator(elevatorNum, new ElevatorRequestHandler(10));
            elevators.add(elevator);
            new Thread(elevator::run).start();
        }
        building.setElevators(elevators);
        return building;
    }
}
