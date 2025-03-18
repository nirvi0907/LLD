package library.handler;

import library.account.IBorrower;
import library.book.Book;
import library.book.IBook;

public interface IBorrowingHandler {
    public void initiateBorrowBook(IBook book);
    public void initiateReturnBook(IBook book, IBorrower borrower);
    public void addCurBook(IBook book);
}
