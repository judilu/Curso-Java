package martes;

/*
    Constructor
    Se usa para inicializar un objeto
    no tiene un tipo de retorno 
    es invocado implicitamente
    el compilador de java Provee un
    constructor por default si no tiene uno 
    constructor debe contener las mismas signatura de la clase.

    Metodo:
    Es usado para explicar el comportamiento de un objeto
    tiene un valor de retrono
    es invocadoexplicitamente
    no lo provee ni el compilador ni la clase.
    Puede tener o no la misma signatura de la clase que lo
    cotnien
*/
public class Integrante 
{
   int id;
   String nombre;
   
   public Integrante()
   {
       
   }
   public Integrante (int i, String n)
   {
       id = i;
       nombre = n;
   }
   
   public Integrante (Integrante i)
   {
       id = i.id;
       nombre = i.nombre;
   }
   
   public void mostrar ()
   {
       System.out.println(id + " " + nombre);
   }
  
   public static void main(String[] args)
   {
       Integrante i1 = new Integrante(001,"JM");
       Integrante i2 = new Integrante (i1);
       
       i1.mostrar();
       i2.mostrar();
   }
}
