package library.account;

import library.book.IBook;

public interface ILibrarian {
    public void initiateBorrowBook(IBook book, IBorrower borrower);
    public void initiateReturnBook(IBook book, IBorrower borrower);
}
