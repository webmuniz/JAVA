package academy.devdojo.maratonajava.javacore.threads.test;


class ThreadExampleRunnable2 implements Runnable {
    private String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
//        new Thread(() -> {
//        }).start();

        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        //t1.join(); //Main cannot proceed until t1 finishes.
        t2.start();
    }
}
