package elevator;

import elevator.building.Building;
import elevator.elevator.Elevator;
import elevator.elevator.requesthandler.NearestElevatorImpl;
import elevator.factory.Config;
import elevator.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class client {
    public static void main(String[] args){
        System system = new System();

        Config config = new Config("PTP", 5, new ArrayList<>(Arrays.asList(10,5,2)));
        User userObj = new User("Nirvi");
        Building building = system.createBuilding(config);
//        List<Elevator> elevators = building.getElevators();
        system.requestElevator(config, userObj);
    }
}
