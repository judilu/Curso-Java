package miercoles;

//Herencia jerarquia
public class Animal3 
{
    void eat()
    {
        System.out.println("Caminando...");
    }
}
class Perro extends Animal3 
{
    void run()
    {
        System.out.println("Crriendo..");
    }
}
class Cat extends Animal3
{
    void move()
    {
        System.out.println("moving..");
    }
}
class HerenciaJerarquia
{
    public static void main(String[] args) 
    {
        Cat c = new Cat();
        c.move();
        c.eat();
    }
}