package academy.devdojo.maratonajava.javacore.threads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10); //ArrayBlockingQueue - Thread safe
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            final String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " email added on the list.");
            this.emails.add(email);
            this.emails.notifyAll(); //Notify all threads to continue
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails...");
        synchronized (this.emails) {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " No email available on the list, standby mode");
                this.emails.wait(); //wait() - Must be inside a synchronized block!
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notifying everyone that we are no longer receiving emails");
        }
    }
}
