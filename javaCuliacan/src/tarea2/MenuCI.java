package tarea2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class MenuCI 
{
    Scanner s2 = new Scanner(System.in);
    FileOutputStream fos ;
    
    public void menuI() throws FileNotFoundException, IOException
    {
        int opcI = -1;
        String nombreArchivo = "";
        while(opcI != 0)
       {
            System.out.println("Elige una de las siguientes opciones:\n1.- FileOutput \n" +
                                "2.- bufferedWriter Output \n" +
                                "3.- FilterOutputStream \n" +
				"0.- Salir del menú ");
            
            opcI = Integer.parseInt(s2.nextLine()); 
            
            switch(opcI)
            {
                case 1:
                    //FileOutput
                    System.out.println("Proporcione el nombre de su archivo \n");
                    nombreArchivo = s2.nextLine();
                    fileI(nombreArchivo);
                    break;
                case 2:
                    //Bufered Writer
                    writerI();
                    break;
                case 3:
                    //FilterOutputStream
                    filterI();
                    break;
                case 0:
                    System.out.println("Menú Principal");
                    opcI= 0;
                    break;
                default:
                    System.out.println("Tecle un número qu forme parte del menú");
                    opcI = -1;
            }
       } 
    }  
    public void fileI(String nomA) throws FileNotFoundException
    {
        try
        {
            fos = new FileOutputStream("c:\\" + nomA + ".txt");
            System.out.println("Archivo creado correctamente..!");
        }catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
    public void writerI() throws IOException
    {
        BufferedWriter bw ;
        FileReader fr;
        
        try
        {
            String rutaDoc = "";
            String esc = "";
            String esc2 = "";
           
            System.out.println("Tecle la ruta con el nombre y extensión del documento: ");
            rutaDoc = s2.nextLine();
            
            File f = new File(rutaDoc);
            
            FileWriter fw = new FileWriter(f);
            
            bw = new BufferedWriter(fw);
            
            System.out.println("Tecle lo que desea escribir");
            esc = s2.nextLine();
            
            System.out.println("Escribiendo...");
            
            System.out.println("Tecle que más desea escribir");
            esc2 = s2.nextLine();
            
            bw.write(esc);
            bw.newLine();
            
            bw.write(esc2);
            bw.close();
        }
        catch (IOException eio)
        {
            System.out.println(eio.getMessage() );
        }
    }
    public void filterI() throws IOException
    { 
      String nRuta = "";
      int aux = 0;
      
      System.out.println("Tecle la ruta con el nombre y extensión del documento: ");
      nRuta = s2.nextLine();
      
      try 
      {
         OutputStream os = new FileOutputStream(nRuta);
         FilterOutputStream fos = new FilterOutputStream(os);
         
         for(int i=0; i < 5; i++)
         {
             aux = 0;
             System.out.println("Teclea código ascii ");
             aux = Integer.parseInt(s2.nextLine());
             fos.write((char)aux);
         }                  
         
         fos.flush();
         
         os.close();
         fos.close();
         
      } catch(IOException ioe) 
      {
         System.out.print(ioe);
      }         
    }
}