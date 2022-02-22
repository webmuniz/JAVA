package academy.devdojo.maratonajava.javacore.concurrency.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

/*
ConcurrencyLinkedQueue, SynchronousQueue, LinkedBlockingQueue
 */
public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Object> ltq = new LinkedTransferQueue<>();
        System.out.println(ltq.add("webmuniz"));
        System.out.println(ltq.offer("GitHub"));
        System.out.println(ltq.offer("DevDojo", 10, TimeUnit.SECONDS));
        ltq.put("Academy");

        if (ltq.hasWaitingConsumer()){
            ltq.transfer("DevDojo"); //Wait...
        }
        System.out.println(ltq.tryTransfer("Java"));
        System.out.println(ltq.element());
        System.out.println(ltq.peek());
        System.out.println(ltq.poll());
        System.out.println(ltq.remove());
        System.out.println(ltq.take());
        System.out.println(ltq.remainingCapacity());
        System.out.println(ltq);
    }
}
