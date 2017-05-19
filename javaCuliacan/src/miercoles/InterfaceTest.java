package miercoles;

/*
Una interfaz es un plano de una clase
tiene constantes estaticas y metodos abstractos
Es un mecanismo que permite la abstración 
solo puede contener metodos abstractos
Permite la herencia multiple
No se puede instancia como una clase abstracta

Razones para usar una interface
    A) Por interface podemos apoyar la funcionalidad de herencia multiple
    B Se utiliza para lograr el desacoplamiento

*Java S: Puede contener metodos predeterminados estaticos.

 */
interface show
{
    void mostrar();
}
public class InterfaceTest implements show
{
    public void mostrar()
    {
        System.out.println("Hola");
    }
    public static void main(String[] args) 
    {
        InterfaceTest i = new InterfaceTest();
        i.mostrar();
    }
}
