package elevator.door;

public class Door {
    private DoorState state;
    public Door(){
        this.state = DoorState.CLOSE;
    }
    public void setState(DoorState state){
        this.state = state;
    }

}
