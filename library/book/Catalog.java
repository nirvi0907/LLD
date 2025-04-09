package library.book;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements ICatalog{
    private List<IBook> books = new ArrayList<>();

    public void addBook(IBook book){
        books.add(book);
    }
    public List<IBook> getBooks(){
        return books;
    }
}
