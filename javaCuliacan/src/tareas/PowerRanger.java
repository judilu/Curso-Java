package tareas;

public class PowerRanger extends Personaje implements Acciones
{
    String color;
    String zord;
    String arma;
    
    PowerRanger(String nombre, String color, String zord, String arma)
    {
        //para mandar llamar el constructor de la clase padre uso el super
        super(nombre);
        this.color = color;
        this.zord = zord;
        this.arma = arma;
    }
    
    public void habla()
    {
        System.out.println("Soy el " + nombre + " y te vamos a destruir jajaja");
    }    
    public void pelea()
    {
        int n = ran.nextInt(golpes.length);
        String arma2 = n == 4 ? arma: "" ;
        System.out.println(nombre + ": Toma est@ *" + golpes[n] + " "+ arma2 + " " + onomatopeyas[n] + "! *");
    }
            
    public void camina(int np)
    {
        int n = ran.nextInt(2);
        String mov = n == 0 ? "Avanza": "Retrocede" ;
        System.out.println(nombre + ": *" + mov + " " + np + " pasos*");
    }
    
    public void termina()
    {
        System.out.println("*se da la vuelta*");
    }
    
    //Otros metodos
    public void llamarAlZord()
    {
        System.out.println("Ven " + zord + "!!" );
    }
}
