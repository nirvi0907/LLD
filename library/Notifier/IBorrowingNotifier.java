package library.Notifier;
//IBorrowerNotifier- uses List<IBorrower>,method s-
// addBorrower(IBorrower), remove, subject.notify(message)

import library.account.IBorrower;

import java.util.List;

public interface IBorrowingNotifier {
    public void addBorrower(IBorrower borrower);
    public void removeBorrower(IBorrower borrower);
    public void notifyBorrowers(String mesage);
}
