package library.handler;

import library.Notifier.Notifier;
import library.account.Borrower;
import library.account.IBorrower;
import library.account.INotifiable;
import library.book.Book;
import library.book.BookStatus;
import library.book.IBook;
import library.overdue.IBorrowingOverdue;
import library.record.IBorrowingRecord;
import library.rules.BorrowingRules;
import library.rules.IBorrowingRules;

public class BorrowingHandler implements IBorrowingHandler
{
    private IBorrower borrower;
    private IBorrowingRules rules;
    private IBorrowingRecord record;

    public BorrowingHandler(IBorrower borrower){
        this.borrower = borrower;
        this.rules = borrower.getRuler();
        this.record = borrower.getRecord();
    }
    public void initiateBorrowBook(IBook book){
//        1. members, librarianc ceates
//        2. borrow book
//        3. if available book and maxbooks
//        4. member update - create time when borowed, maxBooks+1, add as notifier
//        5. book status reserved
        if(book.getStatus().equals(BookStatus.NOT_AVAILABLE) || this.rules.isMaxBookReached()){
            throw new IllegalArgumentException(" Book isnt available : "+book.getName());
        }
        addCurBook(book);
        book.setStatus(BookStatus.NOT_AVAILABLE);
        INotifiable notifier = (INotifiable) this.borrower;
        notifier.update("book reserved");

    }
    public void initiateReturnBook(IBook book, IBorrower borrower){

    }
    public void addCurBook(IBook book){
        this.record.addCurBook(book);
    }
}
