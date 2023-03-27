package reality.project;

import reality.project.Entities.Aliens;
import reality.project.Entities.Humans;
import reality.project.Worlds.Earth;
import reality.project.Worlds.World;

public class Main {
    public static void main(String[] args) {
        World earth  = new Earth(1,1,"blue and grene plant");



        Humans humans = new Humans(earth,"seesnale","panSttaight",12);
        humans.print();


        Aliens aliens= new Aliens("ohio","npc",-1); // prof pega sus is alien
        aliens.print();

    }

}