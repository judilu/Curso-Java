package miercoles;

import java.io.IOException;

public class ExceptionTest2 
{
    public static void main(String[] args) throws Exception
    {
        //int data = 50/0;
        try 
        {
            M m = new M();
            m.metodo();
        }catch (Exception e)
        {
            System.out.println("Exception Handled");
        }
        System.out.println("Lo que sigue");
    }
}
class M
{
    void metodo() throws IOException
    {
        throw new IOException("error");
    }
}