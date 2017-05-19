package miercoles;

/*
Si una subclase tiene el mismo metodo que se declaro en la clase padre, se conoce como redefinición.
 si la subclase proporciona la implementacion especifica del metodo que ha sido previsamente proporcionado 
en su clase padre se conoce como redefinicion del metodo.

Uso del overwrite en java:
    1)   Proporcionar implementaciones especificar a metodos heredads.
    2) Proporcionar los mecanismos que permiten el polimorfismo.
Reglas para OverWrite:
    A) Mismo nombre que en la clase padre
    B) Mismo parametro que en la clase padre.
    C) Relacionados IS-A
 */
public class OverWriteTest 
{
    public static void main(String[] args) 
    {
        Bike bi = new Bike();
        bi.run();
    }
}
class Vehiculo 
{
    void run()
    {
        //sout
        System.out.println("El vehiculo esta corriendo");
    }
}
class Bike extends Vehiculo
{
    void run()
    {
        System.out.println("La bicicleta esta corriendo");
    }
}