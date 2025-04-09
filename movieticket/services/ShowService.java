package movieticket.services;

import movieticket.model.Show;
import movieticket.model.Theatre;

import java.util.ArrayList;
import java.util.List;

public class ShowService {
    public List<Show> getShows(Theatre theatre){
        return theatre.getMovieShows();
    }
}
