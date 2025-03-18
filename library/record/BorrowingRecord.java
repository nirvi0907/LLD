package library.record;

import library.account.Borrower;
import library.account.IBorrower;
import library.book.Book;
import library.book.IBook;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BorrowingRecord implements IBorrowingRecord{
    private Map<IBook, List<String>> pastBooks = new HashMap<>();
    private Map<IBook, LocalDate> curBooks = new HashMap<>();

    public Map<IBook, List<String>> getRecord(){
        return pastBooks;
    }
    public Map<IBook, LocalDate> getCurrentBooks(){
        return curBooks;
    }
    public void addCurBook(IBook book){
        curBooks.put(book, LocalDate.now());
    }
}


