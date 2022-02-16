package academy.devdojo.maratonajava.introduction;

public class A05ConditionalStructuresSwitch {
    public static void main(String[] args) {

        //Dados os valores de 1 - 7 imprima se é dia útil ou fim de semana. Sendo 1 como domingo
        byte dia = 7;

        //char, int, byte, short, enum, String
        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
                break;
        }

    }
}
