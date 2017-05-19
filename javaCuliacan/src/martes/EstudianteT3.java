package martes;

// this para invocar al constructor inmediato el default de la clase actual
public class EstudianteT3 
{
    public static void main(String[] args) 
    {
        AB ab = new AB(10);
    }
}
class AB 
{
    AB()
    {
        System.out.println("Hola soy un mensaje en el " + "contructor"); 
    }
    AB (int x)
    {
        this();
        System.out.println(x);
    }
}