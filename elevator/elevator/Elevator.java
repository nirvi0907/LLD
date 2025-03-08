package elevator.elevator;

import elevator.direction.Direction;
import elevator.door.Door;
import elevator.door.DoorState;
import elevator.elevator.requesthandler.ElevatorRequestHandler;
import elevator.elevator.requesthandler.IElevatorRequestHandler;
import elevator.request.Request;

import java.util.List;

public class Elevator {
    private Direction direction;
    private int currentFloor = 0;
    private int num;
    private Door door;
    private IElevatorRequestHandler handler;

    public Elevator(int num, IElevatorRequestHandler handler){
        this.num = num;
        this.direction = Direction.STILL;
        this.door = new Door();
        this.handler = handler;
    }
    public IElevatorRequestHandler getRequestHandler(){
        return handler;
    }
    public void setCurrentFloor(int floor){
        this.currentFloor = floor;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }

    public int getNum(){
        return num;
    }
    public Door getDoor()
    {
        return door;
    }
    public Request run(){
        return handler.getNextRequest();
    }


}
