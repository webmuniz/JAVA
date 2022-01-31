package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {

        Player player1 = new Player("Gabigol");
        Player player2 = new Player("Pelé");
        Player player3 = new Player("Messi");
        Player[] players = new Player[]{player1, player2, player3};

        for (Player player : players) {
            player.print();
        }

    }
}
