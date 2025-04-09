package movieticket;

import movieticket.model.*;
import movieticket.services.PaymentService;
import movieticket.services.SeatReservationService;
import movieticket.services.ShowService;

import java.lang.System;
import java.time.LocalDate;
import java.util.*;

public class client {
    public static void main(String[] ar) {

        List<Show> shows = new ArrayList<>();

        Movie movie1 = new Movie("movie1", "2", "eng", "A");

        Hall hall1 = new Hall("hall1", 10, SeatType.NORMAL);
        Show show1 = new Show(movie1, LocalDate.now(), LocalDate.now(), hall1);

        shows.add(show1);
        Movie movie2 = new Movie("movie2", "2", "eng", "A");

        Theatre theatre1 = new Theatre("Theatre1", shows);
        ShowService service = new ShowService();
        List<Show> showsInTheatre = service.getShows(theatre1);
        Show show = showsInTheatre.get(0);
//        SeatReservationService seatService = new SeatReservationService();
//        List<Seat> seats = seatService.getSeats(show);
//        for(Seat seat:seats)
//            System.out.println(" seats "+seat.getNum());
//        seatService.reserveSeats(show, new ArrayList<>(Arrays.asList("A1", "A2")));
//        seatService.bookSeats(seatService.getReserveSeats());

    }
}
