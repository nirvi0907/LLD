package LLD.parkinglot.realtime;

import LLD.parkinglot.customer.ICustoemr;

public interface IParkingLotRealTimeInfoMgr {
    public void addObserver(LLD.parkinglot.customer.INotifiable customer);

    public void removeObserver(LLD.parkinglot.customer.INotifiable custoemr);

    public void updateObserver(String message);
}
