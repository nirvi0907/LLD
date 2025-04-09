package locker.src.services;

import locker.src.model.IUser;
import locker.src.model.Locker;
import locker.src.model.Observer;

import java.util.HashMap;

public class NotificationService {
    public void notifyUser(IUser user, Locker locker){
        Observer userObser = (Observer)user;
        userObser.update("Locker allocated ", new HashMap<String, String>(){
            {
                put("lockeName", String.valueOf(locker.getId()));
                put("lockerlocation", locker.getLocation());
                put("otp", locker.getOtp());
            }
        });
    }

}
