package elevator.elevator.panel;

import elevator.floor.Floor;

import java.util.List;

public interface IPanel {
    public List<Floor> getFloors();
    public List<Floor> getPressedFloors();
}
