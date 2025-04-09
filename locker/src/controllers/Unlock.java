package locker.src.controllers;

import locker.src.services.UnlockService;

public class Unlock {
    public void unlock(int lockerId, String otp, boolean is_return) throws Exception {
        UnlockService service = new UnlockService();
        service.unlock(lockerId, otp, is_return);
    }
}
