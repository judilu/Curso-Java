package martes;

//this se puede ser pasado como argumento en la llamada al constructor   
public class EstudianteT5 
{   
    Estudiante1 obj;
    
    EstudianteT5(Estudiante1 obj)
    {
        this.obj = obj;
    }  
    
    void display()
    {
        System.out.println(obj.id);
    }
}

class Estudiante1
{
   int id = 001;
   
   Estudiante1()
   {
       EstudianteT5 s5 = new EstudianteT5(this);
       s5.display();
   }
   
    public static void main(String[] args) 
    {
       Estudiante1 e1 = new Estudiante1();
    }
}
