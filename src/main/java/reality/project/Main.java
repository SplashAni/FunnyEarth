package reality.project;

import reality.project.Entities.Aliens;
import reality.project.Entities.Humans;

public class Main {
    public static void main(String[] args) {
        Humans humans = new Humans("earth","splash","srrttaight",1);
        humans.print();


        Aliens aliens= new Aliens("ohio","npc",-1); // prof pega sus is alien
        aliens.print();

    }
}