/*
:*  Autor       : Jesus Gerardo Gonzalez Ramirez     
:*  Descripción : Esta clase circulo contiene 2 constructores, uno sin parametros
:*                y otro con un solo parametro, tiene 3 métodos de calculo para
:*                saber información del circulo.
*/

package Prismas;

public class Circulo {
    private double radio;
    
    //--------------------------------------------------------------------------
    public Circulo()
    {
        radio = 0;
    }

    //--------------------------------------------------------------------------
    public Circulo(double rad)
    {
        radio = rad;
    }
    
    //--------------------------------------------------------------------------
    public double diametro()
    {
        return radio*2;
    }

    //--------------------------------------------------------------------------
    //@Override
    public double circunferencia()
    {
        return Math.PI*(2*radio);
    }
    
    //--------------------------------------------------------------------------
    //@Override
    public double area()
    {
        return Math.PI*(Math.pow(radio,2));
    }
    
}
