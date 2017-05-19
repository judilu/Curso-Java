package jueves;

/*
    (Paralelismo) Multihilos en Java.- Es el proces para ejecutar muchos hilos de manera simultanea.
    hilos.- Subproceso ligero, unidad muy pequeña de procesamiento.
    Concurencia.- Multiprocesamiento y Multihilo se utilizan para lograr la multitarea, en la concurencia puede
o no ser multiprocesamiento.

Ventajas de usar hilos:
    1.- No bloqueamos al usuario por que son tareas independientes y se pueden realizar muchas tareas al mismo tiempo.
    2.- Podemos realizar muchas tareas al mismo tiempo.
    3.- Los hilos al ser independientes no se afectan entre si, en caso de ocurrir una excepcion en un hilo los
        demas funcionan igual.

Multitarea.- Proceso de ejecucion de muchas tareas, Usamos la multitarea para utilizar el CPU
            La multitarea se logra de dos maneras:
            A) Multitarea basa en procesos. (Multiprocesos)
               * Cada proceso tiene su propia direccion en memoria, es decir, cada proceso 
                asigna un area separada de memoria
               * El proceso es pesado.
               * El costo de la comunicación entre el proceso es algo.
               * Cambiar de un proceso a otro requiere de tiempo  para guardar.
                y cargar registros, mapas de memoria, listas de actualización, etc.
            B) Multitarea basa en hilos. (MultiHilos)
                *Los hilos comparten los mismos espacios en memoria para direcciones.
                * El hilo es ligero
                * El costo de comnicacion entre hilos es bajo.ñ

Un hilo es un subproceso ligero, es independiente, si se produce una excepcion 
en un hilo no afecta a los demás hilos y comparten un area de memoria en comun.

Ciclo de vida de un hilo
    1.- New: El hilo esta en este estado, si se crea una instancia de la clase Thread pero antes de la invocacion del metodo strar().
    2.- Runnable: El hilo esta en este estado, despues de la invocacion del metodo start(), pero el thread scheduler() (Administrador de Hilos)
        no lo ha seleccionado como el hilo en ejecución.
    3.- Running: El hilo esta aqui cuando el Thread Scheduler lo ha seleccionado.
    4.- -Non-Runnable (Blocked): Es el estado cuando el hilo sigue activo, sin enbargo no es apto para ejecutarse.
    5.- Terminated: Es el estado cuando ha finalizado o muerto.
        cuando sale del metodo run().
    
Existen 2 formas de crear un hilo:
    1) Al extender de la clase Thread.
    2) Al implementar la interface Runnable.

Clase Thread
Proporciona los constructores y metodos par crear y realizar operaciones en un hilo.
La clase Thread extiende de la clase Object e implementa la interface Runnable.
    Constructores de la clase Thread.
        Thread()
        Thread(  name)
        Thread(Runnable r)
        Thread(Runnable r, String name)

Runnable:
    La interfaz Runnable debe ser implementada por cualquier clase cuyas instancias esten destinadas a ser
    ejecutadas por un hilo.
    La interfaz Runnable tiene un solo metodo denominado run()
    Public void run(): Es usado para realzar las operaciones del hilo.

 */
public class HilosT extends Thread
{
    //Viene sobreEscrito de una clase llamada THREAD
    public void run()
    {
        System.out.println("Soy un hilo corriendo");
    }
    public static void main(String[] args) 
    {
        HilosT h1 = new HilosT();
        //inicia como si fuera un hilo toma las propiedades inicia todo el ciclo de vida de un hilo.
        h1.start();
        
        //implementando.
        Hilos h = new Hilos();
        Thread thread = new Thread(h);
        thread.start();
    }
}
class Hilos implements Runnable
{
    public void run()
    {
        System.out.println("Hilo dos esta corriendo");
    }
}