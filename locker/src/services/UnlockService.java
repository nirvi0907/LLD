package locker.src.services;

import locker.src.exceptions.IncorrectOtpException;
import locker.src.exceptions.LockerIdIncorrect;
import locker.src.factory.LockerFactory;
import locker.src.model.Locker;
import locker.src.model.LockerStatus;
import locker.src.model.PackageStatus;

import java.util.List;

public class UnlockService {
    public void unlock(int lockerId, String otp, boolean is_return) throws Exception {
        List<Locker> lcoekrs = LockerFactory.getLockers();
        Locker lockerNeeded = null;
        for(Locker locker:lcoekrs){
            if(locker.getId()==lockerId ){
                 lockerNeeded = locker;

            }
        }
        if(lockerNeeded==null)
            throw new LockerIdIncorrect("pplease enter correct id");
        if(!lockerNeeded.getOtp().equals(otp))
            throw new IncorrectOtpException("pplease enter correct id");
        if(is_return==true) {
            lockerNeeded.getaPackage().setStatus(PackageStatus.RETUREND);
            System.out.println("locker successuly unlocked  & package returned ");

        }
        else {
            lockerNeeded.getaPackage().setStatus(PackageStatus.DELIVERED);
            System.out.println("locker successuly unlocked  & package delivered ");

        }
        //once unlcoked we auto set to delivered, what if user tries it again, shld we say already delievered?

        lockerNeeded.setStatus(LockerStatus.UNALLOCATED); //sitautaion thae package isnt taken out

    }

}
