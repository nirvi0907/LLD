package elevator.user;

import elevator.building.Building;
import elevator.direction.Direction;
import elevator.elevator.Elevator;
import elevator.elevator.requesthandler.IElevatorFinder;
import elevator.elevator.requesthandler.IElevatorRequestHandler;
import elevator.floor.Floor;

public class User implements IUser, IRequestor{
    private IElevatorFinder finder;
    private String name;
    public User(String name, IElevatorFinder finder){
        this.name = name;
        this.finder = finder;
    }
    public String getName(){
        return name;
    }
    public void requestElevator(Building building, Floor floor, Direction direction){
        //todo: open door, press floor, elevator moves

        System.out.println("User :"+ name+ " has requested elevator from floor "+ floor.getNum()+ " to go "+ direction);

        finder.requestElevator(building, floor);
    }
}
