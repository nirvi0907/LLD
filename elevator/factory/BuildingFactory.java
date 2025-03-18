package elevator.factory;

import elevator.building.Building;
import elevator.elevator.Elevator;
import elevator.elevator.requesthandler.ElevatorRequestHandler;
import elevator.elevator.requesthandler.IElevatorRequestHandler;
import elevator.floor.Floor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildingFactory {
    public static Building createBuilding(Config config) {
        Building building = new Building(config.getBuildingName());
        for (int floorsNum = 0; floorsNum < config.getNumFloors(); floorsNum++) {
            Floor floor = new Floor(floorsNum);
            building.addFloor(floor);
        }
        building.setName(config.getBuildingName());
        Map<Elevator, IElevatorRequestHandler> elevatorsHandlers = new HashMap<>();
        List<Elevator> elevators = new ArrayList<>();

        for (int elevatorNum = 0; elevatorNum < config.getNumElevators().size(); elevatorNum++) {
            Elevator elevator = new Elevator(elevatorNum, 10); // Assuming capacity is 10
            elevators.add(elevator);
            ElevatorRequestHandler elevatorHandler = new ElevatorRequestHandler(elevator);
            Thread elvatorHandlerThread = new Thread(elevatorHandler);
            elvatorHandlerThread.start();
            elevatorsHandlers.put(elevator, elevatorHandler);
            // Start the elevator request handler in a new thread
        }
        building.setElevators(elevators);
        building.setElevatorHandlers(elevatorsHandlers);
        return building;
    }
}
