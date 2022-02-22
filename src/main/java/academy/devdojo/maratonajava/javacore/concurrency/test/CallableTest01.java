package academy.devdojo.maratonajava.javacore.concurrency.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        final int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executing a callable task...%n", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d%n", Thread.currentThread().getName(), num);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();

        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        final Future<String> future = executorService.submit(randomNumberCallable);
        final String s = future.get();

        System.out.printf("Program finished %s", s);
        executorService.shutdown();
    }
}
