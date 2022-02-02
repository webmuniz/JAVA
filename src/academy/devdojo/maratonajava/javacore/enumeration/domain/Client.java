package academy.devdojo.maratonajava.javacore.enumeration.domain;

public class Client {
    private String name;
    private TypeClient typeClient;
    private TypePayment typePayment;

    public Client(String name, TypeClient typeClient, TypePayment typePayment) {
        this.name = name;
        this.typeClient = typeClient;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name= '" + name + '\'' +
                ", typeClient= " + typeClient.getTypeReport() +
                ", typeClientInt= " + typeClient.VALUE +
                ", typePayment= " + typePayment +
                '}';
    }
}
