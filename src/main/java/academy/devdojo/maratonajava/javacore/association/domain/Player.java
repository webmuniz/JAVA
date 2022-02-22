package academy.devdojo.maratonajava.javacore.association.domain;

public class Player {

    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public void print(){
        System.out.print(this.name+ " - ");
        if (team != null){
            System.out.print(team.getName());
        }
        System.out.println();
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
