package academy.devdojo.maratonajava.javacore.enumeration.test;

import academy.devdojo.maratonajava.javacore.enumeration.domain.Client;
import academy.devdojo.maratonajava.javacore.enumeration.domain.TypeClient;
import academy.devdojo.maratonajava.javacore.enumeration.domain.TypePayment;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Thays", TypeClient.PESSOA_FISICA, TypePayment.DEBIT);
        Client client2 = new Client("We", TypeClient.PESSOA_JURIDICA, TypePayment.CREDIT);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(TypePayment.DEBIT.calcDiscount(100));
        System.out.println(TypePayment.CREDIT.calcDiscount(100));

        TypeClient typeClient = TypeClient.valueOf("PESSOA_FISICA");
        System.out.println(typeClient.getTypeReport());
        TypeClient typeClient2 = TypeClient.typeClientToNameReport("Pessoa Física");
        System.out.println(typeClient2);
    }
}
