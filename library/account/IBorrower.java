package library.account;

import library.book.Book;
import library.record.IBorrowingRecord;
import library.rules.IBorrowingRules;

import java.util.List;
import java.util.Map;

public interface IBorrower {
    public IBorrowingRecord getRecord();
    public IBorrowingRules getRuler();
    public int getMaxBooks();

}
