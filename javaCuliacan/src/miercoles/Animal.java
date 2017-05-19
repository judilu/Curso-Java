package miercoles;

//
public class Animal 
{
    void eat()
    {
        System.out.println("Comiento...");
    }
}
class Dog extends Animal
{
    void run()
    {
        System.out.println("Corriendo");
    }
}
class Prueba {
    public static void main(String []args )
    {
        Dog d = new Dog();
        d.run();
        d.eat();
    }
}