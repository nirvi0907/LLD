package locker.src.services;

import locker.src.exceptions.OTPGenFailure;
import locker.src.exceptions.SizeTooLargeException;
import locker.src.model.IUser;
import locker.src.model.Locker;
import locker.src.model.Package;
import locker.src.model.PackageStatus;

public class ReturnService {
    public Locker returnPackage(Package pakcageObj, IUser deliveryGuy) throws OTPGenFailure, SizeTooLargeException {
        pakcageObj.setStatus(PackageStatus.RETURN_REQUESTED);
        //allocate locker for delivery and otp
        AllocationService allocationService = new AllocationService();
        Locker locker = allocationService.allocate(deliveryGuy, pakcageObj);
        return locker;
    }

    public void acceptReturn(int lockerId, String otp) throws Exception {
        UnlockService service = new UnlockService();
        service.unlock(lockerId, otp, true);

    }
}
