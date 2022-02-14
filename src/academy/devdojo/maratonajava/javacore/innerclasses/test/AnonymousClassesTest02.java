package academy.devdojo.maratonajava.javacore.innerclasses.test;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<String> boatList = new ArrayList<>(List.of("Lancha", "Canoa"));

        //boatList.sort(((o1, o2) -> o1.compareTo(o2))); ------> Programação funcional

        boatList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(boatList);
    }
}
