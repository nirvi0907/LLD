package movieticket.model;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    List<Seat> seats = new ArrayList<>();
    String name;
    private int cap;
    public Hall(String name, int cap, SeatType type){
        this.name = name;
        this.cap = cap;
        for(int i=0;i<cap;i++)
        {
            seats.add(new Seat("A"+i, 10, SeatStatus.AVAILABLE, type));
        }
    }
    public List<Seat> getSeats(){
        return seats;
    }

    public int getCap() {
        return cap;
    }

    public String getName() {
        return name;
    }
}
