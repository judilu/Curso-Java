package martes;
/*
Se trata de  una variable referencia al objeto actual

Usos de la palabra reservada this:
    a) This puede ser usado para referir a la instancia de la clase actual.
    b) This se utiliza para invocar el metodo de la clase actual (implicitamente)
    c) This()  se utiliza para invocar al constructor de la clase actual.
    d) this se puede pasar como un argumento en la llamada al metodo
    e) this se puede ser pasado como argumento en la llamada al constructor
    f) this se puede utilizar para devolver la instancia actual del metodo.
*/
public class EstudianteT 
{
    int noControl;
    String nombre;
    int edad;
    // Hacer referencia a la instancia de la clase actual
    public EstudianteT(int noControl, int edad, String nombre)
    {
        //codigo ambigüo
        this.noControl = noControl;
        this.edad = edad;
        this.nombre = nombre;
    }
}
