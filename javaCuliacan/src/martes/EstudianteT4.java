package martes;
//this se puede pasar como un argumento en la llamada al metodo
public class EstudianteT4 
{
   
    public static void main(String[] args) 
    {
        EstudianteT4 e1 = new EstudianteT4();
        e1.msn();
    }
    
    public void mensaje(EstudianteT4 est)
    {
        System.out.println("hola soy un mensajito");
    }
    public void msn()
    {
        mensaje(this);
    }
}


