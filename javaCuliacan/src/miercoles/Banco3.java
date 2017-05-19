package miercoles;
/*
Cuando la variable tiene un @ es UNA NOTACION SOLAMENTE..!

Abstract vs Interface
Abstract.- 
    Tiene metodos abstractos y no abstractos
    Usa la palabra reservada abstract
    Puede proveer la implementación de una interface
    No soporta la herencia multiple
    Puede tener variables estaticas, finales, no finales y no estaticas.

Interface.-
    Solo puede contener metodos abstractos y en J8 tiene metodos default y estaticos
    solo tiene variables estaticas y finales
    No puede proveer la implementación de una clase abstracta.
    Usa la palabra reservada interface

*/
interface BancoE3
{
    float rangoIntereses();
}
class BnCoppel3 implements BancoE3
{
    public float rangoIntereses() 
    {
        return 7f;
    }  
}
class Bancomer3 implements BancoE3
{
    public float rangoIntereses() 
    {
        return 9f;
    }  
}
class HSBC3 implements BancoE3
{
    public float rangoIntereses() 
    {
        return 8f;
    }  
}
public class Banco3 
{
    public static void main(String[] args) 
    {
        BancoE3 b;
        b = new BnCoppel3();
        System.out.println("la tasa de interes es: " + b.rangoIntereses());  
        b = new Bancomer3();
        System.out.println("la tasa de interes es: " + b.rangoIntereses());
        b = new HSBC3();
        System.out.println("la tasa de interes es: " + b.rangoIntereses());       
    }
}
