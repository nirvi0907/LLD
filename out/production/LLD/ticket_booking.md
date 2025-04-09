# Ticket Booking
Ticket booking system
The system should allow users to view the list of movies playing in different theaters.
Users should be able to select a movie, theater, and show timing to book tickets.
The system should display the seating arrangement of the selected show and allow users to choose seats.
Users should be able to make payments and confirm their booking.
The system should handle concurrent bookings and ensure seat availability is updated in real-time.
The system should support different types of seats (e.g., normal, premium) and pricing.
The system should allow theater administrators to add, update, and remove movies, shows, and seating arrangements.
The system should be scalable to handle a large number of concurrent users and bookings.


Sytem- 
Show- start, end, seats, SeatViewer, SeatReserver
Theatre - city, name, location, Map<Movie, Show>
Movie- name, duration, rating, language
User- name, phoen, email, ShowViewer, SeatReserver, BookingHandler
- getShows(), researvSeats(Show, seats)--> ReservationInstance
- book(ReservationInstance, modeOfpayment)
PaymetnType - upi, card
BookingHandler - ReservationInstance, Payment
- 
ReservationInstance- seats reserved, show, theatre
ShowViewer- getShows(Theatre, movie), viewLstMovies()->Map<Theatre, List<Show>>,
SeatViewer- getSeats(Show)-->List<Seat>, num_seats_left
SeatReserver- (lock) reserveSeats(List<Seat>) (change status to reserved, and change left seats)---> ReservationInstance

SeatSttaus - available, reserved
Seat - SeatStatus, SeatType
SeatType - PremiumSeat, NormalSeat, GoldSeat

Ticket

Booking
Timing


Payment
Admin


user-> getShows(theatre, movie)->ShowViewer