package LLD.parkinglot.realtime;

import LLD.parkinglot.customer.ICustoemr;

public interface IParkingLotRealTimeInfoMgr {
    public void addObserver(ICustoemr customer);

    public void removeObserver(ICustoemr custoemr);

    public void updateObserver(String message);
}
