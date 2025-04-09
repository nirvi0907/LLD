package library.book.search;

import library.book.IBook;
import library.book.ICatalog;
import library.lock.LibraryLock;

import java.time.LocalTime;

public class BookSearcher implements IBookSearcher{
    private ICatalog catalog;
    public BookSearcher(ICatalog catalog){
        this.catalog = catalog;
    }
    public IBook searchBook(String name){
        try{
//        Thread.sleep(500);
        while (LibraryLock.lock.hasQueuedThreads()) {
            System.out.println(LocalTime.now() + " | Waiting threads: " + LibraryLock.lock.getQueueLength());
        }
        LibraryLock.lock.readLock().lock();
            System.out.println(LocalTime.now() + " | Waiting threads: " + LibraryLock.lock.getQueueLength());

            System.out.println(LocalTime.now() + " | " + Thread.currentThread().getName() + " has ACQUIRED READ lock");
            Thread.sleep(20);
            System.out.println("Searching book : "+name);
            for(IBook book:catalog.getBooks()){
                System.out.println("Found book : "+name);
                if(book.getName().equals(name))
                    return book;
            }
            System.out.println("no tfound book ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            LibraryLock.lock.readLock().unlock();
        }
        return null;
    }
}
