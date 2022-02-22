package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Player;
import academy.devdojo.maratonajava.javacore.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Elvis");
        Team team1 = new Team("Flamengo");

        player1.setTeam(team1);
        player1.print();
    }
}
