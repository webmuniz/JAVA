package academy.devdojo.maratonajava.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        consultPrint(dogs);
        consultPrint(cats);

        List<Animal> animals = new ArrayList<>();
        consultPrintAnimal(animals);
    }

    //Type erasure - ?
    private static void consultPrint(List<? extends Animal> animals) { //<? extends Animal> - Any kind of list that extends Animal
        for (Animal animal : animals) {
            animal.consult();
        }
    }

    private static void consultPrintAnimal(List<? super Animal> animals) { //<? super Dog> - Any king of list above if Dog
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animals.add(animal1);
        animals.add(animal2);
    }
}
