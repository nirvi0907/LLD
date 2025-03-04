package LLD.parkinglot.realtime;

import LLD.parkinglot.customer.ICustoemr;
import LLD.parkinglot.customer.INotifiable;
import java.util.List;
import java.util.ArrayList;

public class ParkingLotRealTimeInfoMgr implements IParkingLotRealTimeInfoMgr {
    private List<INotifiable> notifiableCustomers = new ArrayList<>();

    public void addObserver(INotifiable customer){
        notifiableCustomers.add(customer);
    }
    public void removeObserver(INotifiable custoemr){
        notifiableCustomers.remove(custoemr);
    }
    public void updateObserver(String message){
        for(INotifiable customer:notifiableCustomers){
            customer.update(message);
        }
    }
}
