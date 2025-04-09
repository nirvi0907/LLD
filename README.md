# LLD

Concepts:
When to Use Inheritance?
✔ When all subclasses truly share behavior
✔ When behavior won’t change dynamically
✔ When code duplication is minimal

When to Use Composition?
✔ When objects share behavior but don’t have an “is-a” relationship
✔ When a class needs multiple independent behaviors
✔ When behavior should change dynamically
✔ When inheritance forces irrelevant methods

what hapepn with inehritance is that lets say one subclass doesnt want to implentn certain function in super, then its better to use composition
meaning create an object of behaviour and use it in subclass.

Requirements

    The parking lot should have multiple levels, each level with a certain number of parking spots.
    The parking lot should support different types of vehicles, such as cars, motorcycles, and trucks.
    Each parking spot should be able to accommodate a specific type of vehicle.
    The system should assign a parking spot to a vehicle upon entry and release it when the vehicle exits.
    The system should track the availability of parking spots and provide real-time information to customers.
    The system should handle multiple entry and exit points and support concurrent access.

pros
cons/enhancements -
exceptions folder
when large number of parking lots are there-
   to make it fault tolerant - Store levels in a database (SQL or NoSQL) instead of keeping them in-memory.
Add more payment strategies


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





Library management
The library management system should allow librarians to manage books, members, and borrowing activities.
The system should support adding, updating, and removing books from the library catalog.
Each book should have details such as title, author, ISBN, publication year, and availability status.
The system should allow members to borrow and return books.
Each member should have details such as name, member ID, contact information, and borrowing history.
The system should enforce borrowing rules, such as a maximum number of books that can be borrowed at a time and loan duration.
The system should handle concurrent access to the library catalog and member records.
The system should be extensible to accommodate future enhancements and new features.



Ticket booking system
The system should allow users to view the list of movies playing in different theaters.
Users should be able to select a movie, theater, and show timing to book tickets.
The system should display the seating arrangement of the selected show and allow users to choose seats.
Users should be able to make payments and confirm their booking.
The system should handle concurrent bookings and ensure seat availability is updated in real-time.
The system should support different types of seats (e.g., normal, premium) and pricing.
The system should allow theater administrators to add, update, and remove movies, shows, and seating arrangements.
The system should be scalable to handle a large number of concurrent users and bookings.


