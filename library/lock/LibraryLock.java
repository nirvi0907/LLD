package library.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LibraryLock {
    public static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
}
