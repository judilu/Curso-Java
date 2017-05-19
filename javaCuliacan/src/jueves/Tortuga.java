package jueves;

public class Tortuga extends Thread
{
    public void run()
    {
        int i = 0;
        System.out.println("Inicia la tortuga");
        
        while(i <= 5)
        {
            try
            {
                Thread.sleep(5000);
                System.out.println("La tortuga da un paso ");
            }catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
            i++;
        }
        System.out.println("Ya llego la tortuga");
    }  
}
