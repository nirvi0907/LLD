package locker.src.allocate;

import locker.src.model.Locker;
import locker.src.model.PackageStatus;

import java.util.List;
import java.util.Random;

public class RandomAllocate implements Allocator {
    public Locker allocate(List<Locker> availableLockers, locker.src.model.Package packageObj){
        Random random = new Random();
        Locker locker = availableLockers.get(random.nextInt(availableLockers.size()));
        locker.setaPackage(packageObj);
        System.out.println("Allocated new locker of id "+locker.getId()+ " for package "+packageObj.getId());

        return locker;
    }
}
