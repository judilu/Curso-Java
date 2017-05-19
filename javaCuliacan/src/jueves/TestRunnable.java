package jueves;
/*
OTRA FORMA DE crear hilos con el runable sin necesidad de implementar el Runnable
*/
public class TestRunnable 
{
    public static void main(String[] args) 
    {
        //Otra manera de hacer un hilo sin necesidad de implementar el runable
        Runnable r1 = new Runnable()
        {
            public void run()
            {
               show(); 
            }
        };
        
        Runnable r2 = new Runnable()
        {
            public void run()
            {
                show2();
            }
        };
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
        
    }
    public static void show()
    {
        System.out.println("Tarea 1");
    }
    public static void show2()
    {
        System.out.println("Tarea 2");
    }
}
