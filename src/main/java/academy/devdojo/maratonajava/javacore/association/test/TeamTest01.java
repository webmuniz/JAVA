package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Player;
import academy.devdojo.maratonajava.javacore.association.domain.Team;

public class TeamTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Baker Mayfield");
        Player player2 = new Player("Odell Backman");
        Player player3 = new Player("Miles Garret");
        Player[] players = {player1, player2, player3};

        Team team = new Team("Cleveland Browns", players);

        team.setPlayers(players);

        //Reference team - player:
        player1.setTeam(team);
        player2.setTeam(team);
        player3.setTeam(team);

        player1.print();
        player2.print();
        player3.print();
        //==============================

        team.print();
    }
}
