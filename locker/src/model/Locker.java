package locker.src.model;

import locker.src.managers.LockerMgr;

public class Locker {
    private int id;
    private String location;
    private LockerStatus status;
    private LockerSize size;
    private String otp;
    private LockerMgr mgr;
    private Package aPackage;

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public Locker(int id, String location, LockerStatus status, LockerSize size) {
        this.id = id;
        this.location = location;
        this.status = status;
        this.size = size;
//        this.otp = otp;
        this.mgr = new LockerMgr();
    }

    public void setOTP(String otp){
        this.otp = otp;
    }

    public void setStatus(LockerStatus status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public LockerStatus getStatus() {
        return status;
    }

    public LockerSize getSize() {
        return size;
    }

    public String getOtp() {
        return otp;
    }

    public LockerMgr getMgr() {
        return mgr;
    }
}
