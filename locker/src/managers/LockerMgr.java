package locker.src.managers;

import locker.src.model.Observer;
import locker.src.model.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LockerMgr implements Subject {
    Observer observer;

    public void notifyObserver(String msg, Map<String, String> lockerDetails){
        observer.update(msg, lockerDetails);
    }

    public void addObserver(Observer observer){
        this.observer = observer;
    }
}
