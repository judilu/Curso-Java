package martes;
/*
 Si se aplica la palabra reservada static a cualquier metodo, se conoce como un metodo estatico

Un metodo estatico solo pertenece a la clase en lugar de objeto de una clase

Se puede invocar un metodo estatico sin necesidad de crear una instancia a una clase.

El metodo estatico puede acceder al miembro de datos estaticos y puede cambiar el valor del mismo.

*/
public class Estudiante2 
{
    int noControl;
    String nombre;
    static String Instituto = "ITL";
    
    public Estudiante2()
    {
        
    }
    
    public Estudiante2(int nc, String n)
    {
        noControl = nc;
        nombre = n;
    }

    public static void cambio()
    {
        Instituto = "ITC";
    }
    public void mostrar()
    {
        System.out.println(noControl + " " + nombre + " " + Instituto);
    }
    public static void main(String [] args)
    {
        Estudiante2.cambio();
        
        Estudiante2 e1 = new Estudiante2(001,"Judi");
        Estudiante2 e2 = new Estudiante2(002,"Ana");
        Estudiante2 e3 = new Estudiante2(003,"Mar");
        
        e1.mostrar();
        e2.mostrar();
        e3.mostrar();
    }
}
