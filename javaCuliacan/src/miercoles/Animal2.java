package miercoles;

//Herencia Multinivel
public class Animal2 
{
    void eat()
    {
        System.out.println("Eating..");
    }
}
class Dog2 extends Animal2
{
    void run()
    {
        System.out.println("Running");
    }
}
class Cachorro extends Dog2
{
    void drinkmilk()
    {
        System.out.println("Drinking milk");
    }
}
class Herencia
{
    public static void main(String[] args) 
    {
        Cachorro ca = new Cachorro();
        ca.drinkmilk();
        ca.run();
        ca.eat();
    }
}