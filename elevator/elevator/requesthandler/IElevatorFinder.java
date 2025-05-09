package elevator.elevator.requesthandler;

import elevator.building.Building;
import elevator.direction.Direction;
import elevator.elevator.Elevator;
import elevator.floor.Floor;

public interface IElevatorFinder {
    public Elevator requestElevator(Building building, Floor srcFloor);
}
