package movieticket.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Show {
    LocalDate start;
    LocalDate end;
    Hall hall;
    Movie movie;
    public Show(Movie movie, LocalDate start, LocalDate end, Hall hall){
        this.movie = movie;
        this.start = start;
        this.end = end;
        this.hall = hall;

    }
    public Hall getHall(){
        return hall;
    }

}
