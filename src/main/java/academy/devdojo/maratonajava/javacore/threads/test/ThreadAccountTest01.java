package academy.devdojo.maratonajava.javacore.threads.test;

import academy.devdojo.maratonajava.javacore.threads.domain.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Fulano");
        Thread t2 = new Thread(threadAccountTest01, "Ciclano");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("FUCK!");
            }
        }
    }

    private static void print(){
        synchronized (ThreadAccountTest01.class){
            System.out.println("\n****** available  to new withdrawal *******\n");
        }
    }

    private synchronized void withdrawal(int amount){ //synchronized - There will be no parallelism. 2 Threads will not start together
        if(account.getBalance() >= amount){
            print();
            System.out.println(getThreadName() +" is going to withdrawal money");
            account.withdraw(amount);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getThreadName() +" completed withdrawal, current balance: " + account.getBalance());
        }else{
            System.out.println(":( No money for "+ getThreadName() +" make the withdrawal! Balance: " + account.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();

    }

}
