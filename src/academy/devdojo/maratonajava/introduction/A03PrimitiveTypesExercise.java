package academy.devdojo.maratonajava.introduction;

/**
 Create Variables for the fields described below between <> and print the following message:

 I <name>, living at address <address>,
 I confirm that I received the salary <salary>, on the date <date>
*/

public class A03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Elvis";
        String address = "Moinho's Street";
        float salary = 5635.26F;
        String payDate = "15/01/2022";

        System.out.println("I " + name + ", living at address " + address + ",\nI confirm that I received the salary $" + salary + ", on the date " + payDate + ".");
    }
}
