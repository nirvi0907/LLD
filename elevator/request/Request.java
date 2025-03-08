package elevator.request;

import elevator.floor.Floor;

public class Request {
    private Floor srcFloor;
    public Request(Floor srcFloor){
        this.srcFloor =srcFloor;
    }
}
