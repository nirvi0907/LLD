# LLD
Requirements

    The parking lot should have multiple levels, each level with a certain number of parking spots.
    The parking lot should support different types of vehicles, such as cars, motorcycles, and trucks.
    Each parking spot should be able to accommodate a specific type of vehicle.
    The system should assign a parking spot to a vehicle upon entry and release it when the vehicle exits.
    The system should track the availability of parking spots and provide real-time information to customers.
    The system should handle multiple entry and exit points and support concurrent access.


Patterns applied

Factory
Observer
Strategy

# Elevator
## Requirements

The elevator system should consist of multiple elevators serving multiple floors.
Each elevator should have a capacity limit and should not exceed it.
Users should be able to request an elevator from any floor and select a destination floor.
The elevator system should efficiently handle user requests and optimize the movement of elevators to minimize waiting time.
The system should prioritize requests based on the direction of travel and the proximity of the elevators to the requested floor.
The elevators should be able to handle multiple requests concurrently and process them in an optimal order.
The system should ensure thread safety and prevent race conditions when multiple threads interact with the elevators.


System->elevator->floors
elevator - capacity limit

user->floor->elevator

requestElevator(User, floor, button)
button- up and donw

IUser-> phone, name

    IRequester-> requestEle[Elevator.java](elevator/elevator/Elevator.java)vator(floor, button)
StandardUser-> current floor
StandardUser imeplentns IUser

ElevatorRequestor (strategy)-> implements IRequestor


system->elevatorRequestor->requestElevator

strategy 
neatrest first, source floor, elevators




