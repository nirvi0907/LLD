package locker.src.model;

import java.util.Map;

public interface Observer {
    public void update(String msg, Map<String, String> lockerDetails);
}
