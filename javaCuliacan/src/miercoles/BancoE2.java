package miercoles;

abstract class BancoE2
{
    abstract float rangoIntereses();
}
class  BnCoppel2 extends BancoE2
{
    float rangoIntereses() 
    {
       return 7f;
    }
}
class Bancomer2 extends BancoE2
{
    float rangoIntereses()
    {
        return 9f;
    }
}
class HSBC2 extends BancoE2
{
    float rangoIntereses()
    {
        return 8f;
    }
}
class AbstractPrin
{
    public static void main(String[] args) 
    {
        BancoE2 b;
        b = new BnCoppel2();
        System.out.println("La tasa de intereses: " + b.rangoIntereses());
        b = new Bancomer2();
        System.out.println("La tasa de intereses: " + b.rangoIntereses());
        b = new HSBC2();
        System.out.println("La tasa de intereses: " + b.rangoIntereses());
    }
}