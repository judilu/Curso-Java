package tareas;

import java.util.Random;

public class Personaje 
{

    protected String nombre;
    protected String[] golpes = {"patada", "golpe", "salto", "voltereta", "usar"};
    protected String[] onomatopeyas = {"BANG", "BOOM", "POW", "ZAP", "OUCH"};
    protected Random ran = new Random();

    Personaje(String nombre) 
    {
        this.nombre = nombre;
    }
}
