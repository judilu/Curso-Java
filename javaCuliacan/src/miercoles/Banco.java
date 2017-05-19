/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles;
// Tasa de interes bancaria por overWrite
public class Banco 
{
    public static void main(String[] args) 
    {
        BnCoppel bc = new BnCoppel();
        BanCommer bcm = new BanCommer();
        HSBC hs = new HSBC();
        
        System.out.println(bc.rangoIntereses());
        System.out.println(bcm.rangoIntereses());
        System.out.println(hs.rangoIntereses());
    }
   
}
class BancoP 
{
    float rangoIntereses()
    {
        return 0f;
    }
}
class BnCoppel extends BancoP
{
    float rangoIntereses()
    {
        return 7f;
    }
}
class BanCommer extends BancoP
{
    float rangoIntereses()
    {
        return 9f;
    }
}
class HSBC extends BancoP
{
    float rangoIntereses()
    {
        return 8f;
    }
}