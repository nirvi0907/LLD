package locker.src;
import locker.src.controllers.Return;
import locker.src.controllers.Unlock;
import locker.src.factory.LockerFactory;
import locker.src.model.*;
import locker.src.controllers.Allocate;
import locker.src.model.Package;
import locker.src.providers.DBconnect;
import locker.src.services.ReturnService;

import java.util.List;

public class client {

    public static void main(String[] ar) throws Exception {
        IUser user1 = new User("Nirvi", 1, 123);
        IUser deliveryGuy = new DeliveryPerson("himanshu",2,234);
        Package packageObj = new Package(1, 50);
        Allocate allocateController = new Allocate();

        Locker locker = allocateController.allocate(user1, packageObj);
//        Package packageObj2 = new Package(1, 5000);
//        allocateController.allocate(user1, packageObj2);
        //unlock- enter otp, locker id to unlock, it will find the locker
        Unlock unlock = new Unlock();
        unlock.unlock(locker.getId(), "abc", false);

        Return returnController = new Return();
        Locker lockerId = returnController.returnPackage(packageObj, deliveryGuy);
        returnController.acceptReturn(lockerId.getId(), "abc");
        //assuming packages are managed by system
    }


}
