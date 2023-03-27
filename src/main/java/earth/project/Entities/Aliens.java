package earth.project.Entities;

public class Aliens extends Entities{
    String identity;
    int age;
    public Aliens(String world, String identity, int age) {
        super(world);
        this.identity = identity;
        this.age = age;
    }
    public void print(){
        System.out.println("World: "+world +" identity: "+identity + " age: "+age);
    }
}
