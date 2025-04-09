package library.book;

import java.util.List;

public interface ICatalog {
    public List<IBook> getBooks();
    public void addBook(IBook book);
}
