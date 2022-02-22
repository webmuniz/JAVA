package academy.devdojo.maratonajava.javacore.exceptions.error.test;

public class StackOverflowTest01 {

    /*Erro é algo que acontece na JVM e provavelmente não poderá recuperar em tempo de execução;
    Abaixo acontecerá um erro por exceder a memória;*/

    public static void main(String[] args) {
        recursive();
    }

    public static void recursive() {
        recursive();
    }
}
