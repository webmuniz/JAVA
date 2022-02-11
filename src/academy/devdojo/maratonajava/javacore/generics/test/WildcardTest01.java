package academy.devdojo.maratonajava.javacore.generics.test;

abstract class Animal{
    public abstract void consult();

}
 class Dog extends Animal{
     @Override
     public void consult() {
         System.out.println("Consulting a dog");
     }
 }

 class Cat extends Animal{
     @Override
     public void consult() {
         System.out.println("Consulting a cat");
     }
 }

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        consultPrint(dogs);
        consultPrint(cats);
    }


    private static void consultPrint(Animal[] animals){
        for (Animal animal: animals){
            animal.consult();
        }
    }
}
