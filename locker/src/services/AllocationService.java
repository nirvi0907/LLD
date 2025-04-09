package locker.src.services;

import locker.src.allocate.Allocator;
import locker.src.allocate.RandomAllocate;
import locker.src.exceptions.OTPGenFailure;
import locker.src.exceptions.SizeTooLargeException;
import locker.src.factory.LockerFactory;
import locker.src.model.IUser;
import locker.src.model.Locker;
import locker.src.model.Observer;
import locker.src.providers.DBconnect;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class AllocationService {

    public Locker allocate(IUser user, locker.src.model.Package packageObj) throws SizeTooLargeException, OTPGenFailure {
        if(packageObj.getSize()>500)
            throw new SizeTooLargeException("Please enter size less than 500");
        DBconnect connect = new DBconnect();
        List<Locker> availLockers;
        availLockers = connect.getAvailableLockers();
        if(availLockers==null){
            LockerFactory factory = new LockerFactory();
            availLockers = factory.createLockers(4);
            System.out.println("created new lockers of diff sized");
        }
        Allocator allocator = new RandomAllocate();
        Locker locker = allocator.allocate(availLockers, packageObj);

        OtopGenService otpGen = new OtopGenService();
        otpGen.setOTPForLocker(locker);
        NotificationService service = new NotificationService();
        service.notifyUser(user, locker);
        System.out.println("notified user");
        return locker;
    }

}
