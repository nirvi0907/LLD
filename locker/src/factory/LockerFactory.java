package locker.src.factory;

import locker.src.model.Locker;
import locker.src.model.LockerSize;
import locker.src.model.LockerStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LockerFactory {
    static List<Locker> lockers = new ArrayList<>();
    public static List<Locker> createLockers(int num){
//        List<Locker> lockers = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<num/4;i++) {
            lockers.add(new Locker(i+1, "India", LockerStatus.UNALLOCATED, LockerSize.LARGE));
            lockers.add(new Locker(i+2, "India", LockerStatus.UNALLOCATED, LockerSize.VERY_SMALL));
            lockers.add(new Locker(i+3, "India", LockerStatus.UNALLOCATED, LockerSize.SMALL));
        }
        return lockers;
    }

    public static List<Locker> getLockers() {
        return lockers;
    }
}
