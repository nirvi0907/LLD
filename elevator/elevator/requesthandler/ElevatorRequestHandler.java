package elevator.elevator.requesthandler;

import elevator.elevator.Elevator;
import elevator.floor.Floor;
import elevator.request.Request;

import java.util.ArrayList;
import java.util.List;

public class ElevatorRequestHandler implements IElevatorRequestHandler, Runnable {
    private List<Request> requests = new ArrayList<>();
    private Elevator elevator;

    // Added synchronization lock for requests list
    private final Object requestLock = new Object();

    public ElevatorRequestHandler(Elevator elevator) {
        this.elevator = elevator;
    }

    // Modified addRequest method with synchronization
    public void addRequest(Floor srcFloor) {
        synchronized (requestLock) {  // Synchronizing block for thread safety
            Request request = new Request(srcFloor);
            if (elevator.getTotalCap() > requests.size()) {
                requests.add(request);
                System.out.println("Elevator added request: " + request);
                requestLock.notifyAll();  // Notify the waiting thread that a request is added
            }
        }
    }

    // Modified getNextRequest method with synchronization
    public Request getNextRequest() {
        synchronized (requestLock) {  // Synchronizing block to access the shared requests list
            while (requests.isEmpty()) {
                try {
                    requestLock.wait(); // Wait until a new request is added
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return requests.remove(0);        // Return and remove the first request
        }
    }

    // The run method for handling elevator requests in a continuous loop
    @Override
    public void run() {
        while (true) {
            Request request = getNextRequest();  // Get the next request
            System.out.println("Processing request: " + request);  // Processing request logic
            // Simulate elevator processing logic (moving elevator, etc.)
        }
    }
}
