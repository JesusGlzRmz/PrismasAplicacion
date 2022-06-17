/*
:*  Autor       : Jesus Gerardo Gonzalez Ramirez
:*  Descripción : Esta clase rectangulo contiene 2 constructores, uno sin parametros
:*                y otro con un solo parametro, tiene 3 métodos de calculo para
:*                saber información del rectangulo.
*/

package Prismas;

public class Rectangulo {
    private double lado;
    private double ancho;

    //--------------------------------------------------------------------------
    public Rectangulo()
    {
        lado =0;
        ancho =0;
    }
    
    //--------------------------------------------------------------------------
    public Rectangulo(double lad, double lada)
    {
        lado = lad;
        ancho = lada;
    }
    
    //--------------------------------------------------------------------------
    public double diagonal()
    {
        return Math.sqrt((Math.pow(lado, 2))+(Math.pow(ancho, 2)));
    }

    //--------------------------------------------------------------------------
    //@Override
    public double perimetro() 
    {
        return (lado*2)+(ancho*2);
    }

    //--------------------------------------------------------------------------
    //@Override
    public double area()
    {
        return lado*ancho;
    }
}
