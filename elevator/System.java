package elevator;

import elevator.building.Building;
import elevator.button.Button;
import elevator.direction.Direction;
import elevator.elevator.Elevator;
import elevator.elevator.requesthandler.NearestElevatorImpl;
import elevator.factory.BuildingFactory;
import elevator.factory.Config;
import elevator.floor.Floor;
import elevator.user.User;

public class System {
    public void requestElevator(Config config, User user){
        Building buildingObj = createBuilding(config);
        Floor floorObj = new Floor(1);
        buildingObj.addFloor(floorObj);

        Button button = new Button(Direction.UP);

        user.requestElevator(buildingObj, floorObj, button.getDirection());

    }
    public Building createBuilding(Config config){
        Building building = BuildingFactory.createBuilding(config);
        return building;
//        String name, int numFloors, List<Integer> elevatorCap
    }
}
