package academy.devdojo.maratonajava.javacore.collections.test;


import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        //cannot be primitive type in < >
        List <String> names = new ArrayList<>();
        List <String> names2 = new ArrayList<>();
        names.add("Elvis");
        names.add("DevDojo");

        names2.add("Muniz");
        names2.add("Maratona");

//        names.remove("Elvis"); //can be index

        names.addAll(names2);

        for (String name: names) {
            System.out.println(name);
        }
        System.out.println("----------");
        int size = names.size();
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }
        System.out.println(names);
    }
}
