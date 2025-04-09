package movieticket.handlers;

import movieticket.model.*;
import movieticket.services.PaymentService;

import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SeatHandler {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Condition writeCompelted = lock.writeLock().newCondition();
    private List<Seat> reservedSeats;
    private Show show;

    public void reserveSeats(Show show, List<String> seatNum){

        lock.writeLock().lock();
//        ReservationInstance reservationInstance = null;
        try {
            Hall hall = show.getHall();
            List<Seat> seats = new ArrayList<>();
            System.out.println(" Reserving seats in Hall "+hall.getName());
            for (Seat seat : hall.getSeats()) {
                if (seatNum.contains(seat.getNum())) {
                    seat.setStatus(SeatStatus.RESERVED);
                    seats.add(seat);
                    System.out.println(" Seat : " + seat.getNum() + " : " + " is reserved");
                }
            }
            this.reservedSeats = seats;
            this.show = show;
//            writeCompelted.signalAll();
        }finally{
            lock.writeLock().unlock();
        }
    }

    //    public boolean checkIfReserved(Hall hall){
//        for (Seat seat : hall.getSeats()) {
//            if (seat.getStatus().equals(SeatStatus.)
//    }
    public void bookSeats(){
//        if(checkIfReserved(show.getHall())){
//            throw new BookBeforReserveException(" Please select/reserve the seats first");
//        }
        PaymentService service = new PaymentService();
        service.processPayment(show, reservedSeats, PaymentMode.UPI);
        System.out.println(" Seats booked ");
    }
    public List<Seat> getSeats(Show show){//if we dont want consistent view of seats then we dont lock
        System.out.println(" getting seats in hall "+show.getHall().getName());
        lock.readLock().lock();
        try {
            return show.getHall().getSeats();
        }finally{
            lock.readLock().unlock();
        }
    }


}
