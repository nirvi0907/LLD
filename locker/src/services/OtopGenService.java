package locker.src.services;

import locker.src.exceptions.OTPGenFailure;
import locker.src.model.Locker;

public class OtopGenService {

    public void setOTPForLocker(Locker locker) throws OTPGenFailure {
        String otp = generateOTP();
        if(otp==null || otp==""){
            throw new OTPGenFailure("OTP generation failed, please try again after soem time");
        }
        locker.setOTP(otp);
      
    }

    public String generateOTP() {
        return "abc";
    }
}
