package library.book;

import java.time.LocalDate;

public interface IBook {
    public  double getPrice();
    public String getName();
    public int getId();
    public String getAuthor();
    public LocalDate getCreatedDate();
    public BookStatus getStatus();
    public void setStatus(BookStatus status);
}
