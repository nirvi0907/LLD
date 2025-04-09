package locker.src.model;

import java.util.Map;

public interface Subject {
    public void notifyObserver(String msg, Map<String, String> lockerDetails);
    public void addObserver(Observer observer);
    }
