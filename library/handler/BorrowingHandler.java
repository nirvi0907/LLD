package library.handler;

import library.Notifier.Notifier;
import library.account.Borrower;
import library.account.IBorrower;
import library.account.INotifiable;
import library.book.*;
import library.book.search.BookSearcher;
import library.book.search.IBookSearcher;
import library.lock.LibraryLock;
import library.overdue.IBorrowingOverdue;
import library.record.IBorrowingRecord;
import library.rules.BorrowingRules;
import library.rules.IBorrowingRules;

import java.time.LocalTime;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BorrowingHandler implements IBorrowingHandler
{
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private IBorrower borrower;
    private IBorrowingRules rules;
    private IBorrowingRecord record;
    private Notifier notifer;

    public BorrowingHandler(IBorrower borrower, Notifier notifier){
        this.borrower = borrower;
        this.rules = borrower.getRuler();
        this.record = borrower.getRecord();
        this.notifer = notifier;
    }
//    public IBook searchBook(String name){
//        LibraryLock.lock.readLock().lock();
//        ICatalog catalog = new Catalog();
//        IBookSearcher searcher = new BookSearcher(catalog);
//        return searcher.searchBook(name);
//    }
    public void initiateBorrowBook(IBook book){
        LibraryLock.lock.writeLock().lock();
//        1. members, librarianc ceates
//        2. borrow book
//        3. if available book and maxbooks
//        4. member update - create time when borowed, maxBooks+1, add as notifier
//        5. book status reserved
        try{
            Thread.sleep(10);
            if(book.getStatus().equals(BookStatus.NOT_AVAILABLE) || this.rules.isMaxBookReached()){
                System.out.println("not avaialbel book");
                throw new IllegalArgumentException(" Book isnt available : "+book.getName());
            }
            System.out.println(LocalTime.now() + " | " + Thread.currentThread().getName() + " has ACQUIRED WRITe lock");

            System.out.println(Thread.currentThread().getName() + " is borrowing book: " + book);
            System.out.println(LocalTime.now() + " | Waiting threads: " + LibraryLock.lock.getQueueLength());


            addCurBook(book);
            book.setStatus(BookStatus.NOT_AVAILABLE);

            notifer.notifyBorrower(borrower, "book reserved");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            LibraryLock.lock.writeLock().unlock();
        }

    }
    public void initiateReturnBook(IBook book, IBorrower borrower){
    }
    public void addCurBook(IBook book){
        this.record.addCurBook(book);
    }
}
