package library.account;

import library.book.Book;
import library.book.IBook;
import library.handler.BorrowingHandler;
import library.handler.IBorrowingHandler;

public class Librarian implements ILibrarian, IAccount{
        private String name;
        private String phone;
        private String email;
        private int id;
        private IBorrowingHandler borrowerHandler;

        public Librarian(String name, String phone, String email, int id){
            this.phone = phone;
            this.email = email;
            this.id = id;
            this.name = name;
        }

    public void initiateBorrowBook(IBook book, IBorrower borrower){

        IBorrowingHandler handler =  new BorrowingHandler(borrower);
        handler.initiateBorrowBook(book);
    }
    public void initiateReturnBook(IBook book, IBorrower borrower){

    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }
}
