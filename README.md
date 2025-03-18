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



Library management
The library management system should allow librarians to manage books, members, and borrowing activities.
The system should support adding, updating, and removing books from the library catalog.
Each book should have details such as title, author, ISBN, publication year, and availability status.
The system should allow members to borrow and return books.
Each member should have details such as name, member ID, contact information, and borrowing history.
The system should enforce borrowing rules, such as a maximum number of books that can be borrowed at a time and loan duration.
The system should handle concurrent access to the library catalog and member records.
The system should be extensible to accommodate future enhancements and new features.

actors
library, system, book, member, catalog


IBook- book- createdDate, price, name, bookStatus, author
BookStatus - reserved, available, not_available_in_library
ILibrarian - uses BorrowingHandler, methods - intiiateborrowBook,  retrunBook(member, book)
IAccount - name, id, phone
Librarian uses IAccount, ILibrarian  


BorrowingHandler- uses IBorrower,IBorringRules book, methods - intiiateborrowBook(member, book), retrunBook(member, book)
Subject- notify()
IBorrowerNotifier- uses List<IBorrower>,method s-  addBorrower(IBorrower), remove, subject.notify(message)
IBorrowerOverDue- uses List<IBorrower>, mehtods - subject.notify(message)
system-> IBorrowerOverDue //keep running
IBorrower-  BorrowingRecord, List<book, start,end> pastBorrowedBooks, List<book, starttime> currentBorrowedBooks, lastBorrowedDate, 
maxBooks

Borrower - implemnts Iaccount  & IBorrowingHistory & 
BorrowingStatus- borrowed, not_borrowed, overdue
ILibrarian-   librarianMgr - add(book), updateBook(book, sttaus, ca), remove(book)
IAccount 

1. members, librarianc ceates
2. borrow book
   3. if available book and maxbooks 
   4. member update - create time when borowed, maxBooks+1, add as notifier
   5. book status reserved
6. kee runnign to check if rule broke, overdue books etc
7. Retrun book
   8. check if overdue, get money
   9. reduce currentbook, put in pastbook, update history, amxBook-1=
   10. bookstatus free