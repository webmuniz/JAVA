package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("11111", "iPhone");
        Smartphone smartphone2 = new Smartphone("22222", "Pixel");
        Smartphone smartphone3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        //smartphones.clear();

        Smartphone smartphone4 = new Smartphone("44444","Pixel");
        smartphones.add(0, smartphone4); //Choice index

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        System.out.println(smartphones.contains(smartphone4));

        int index = smartphones.indexOf(smartphone2);
        System.out.println("Search index: "+index); //if not exists return -1
        System.out.println(smartphones.get(index));

    }

}
