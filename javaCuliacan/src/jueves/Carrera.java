package jueves;

public class Carrera 
{
    public static void main(String[] args) 
    {
        //Clase
        Tortuga t1 = new Tortuga();
        /*Es una interface y no puedo crear un objeto de una clase interface
        vas a crear un hilo pero lo vas a counstruir de tipo liebre.
        uno de los constructores me permite recibir un runable
        */
        Thread t2 = new Thread(new Liebre());
        
        t1.start();
        t2.start();
    }
}
