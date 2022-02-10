package academy.devdojo.maratonajava.javacore.exceptions.exception.domain;

public class Employee extends Person {

    //Ao sobrescrever um método não é obrigado lançar as mesmas exceções;
    public void save() throws InvalidLoginException{
        System.out.println("Saving employee...");
    }
}
