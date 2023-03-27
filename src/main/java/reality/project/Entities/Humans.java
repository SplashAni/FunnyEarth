package reality.project.Entities;

public class Humans extends Entities{
    String name;
    String gender;
    int age;

    public Humans(String world,String name, String gender , int age) {
        super(world);
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void print(){
        System.out.println("Name: "+name +  " Gender: "+gender + " Age: "+age);
    }
}
