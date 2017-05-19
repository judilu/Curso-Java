package miercoles;

abstract class Shape
{
    abstract void draw();
}
// En un escenario real, la implementacion la provee algo más
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangles :) ");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("drawing circles :) ");
    }
}
//En un escenario real, el metodo es llamado por el programador
public class AbstracTest2 
{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        
        new Rectangle().draw();        
    }
}
