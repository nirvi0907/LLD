package library.account;

import library.Notifier.Notifier;
import library.book.Book;
import library.book.Catalog;
import library.book.IBook;
import library.book.ICatalog;
import library.book.search.BookSearcher;
import library.book.search.IBookSearcher;
import library.handler.BorrowingHandler;
import library.handler.IBorrowingHandler;

public class Librarian extends Thread implements ILibrarian, IAccount{
        private String name;
        private String phone;
        private String email;
        private int id;
        private IBorrowingHandler borrowerHandler;
        private ICatalog catalog;
        private IBookSearcher searcher;
        public Librarian(String name, String phone, String email, int id){
            this.phone = phone;
            this.email = email;
            this.id = id;
            this.name = name;
            this.catalog = new Catalog();
            this.searcher = new BookSearcher(catalog);
        }

    public void initiateBorrowBook(IBook book, IBorrower borrower){

        IBorrowingHandler handler =  new BorrowingHandler(borrower, new Notifier());
        handler.initiateBorrowBook(book);
    }
    public void initiateReturnBook(IBook book, IBorrower borrower){

    }
    public void addBook(IBook book){

        catalog.addBook(book);
    }
    public IBook searchBook(String name){
            return searcher.searchBook(name);
    }
    public String get_Name(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public int get_Id(){
        return id;
    }

}
