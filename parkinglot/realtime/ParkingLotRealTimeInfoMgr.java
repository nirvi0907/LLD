package LLD.parkinglot.realtime;

import LLD.parkinglot.customer.ICustoemr;
import java.util.List;
import java.util.ArrayList;

public class ParkingLotRealTimeInfoMgr implements IParkingLotRealTimeInfoMgr {
    private List<ICustoemr> customers = new ArrayList<>();

    public void addObserver(ICustoemr customer){
        customers.add(customer);
    }

    public void removeObserver(ICustoemr custoemr){
        customers.remove(custoemr);
    }

    public void updateObserver(String message){
        for(ICustoemr customer:customers){
            customer.update(message);
        }
    }
}
