    package elevator.button;

    import elevator.building.Building;
    import elevator.direction.Direction;
    import elevator.elevator.requesthandler.IElevatorFinder;
    import elevator.floor.Floor;

    public class Button {
        private Direction direction;
        public Button(Direction direction){
            this.direction = direction;
        }
        public Direction getDirection(){
            return direction;
        }

    }
