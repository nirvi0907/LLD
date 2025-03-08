package elevator.elevator.requesthandler;

import elevator.building.Building;
import elevator.direction.Direction;
import elevator.elevator.Elevator;
import elevator.floor.Floor;
import elevator.request.Request;

public interface IElevatorRequestHandler {
    public void addRequest(Floor srcFloor);
    public Request getNextRequest();
}
