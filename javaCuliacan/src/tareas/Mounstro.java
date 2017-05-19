package tareas;

public class Mounstro extends Personaje implements Acciones
{
    String arma;
    
    Mounstro(String nombre, String arma)
    {
        super(nombre);
        this.arma = arma;
    }
    
    public void habla()
    {
        System.out.println("Soy " + nombre + " y he venido a terminar con ustedes y con su MUNDO..!");
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
        System.out.println(nombre + ": *Cae y EXPLOTA " + onomatopeyas[1] + "!*");
    }
    
    //otros metodos
    public void crecer()
    {
        System.out.println("*CRECE..* MUAJAAA");
    }
}
