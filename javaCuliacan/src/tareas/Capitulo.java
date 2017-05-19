package tareas;

public class Capitulo 
{
    public static void main(String[] args) 
    {
        Mounstro m1 = new Mounstro("Dark Spectro","Espada de oscuridad");
        PowerRanger pr1 = new PowerRanger("Power Ranger Pink","Rosa","Pterodactilo","Disco");
        PowerRanger pr2 = new PowerRanger("Power Ranger Red","Rojo","Tiranosaurio","Espada");
        PowerRanger pr3 = new PowerRanger("Power Ranger Blue","Azul","Triceratops","Lanza");
        
        m1.camina(10);
        m1.habla();
        pr2.camina(5);
        pr2.habla();
        m1.pelea();
        pr1.pelea();        
        pr2.pelea();
        pr3.pelea();
        m1.pelea();
        m1.camina(4);
        m1.crecer();
        pr2.llamarAlZord();
        pr1.llamarAlZord();
        pr3.llamarAlZord();
        m1.pelea();
        pr2.pelea();
        pr2.pelea();
        pr1.pelea();
        pr2.termina();
        m1.termina();
    }
}
