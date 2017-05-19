package martes;
/*
    La palabra reservada static es usada principalmente para la administracion de memoria.
Se puede tener:
    a) variables estaticas
    b) metodos estaticos
    c) bloques
    d) clases anidadas
Si declaras una variable estatica puede ser usada para dos cosas:
    1) para referir una propiedad en comun con todos los objetos.
    2) La variable estatica obtiene memoria solo una vez al momento de ser cargada a la clase.
    VENTAJAS 
    Vuelve tu codigo más EFICIENTE (ahorras memoria)

*/
public class Student 
{
    // La variable que no se repite es la que conviene hacer statica
    int id;
    String name;
    static String universidad = "ITC";
    
    Student()
    {
        
    }
    Student(int i,String n)
    {
        id= i;
        name = n;
    }
    //no pasa nada si no lo pones
    void mostrar ()
    {
        System.out.println(id + " " + name + " " + universidad);
    }
    
    public static void main (String [] args)
    {
        Student s1 = new Student(001,"Judi");
        Student s2 = new Student (002,"Ana");
      
        s1.mostrar();
        s2.mostrar();
    }
}
