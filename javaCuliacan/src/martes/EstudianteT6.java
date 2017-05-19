package martes;

//this se puede utilizar para devolver la instancia actual del metodo.
public class EstudianteT6 
{
    public static void main(String[] args) 
    {
        
        //EstudianteE e1 = new EstudianteE();
        //e1.getValor().msg();
        // son anonimos
        new EstudianteE().getValor().msg();
    }
}

class EstudianteE
{
    public EstudianteE getValor()
    {
        return this;
    }
    void msg()
    {
        System.out.println("hola soy el mensaje");
    }
}
