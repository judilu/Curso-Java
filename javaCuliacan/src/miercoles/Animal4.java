package miercoles;
/*
    La palabra reservada super es una variable de referencia
    al objeto inmediato de la clase padre
    Siempre que se crea la instancia de la subclase, se crea una instancia de la superclase implicitamente a la que se refiere
    por super-variable.

    Uso de la palabra reservada super
        super refiere a la variable de instancia del padre
        super invoca al metodo de la clase padre
        super() invoca al constructor de la clase padre.
*/
public class Animal4 
{
    String color = "Blanco";
    
}
class Dog4 extends Animal4
{
   String color = "Negro";
   
   void imprmir()
   {
       System.out.println(color);
       System.out.println(super.color);
   }
}
//Super puede ser usado para invocar un metodo de la clase padre
class Animal5
{
    void eat()
    {
        System.out.println("eating..");
    }
}
class Dog5 extends Animal5
{
    void eat()
    {
        System.out.println("eating bread..");
    }
    void run()
    {
        System.out.println("running away");
    }
    void takeShower()
    {
        System.out.println("taking a shower");
    }
    void sample()
    {
        eat();
        run();
        takeShower();
        super.eat();
    }
}
// super es usado para invocar el constructor de la clase padre
class Animal6
{
    Animal6()
    {
        System.out.println("Animal es creado");
    }
}
class Dog6 extends Animal6
{
    Dog6()
    {
        super();
        System.out.println("Dog es creado");
    }
}
class PruebaAnimal
{
    public static void main(String[] args) 
    {
        Dog4 d4 = new Dog4();
        d4.imprmir();
        
        Dog5 d5 = new Dog5();
        d5.sample();
        
        Dog6 d6 = new Dog6();
    }
}

