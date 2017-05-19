package tarea2;
/*

No se utilizo hilos
Primero lo queria hacer asi normal y ya luego queria implementar los hilos
pero ya no alcance

JUDITH MORENO 
*/
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu 
{
    static Scanner s = new Scanner(System.in);
   
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
       menuP();
    }
    public static void menuP() throws FileNotFoundException, IOException
    {
        int opc = -1;
        MenuCI mi = new MenuCI();
        MenuCO mo = new MenuCO();
        while(opc != 0)
       {
            System.out.println("Elige una de las siguientes opciones:\n1.- Entrada " +
				"\n2.- Salida \n" +
				"0.- Salir del menú ");
            
            opc = Integer.parseInt(s.nextLine()); 
            
            switch(opc)
            {
                case 1:
                    //Entrada
                    mi.menuI();
                    break;
                case 2:
                    //Salida1
                    mo.menuO();
                    break;
                case 0:
                    System.out.println("El programa termino Adios..!");
                    break;
                default:
                    System.out.println("Tecle un número qu forme parte del menú");
                    opc = -1;
            }
       }
    }
}
