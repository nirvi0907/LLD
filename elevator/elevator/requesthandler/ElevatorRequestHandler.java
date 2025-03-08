package elevator.elevator.requesthandler;

import elevator.building.Building;
import elevator.direction.Direction;
import elevator.elevator.Elevator;
import elevator.floor.Floor;
import elevator.request.Request;

import java.util.ArrayList;
import java.util.List;

public class ElevatorRequestHandler implements IElevatorRequestHandler{
    private List<Request> requests  = new ArrayList<>();
    private int totalCap;

    public ElevatorRequestHandler(int totalCap){
        this.totalCap = totalCap;
    }
    public synchronized void addRequest(Floor srcFloor){
        Request request = new Request(srcFloor);
        if(totalCap>requests.size()){
            requests.add(request);
            System.out.println("Elevator  added request: " + request);

            notifyAll();
        }

    }
    public synchronized Request getNextRequest(){
        while(true) {
            if (!requests.isEmpty()) {
                return requests.remove(0);
            }
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
