package jueves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextIO 
{
    public static void main(String[] args) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("c:\\hola.txt");
            //el 65 es el ascii de una letra
            fos.write(65);
            // lo estoy cerrando
            fos.close();
            
            FileInputStream fis = new FileInputStream("c:\\hola.txt");
            // memoria local inmediata, guarda en memoria lo que tenga el archivo
            BufferedInputStream bin = new BufferedInputStream(fis);
            int i;
            while( (i = bin.read()) != -1)
            {
                System.out.println((char)i);
            }
        }catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        
    }
}
