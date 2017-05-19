package jueves;

public class EquipoCp {

    public static void main(String[] args) {
        Metodos o1 = new Metodos();
        Thread t = new Thread(o1);
        t.start();
        t.setName("hiloMalo");
        System.out.println("El nombre de mi hilo es: " + t.getName());
        //elhilo se ha interumpido.
        String texto2 = t.interrupted() == false ? "El Hilo SIGUE..!" : "EL Hilo ha sido INTERRUMPIDO..!";
        System.out.println(texto2);
        String texto = t.isAlive() == false ? "El HILO MURIO..!" : "EL HILO VIVE..!";
        System.out.println(texto);
    }
}

class Metodos implements Runnable {

    public void run() {
        System.out.println("El hilo esta corriendo:");
    }
}
