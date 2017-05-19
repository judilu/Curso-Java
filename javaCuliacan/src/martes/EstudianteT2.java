package martes;

// this: invocar a un metodo de la clase actual
public class EstudianteT2 
{
    public static void main(String[] args) 
    {
        Saludos a1 = new Saludos();
        a1.tambienSaluda();
    }
        
}   
class Saludos
{
    public void saludar()
    {
        System.out.println("Hola");
    }
    public void tambienSaluda()
    {
        this.saludar();
    }
}
