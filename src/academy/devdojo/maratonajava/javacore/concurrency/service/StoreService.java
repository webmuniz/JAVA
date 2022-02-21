package academy.devdojo.maratonajava.javacore.concurrency.service;

import java.util.concurrent.*;

public class StoreService {

    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName){
        System.out.printf("=-=-=-=-=-=%nGetting prices sync for store: %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPriceAsyncFuture(String storeName){
        System.out.printf("%s generating price...%n", Thread.currentThread().getName());
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPriceAsyncCompletableFuture(String storeName){
        System.out.printf("%s generating price...%n", Thread.currentThread().getName());
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    private double priceGenerator(){
        System.out.printf("%s generating price...%n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdown(){
        ex.shutdown();
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
