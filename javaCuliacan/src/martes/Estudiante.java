package martes;
/*
Objetos: Entidad del mundo real que posee tres caracteristicas: Comportamiento, estado, identidad

Estado: Representa el valor de un objeto.
Comportamiento: Representa la funcionalidad que pose el objeto.
Identidiad.- Un objeto es tipicamente implementado con el valor del id no es visible para el usuario final, pero
internamente por la JVM, para identificar cada objeto de manera unica.

Un objeto es una instancia de una clase.
Clase.- Es un grupo de objetos que tienen propiedades comunes.
Es na plantilla para modelar los objetos que se crean.
Una clase contiene:
    Campos
    Metodos
    Constructores
    Bloques
    Clases anidadas e interfaces

-- FORMAS DE INICIALIZAR UN OBJETO:
    variable referencia.- asignacion normal
    Variable retorno
    Constructor
*/
public class Estudiante 
{
    int id; // Campo o dato o una instancia
    String name;
   public static void main (String [ ] args) 
   {
       //Creando un objeto de estudiante
       /*Estudiante.- Tipo  
       s1.- nombre asignacion 
       new.- reserva espacion en memoria. 
       Estudiante().- Toma el constructor
       
       */
       //Ac
       Estudiante s1 = new Estudiante();
       Alumno a1 = new Alumno();
       Alumno a2 = new Alumno(002,"Judi");
       
       //Accesando al objeto al que se hace referencia
       System.out.println(s1.id);
       System.out.println(s1.name);
       
       a1.inicializarVariable(001,"Judith");
       a1.mostrar();
       a2.mostrar();
    } 
}
//Incializacion por Variable Referencia
class Alumno
{
    int id = 1;
    String name = "Judith";
    //Inicializacion por Metodo
    public void inicializarVariable(int id, String n)
    {
        this.id = id; /* en este caso tienen el mismo nombre por eso uso el this. ya que podria dar un error de ambigüedad
        el this hace referencia al que esta afuera 
        DIFERENCIAS ENTRE ARGUMENTO VS PARAMETRO
        Argumento.- es solo un valor
        Parametro.- pueden ser un rango */
        name = n;
    }
    
    public void mostrar()
    {
        System.out.println(id + " " + name);
    }
    
    public Alumno()
    {
        
    }
    public Alumno(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

