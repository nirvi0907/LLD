package movieticket.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theatre {
    private String name;
    private List<Show> movieShows = new ArrayList<>();

    public Theatre(String name, List<Show> movieShows) {
        this.name = name;
        this.movieShows = movieShows;
    }

    public List<Show> getMovieShows() {
        return movieShows;
    }
}
