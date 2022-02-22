package academy.devdojo.maratonajava.javacore.concurrency.test;

import academy.devdojo.maratonajava.javacore.concurrency.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        final StoreService storeService = new StoreService();
        //searchPricesSync(storeService);
        //searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();

        System.out.printf("%n*****************************%nTime passed to search: %d ms", end - start);
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        final Future<Double> priceAsyncFuture1 = storeService.getPriceAsyncFuture("Store 1");
        final Future<Double> priceAsyncFuture2 = storeService.getPriceAsyncFuture("Store 2");
        final Future<Double> priceAsyncFuture3 = storeService.getPriceAsyncFuture("Store 3");
        final Future<Double> priceAsyncFuture4 = storeService.getPriceAsyncFuture("Store 4");
        try {
            System.out.println(priceAsyncFuture1.get());
            System.out.println(priceAsyncFuture2.get());
            System.out.println(priceAsyncFuture3.get());
            System.out.println(priceAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("%n*****************************%nTime passed to search: %d ms", end - start);
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> priceAsyncCompletableFuture1 = storeService.getPriceAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> priceAsyncCompletableFuture2 = storeService.getPriceAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> priceAsyncCompletableFuture3 = storeService.getPriceAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> priceAsyncCompletableFuture4 = storeService.getPriceAsyncCompletableFuture("Store 4");

        System.out.println(priceAsyncCompletableFuture1.join());
        System.out.println(priceAsyncCompletableFuture2.join());
        System.out.println(priceAsyncCompletableFuture3.join());
        System.out.println(priceAsyncCompletableFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("%n*****************************%nTime passed to search: %d ms", end - start);
        StoreService.shutdown();
    }
}
