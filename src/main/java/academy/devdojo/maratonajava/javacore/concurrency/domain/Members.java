package academy.devdojo.maratonajava.javacore.concurrency.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10); //ArrayBlockingQueue - Thread safe
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            final String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " email added on the list.");
            this.emails.add(email);
            condition.signalAll(); //Notify all
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails...");
        lock.lock();
        try {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " No email available on the list, standby mode");
                condition.await(); //SAME - this.emails.wait(); wait() - Must be inside a synchronized block!
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " Notifying everyone that we are no longer receiving emails");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
