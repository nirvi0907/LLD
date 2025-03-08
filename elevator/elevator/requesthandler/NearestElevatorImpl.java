package elevator.elevator.requesthandler;

import elevator.building.Building;
import elevator.direction.Direction;
import elevator.elevator.Elevator;
import elevator.floor.Floor;

import java.util.List;

public class NearestElevatorImpl implements IElevatorFinder{

    public void requestElevator(Building building, Floor srcFloor){
        int minFloorDiff = Integer.MAX_VALUE;
        Elevator nearestElevator = null;
        for(Elevator elevator:building.getElevators()){
            if(minFloorDiff>Math.abs(elevator.getCurrentFloor()-srcFloor.getNum())){
                minFloorDiff = elevator.getCurrentFloor()-srcFloor.getNum();
                nearestElevator = elevator;
            }
        }
        if(nearestElevator!=null)
            System.out.println(" Elevator arrived "+ nearestElevator.getNum());
        else
            System.out.println(" Elevator not arrived,s till waiting ");
        IElevatorRequestHandler handler = nearestElevator.getRequestHandler();
        handler.addRequest(srcFloor);
//        return nearestElevator;
    }

}

