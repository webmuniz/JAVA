package academy.devdojo.maratonajava.javacore.concurrency.test;

import academy.devdojo.maratonajava.javacore.concurrency.domain.Quote;
import academy.devdojo.maratonajava.javacore.concurrency.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        final StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }


    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished", store)))
                .toArray(CompletableFuture[]::new);

        final CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b%n", voidCompletableFuture.isDone());
    }
}
