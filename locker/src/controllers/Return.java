package locker.src.controllers;

import locker.src.exceptions.OTPGenFailure;
import locker.src.exceptions.SizeTooLargeException;
import locker.src.model.IUser;
import locker.src.model.Locker;
import locker.src.model.Package;
import locker.src.services.ReturnService;
import locker.src.services.UnlockService;

public class Return {
    private ReturnService service;

    public Return(){
        this.service = new ReturnService();
    }

    public Locker returnPackage(Package pakcageObj, IUser deleiveryGuy) throws OTPGenFailure, SizeTooLargeException {
        return service.returnPackage(pakcageObj, deleiveryGuy);
    }

    public void acceptReturn(int lockerId, String otp) throws Exception {
        service.acceptReturn(lockerId, otp);
    }
}
