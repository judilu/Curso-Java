package miercoles;

interface Drawable
{
    void draw();
}
class Rectangle3 implements Drawable
{
    public void draw()
    {
        System.out.println("Dibujando a rectangulo");
    }
}
class Circle3 implements Drawable
{
    public void draw()
    {
        System.out.println("Dibujando a circulo");
    }
}
public class InterFaceTest2 
{
    public static void main(String[] args) {
        Drawable d ;
        d = new Circle3();
        d.draw();
        d = new Rectangle3();
        d.draw();
        Rectangle3 r1 = new Rectangle3();
        r1.draw();
    }
}
