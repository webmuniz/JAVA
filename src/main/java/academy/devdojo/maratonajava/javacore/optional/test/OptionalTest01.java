package academy.devdojo.maratonajava.javacore.optional.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Consumer;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu!");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----------------");

        Optional<String> nameOptional = findName("Webmuniz");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(nameOptional);

    }

    private static Optional<String> findName(String name){
        final List<String> list = List.of("William", "DevDojo", "Webmuniz");
        final int i = list.indexOf(name);
        if (i > 0){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
