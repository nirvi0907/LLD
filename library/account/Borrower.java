package library.account;

import library.book.Book;
import library.overdue.IBorrowingOverdue;
import library.record.BorrowingRecord;
import library.record.IBorrowingRecord;
import library.rules.BorrowingRules;
import library.rules.IBorrowingRules;

import java.util.List;
import java.util.Map;

public class Borrower implements IBorrower, IAccount, INotifiable {
    private String name;
    private String phone;
    private String email;
    private int id;
    private int maxBooks;
    private IBorrowingRules rules;
    private IBorrowingRecord record;

    public Borrower(String name, String email, String phone, int id, int maxBooks){
        this.phone = phone;
        this.email = email;
        this.id = id;
        this.name = name;
        this.maxBooks = maxBooks;
        this.record = new BorrowingRecord();
        this.rules = new BorrowingRules(maxBooks, this.record);

    }
    @Override
    public IBorrowingRecord getRecord(){
        return record;
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

    public void update(String message){
        System.out.print(message);
    }


    public IBorrowingRules getRuler(){
        return rules;
    }
    public int getMaxBooks(){
        return maxBooks;
    }
}
