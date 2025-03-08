package elevator.elevator;

import elevator.elevator.panel.Panel;

public interface IElevator {
    public Panel getPanel();
    public int getCurrentCap();
    public int getTotalCap();
    public void run();
}
