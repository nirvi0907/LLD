package library.book;

import java.time.LocalDate;
import java.util.Date;

public class Book implements IBook{
    private double price;
    private String name;
    private int id;
    private String author;
    private BookStatus status;
    private LocalDate createdDate;

    public Book(int id, String name, String author, LocalDate createdDate, double price){
        this.id = id;
        this.name =name;
        this.author = author;
        this.createdDate = createdDate;
        this.price= price;
        this.status = BookStatus.AVAILABLE;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getAuthor(){
        return author;
    }
    public LocalDate getCreatedDate(){
        return createdDate;
    }
    public BookStatus getStatus(){
        return status;
    }
    public void setStatus(BookStatus status){
        this.status = status;
    }
}
