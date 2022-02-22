package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //Generic Type erasure <> - vai apagar na JVM
        List<String> list = new ArrayList<>();
        list.add("Midoriya");
        list.add("Kurama");

        for (Object o : list) {
            System.out.println(o);
        }

        add(list, new Consumer("Midoriya"));

        for (Object o : list) {
            System.out.println(o);
        }
    }
    private static void add(List list, Consumer consumer){
        list.add(consumer);
    }
}
