package tarea2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MenuCO 
{
    Scanner s3 = new Scanner(System.in);
    public void menuO()
    {
        int opcO = -1;
        while(opcO != 0)
       {
           System.out.println("Elige una de las siguientes opciones:\n1.- FileInput \n" +
                                "2.- bufferedReader Intput \n" +
                                "3.- FilterInputStream \n" +
				"0.- Salir del menú ");
            opcO = Integer.parseInt(s3.nextLine()); 
            
            switch(opcO)
            {
                case 1:
                    //FileOutput
                    ruta();
                    break;
                case 2:
                    //bufferedReader Output
                    readO();
                    break;
                case 3:
                    //FilterOutputStrea,
                    filterO();
                    break;
                case 0:
                    System.out.println("Menú Principal");
                    opcO = 0;
                    break;
                default:
                    System.out.println("Tecle un número qu forme parte del menú");
            }
       } 
    }
    void ruta()
    {
        String rutaD = "";
        String comentario = "";
        System.out.println("Teclea la ruta del documento");
        rutaD = s3.nextLine();
        File doc = new File(rutaD);
        comentario = (doc.exists())? "El documento ya existe" : "Lo lamento el documento especificado NO existe..!";
        System.out.println(comentario);
        
    }
    void readO()
    { 
        try
        {
            System.out.println("Tecle la ruta del documento con su nombre y extensión: ");
            String rutaD = s3.nextLine();
            
            File f = new File(rutaD);
            
            FileReader fr = new FileReader(f);
            
            BufferedReader br = new BufferedReader(fr);
            
            System.out.println("Leyendo Documento");
            
            String linea = null;
            
            while ((linea = br.readLine()) != null) 
            {
                System.out.println(linea);
            }
 
            br.close();
        }
        catch (IOException eio)
        {
            System.out.println(eio);
        }
    }
    void filterO()
    {
        String nRuta = "";
        int i = 0;
        try
        {
            System.out.println("Tecle la ruta con el nombre y extensión del documento: ");
            nRuta = s3.nextLine();
      
            FileInputStream fis = new FileInputStream("C://test.txt");
            
            while( (i = fis.read())!=-1) 
            {
                System.out.println((char)i);
            }
                  
      } catch(IOException ioe) 
      {
         System.out.print(ioe);
      }
    }
}
