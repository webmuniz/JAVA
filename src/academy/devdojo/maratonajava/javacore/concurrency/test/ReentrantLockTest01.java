package academy.devdojo.maratonajava.javacore.concurrency.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    //Note System.out.printf -> %s String | %d int | %f float/double | %n - skip line
    @Override
    public void run() {
        lock.lock();
        try {
            if (lock.isHeldByCurrentThread()) {
                System.out.printf("Thread %s joined a critical session%n", name);
            }
            System.out.printf("%d thread waiting in line%n", lock.getQueueLength());
            System.out.printf("Thread %s will wait 2 seconds%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s ended the wait%n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
    }
}
