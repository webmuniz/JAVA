package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("1ABC!", "iPhone");
        Smartphone phone2 = new Smartphone("1ABC!", "iPhone");

        System.out.println(phone1.equals(phone2)); //@override method .equals on Smartphone.java
    }
}
