package library.Notifier;

import library.account.IAccount;
import library.account.IBorrower;
import library.account.INotifiable;

import java.util.ArrayList;
import java.util.List;

public class Notifier implements IBorrowingNotifier {
    List<IBorrower> borrowers = new ArrayList<>();

    public void addBorrower(IBorrower borrower){
        borrowers.add(borrower);
    }
    public void removeBorrower(IBorrower borrower){

    }
    public void notifyBorrowers(String message){
        for(IBorrower borrower:borrowers){
            ((INotifiable)borrower).update(message);
        }
    }
    public void notifyBorrower(IBorrower borrower, String message){
        for(IBorrower borrowerItem:borrowers){
            if(((IAccount) borrowerItem).get_Name().equals(((IAccount) borrower).get_Name())) {

                INotifiable notifiableBorrower = (INotifiable) borrower;
                notifiableBorrower.update(message);  // Corrected notification call
            }
        }
    }
}
