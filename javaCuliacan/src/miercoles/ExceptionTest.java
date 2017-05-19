package miercoles;

// import java.io.*;
/*
Excepciones.- Evento que interumpe el flujo
y el manejo de las excepciones es para evitar romper el flujo, para garantizar que el flujo de nuestro programa 
termine sin ninguna interupcion

 */
public class ExceptionTest 
{
    public static void main(String[] args) 
    {
        try
        {
            int data = 50 / 0;
            int a[] = new int [5];
            a[5] = 30/0;
        }catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }catch(ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println(aiobe);    
        }catch(Exception e)
        {
            System.out.println(e);
        }
        //para ejecutar una instrucción importante
        finally
        {
            System.out.println("El bloque finally siempre es ejecuta");
        }
        System.out.println("Lo que sigue");
    }
}
