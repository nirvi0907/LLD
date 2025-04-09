package movieticket.services;

import movieticket.handlers.SeatHandler;
import movieticket.model.*;

import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SeatReservationService {

    private SeatHandler handler;
    public SeatReservationService(SeatHandler handler){
        this.handler = handler;
    }

    public void reserveSeats(Show show, List<String> seatNum){
       handler.reserveSeats(show, seatNum);
    }

//    public boolean checkIfReserved(Hall hall){
//        for (Seat seat : hall.getSeats()) {
//            if (seat.getStatus().equals(SeatStatus.)
//    }
    public void bookSeats(){
//        if(checkIfReserved(show.getHall())){
//            throw new BookBeforReserveException(" Please select/reserve the seats first");
//        }
        handler.bookSeats();
    }
    public List<Seat> getSeats(Show show){//if we dont want consistent view of seats then we dont lock
        return handler.getSeats(show);
    }

}
