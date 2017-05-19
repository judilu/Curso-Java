package jueves;

public class TestSlepp extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
    }
    public static void main(String[] args) {
        TestSlepp t1 = new TestSlepp(),
                   t2 = new TestSlepp();
        
        t1.start();
        t2.start();
    }
}
