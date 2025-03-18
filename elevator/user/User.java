package elevator.user;

import elevator.building.Building;
import elevator.direction.Direction;
import elevator.elevator.Elevator;
import elevator.elevator.requesthandler.IElevatorFinder;
import elevator.elevator.requesthandler.IElevatorRequestHandler;
import elevator.floor.Floor;

public class User implements IUser{
    private IElevatorFinder finder;
    private String name;
    public User(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
}
