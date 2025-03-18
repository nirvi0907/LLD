package elevator.button;

import elevator.building.Building;
import elevator.elevator.Elevator;
import elevator.elevator.requesthandler.ElevatorRequestHandler;
import elevator.elevator.requesthandler.IElevatorFinder;
import elevator.elevator.requesthandler.IElevatorRequestHandler;
import elevator.floor.Floor;

import java.util.Map;

public class ButtonPressHandler {
    private IElevatorFinder finder;
    private IElevatorRequestHandler handler;

    public ButtonPressHandler(IElevatorFinder finder) {
        this.finder = finder;
    }

    public void pressButton(Building buildingObj, Floor floorObj) {
        Elevator elevator = this.finder.requestElevator(buildingObj, floorObj);
        for(Map.Entry<Elevator, IElevatorRequestHandler> entry : buildingObj.getElevatorHandlers().entrySet()){
            if(entry.getKey().getNum()==elevator.getNum())
                entry.getValue().addRequest(floorObj);
        }


        // Add request to elevator request handler
         // This will trigger the request to be added
    }
}
