package library.rules;

import library.record.BorrowingRecord;
import library.record.IBorrowingRecord;

public class BorrowingRules implements IBorrowingRules{
    private int maxBooks;
    private IBorrowingRecord history;

    public BorrowingRules(int maxBooks, IBorrowingRecord history){
        this.maxBooks = maxBooks;
        this.history = history;
    }
    public boolean isMaxBookReached(){
        int numCurrentBooks = this.history.getCurrentBooks().size();
        if (numCurrentBooks<this.maxBooks)
            return false;
        return true;
    }
    public void updateMaxBooks(int maxBooks){
        this.maxBooks = maxBooks;
    }
}