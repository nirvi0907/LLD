package library;

import library.account.*;
import library.book.Book;
import library.book.IBook;

import java.time.LocalDate;
import java.util.Date;

public class demo {
    public static void main(String[] arg){
        IAccount account = new Librarian("Nirvi", "ab", "bj", 2);
        ILibrarian librarian = (ILibrarian) account;
        IBook book = new Book(1, "book1", "ab", LocalDate.now(), 12);
        IBorrower borrower = new Borrower("borrower1", "abc", "34", 1, 10);
        librarian.initiateBorrowBook(book, borrower);
    }
}
