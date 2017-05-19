package martes;

public class Tienda 
{
    //Variables globales
    String producto;
    double precio ;
    
    public static void  main (String [] args)
    {
        //instancias de objetos
        AsignacionReferencia ar1 = new AsignacionReferencia();
        Productos pr1 = new Productos();
        Productos pr2 = new Productos("Refresco Cocacola",20.0);
        //mostrar 
        System.out.println("Producto: " + ar1.producto + "Precio: " + ar1.precio);
        pr1.asignarValor("Sabritas", 11.50);
        pr1.mostarDatos();
        
        pr2.mostarDatos();
    }
}

class Productos
{
    //variables
    String producto;
    double precio;
    
    // Constructores
    public Productos()
    {
        
    }
    public Productos(String prod,double prec)
    {
        producto = prod;
        precio = prec;
    }
    //metodos
    public void asignarValor(String pro,double pre)
    {
        producto = pro;
        precio = pre;
    }
    
    public void mostarDatos()
    {
        System.out.println("Producto: " + producto + "Precio: " + precio);
    }
}
class AsignacionReferencia
{
    String producto = "Jugo Jumex";
    double precio = 14.50; 
}
/*Constructor
Reglas:
    1) La signativa del constructor debe ser la misma que la de la clase que lo contiene.
    2) No tiene un valor de retorno explicito.
Tipos:

*/