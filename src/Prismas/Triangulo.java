/*
:*  Autor       : Jesus Gerardo Gonzalez Ramirez
:*  Descripción : Esta clase triangulo contiene 2 constructores, uno sin parametros
:*                y otro con un solo parametro, tiene 3 métodos de calculo para
:*                saber información del trinagulo.
*/

package Prismas;

public class Triangulo {
    private double c1;
    private double c2;
    
    //--------------------------------------------------------------------------
    public Triangulo()
    {
        c1 =0;
        c2 =0;
    }
    
    //--------------------------------------------------------------------------
    public Triangulo(double c1, double c2)
    {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    //--------------------------------------------------------------------------
    public double hipotenusa()
    {
        return Math.sqrt((Math.pow(c1, 2))+(Math.pow(c2, 2)));
    }
    
    //--------------------------------------------------------------------------
    //@Override
    public double perimetro() 
    {
        return c1 + c2 + hipotenusa();
    }

    //--------------------------------------------------------------------------
    //@Override
    public double area()
    {
        return (c1*c2)/2;
    }
}
