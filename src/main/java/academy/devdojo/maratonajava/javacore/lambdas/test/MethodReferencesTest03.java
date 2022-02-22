package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

//Reference to an instance method of an arbitrary object of a particular type;
public class MethodReferencesTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Webmuniz", "Thays", "Bruce"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> chackName = List::contains;
        System.out.println(chackName.test(list, "Webmuniz"));
    }
}
