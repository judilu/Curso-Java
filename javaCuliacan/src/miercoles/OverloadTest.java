package miercoles;
/*
Si una clase tiene varios metodos que tienen el mismo nombre pero diferentes parametros, se conoce como sobrecarga.
Si tenemos que realizar una sola operacion, tener el mismo nombre de los metodos aumenta la legibilidad del programa.

*Ventajas:
    Aumenta la legibilidad del programa
    Diferentes maneras de sobrecargar un metodo
Formas de sobrecargar un metodo
    1) cambiando el numero de Argumentos.
    2) Cambiando el tipo de datos.

 */
public class OverloadTest 
{
    public static void main(String[] args) 
    {
        System.out.println(AddArguments.add(10,20,30));
        System.out.println(AddArguments.add(5, 10));
        
        System.out.println(AddType.add(10, 20));
        System.out.println(AddType.add(10.8, 20.8));
    }
}
//1) Numero de argumentos
class AddArguments
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    
}
//2) Tipo de argumento
class AddType
{
    static int add(int a, int b)
    {
        return a +b;
    }
    static double add(double a, double b)
    {
        return a + b;
    }
}