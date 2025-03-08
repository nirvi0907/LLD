package elevator.button;

import elevator.direction.Direction;

public class Button {
    private Direction direction;
    public Button(Direction direction){
        this.direction = direction;
    }
    public Direction getDirection(){
        return direction;
    }
}
