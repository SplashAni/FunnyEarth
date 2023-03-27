package reality.project.Entities;

import reality.project.Worlds.World;

public class Humans extends Entities{
    String name;
    String gender;
    int age;

    public Humans(World world, String name,String gender, int age) {
        super(String.valueOf(world));
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print(){
        System.out.println("Name: "+name +  " Gender: "+gender + " Age: "+age);
    }
}
