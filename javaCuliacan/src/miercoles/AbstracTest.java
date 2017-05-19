package miercoles;

/*
 Una clase que se declara abstracta necesita de la palabra reservada abstract
Abstracción.- Proceso de ocultar los detalles de implementacion
y mostrar solo la funcionalidad al usuario
No conoce el procesamiento interno de la funcion.
La abstraccion permite centrarse en lo que hace el objeto.
en lugar de como lo hace
Ha dos maneras de lograr la abstraccion
    1) Clase Abstracta (0 a 100%)
    2) Interface (100%) nos garantiza 100% de abstracción

Una clase que se declara abstracta no se conoce como clase abstracta. 
Tiene que heredarse y sus metodos debe ser implementados. 
No puede instanciarse.

Un metodo se declara abstract cuando no tiene implementacion y tiene la palabra reservada abstract.

Tner palabra Abstract, que herede de la clase e implementar 
*/
public class AbstracTest extends Bike2
{
    void run()
    {
        System.out.println("Corriendo...");
    }
    public static void main(String[] args) 
    {
        // Bike2 b = new Bike2(); no lo permite
        // no puedes crear un objeto de una clase abstracta utilizas la clase padre
        Bike2 b = new AbstracTest();
        b.run();
        new AbstracTest().run(); //objeto anonimo
    }
}
abstract class Bike2
{
    abstract void run();
    
}