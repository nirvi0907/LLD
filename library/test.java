package library;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private int sharedResource = 0;

    public int readResource() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is STARTING to READ");
            Thread.sleep(2000); // Simulate a time-consuming read
            System.out.println(Thread.currentThread().getName() + " finished READING");
            return sharedResource;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.readLock().unlock();
        }
        return -1;
    }

    public void writeResource(int value) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is STARTING to WRITE");
            Thread.sleep(3000); // Simulate a time-consuming write
            sharedResource = value;
            System.out.println(Thread.currentThread().getName() + " finished WRITING");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        test example = new test();

        // Reader Threads
        Thread reader1 = new Thread(() -> example.readResource(), "Reader-1");
        Thread reader2 = new Thread(() -> example.readResource(), "Reader-2");

        // Writer Thread
        Thread writer = new Thread(() -> example.writeResource(42), "Writer");

        // Start threads in controlled order
        reader1.start();

        try { Thread.sleep(500); } catch (InterruptedException e) { }

        writer.start();

        try { Thread.sleep(500); } catch (InterruptedException e) { }

        reader2.start();
    }
}
