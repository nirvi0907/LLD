package elevator.user;

import elevator.building.Building;
import elevator.direction.Direction;
import elevator.elevator.Elevator;
import elevator.floor.Floor;

public interface IRequestor {
    public void requestElevator(Building building, Floor floor, Direction direction);
}
