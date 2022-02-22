package academy.devdojo.maratonajava.javacore.concurrency.service;


import academy.devdojo.maratonajava.javacore.concurrency.domain.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");

        while (members.isOpen() || members.pendingEmails() > 0) {

            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " Sending email to: " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " email successfully sent to: " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All emails were sent successfully :)");

    }
}
