package movieticket.model;

public class Movie {
    String name;
    String duration;
    String language;
    String rating;

    public Movie(String name, String duration, String language, String rating) {
        this.name = name;
        this.duration = duration;
        this.language = language;
        this.rating = rating;
    }
}
