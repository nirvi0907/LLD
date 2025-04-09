package locker.src.allocate;

import locker.src.model.Locker;
import locker.src.model.Package;

import java.util.List;

public interface Allocator {
    public Locker allocate(List<Locker> lockers, Package packageObj);
}
