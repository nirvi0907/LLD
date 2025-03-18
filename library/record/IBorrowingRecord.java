package library.record;

import library.account.IBorrower;
import library.book.Book;
import library.book.IBook;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface IBorrowingRecord {
    public Map<IBook, List<String>> getRecord();
    public Map<IBook, LocalDate> getCurrentBooks();
    //todo record handler
    public void addCurBook(IBook book);
}
