/*
:*  Autor       : Jesus Gerardo Gonzalez Ramirez    
:*  Descripción : Esta clase PrismaRectangulo contiene 2 constructores, uno sin parametros
:*              y otro con tres parametros, tiene 4 métodos de calculo para
:*              saber información del cilindro.
*/

package Prismas;

public class PrismaRectangulo {
    
    private double l;
    private double a;
    private double h;
    private Rectangulo baseInf;
    private Rectangulo baseSup;
    private Rectangulo cuerpo;
    
    //--------------------------------------------------------------------------
    //Constructor sin parametros
    public PrismaRectangulo()
    {
        l = 0;
        a = 0;
        h = 0;
        baseInf = new Rectangulo();
        baseSup = new Rectangulo();
        cuerpo = new Rectangulo();
    }
    
    //--------------------------------------------------------------------------
    //Constructor con tres parametros
    public PrismaRectangulo(double l, double a, double h)
    {
        this.l = l;
        this.a = a;
        this.h = h;
        baseInf = new Rectangulo(l, a);
        baseSup = new Rectangulo(l, a);
        cuerpo = new Rectangulo(baseInf.perimetro(), h);
    }

    //--------------------------------------------------------------------------
    //Método que proviene de la clase prisma para obtener el area de la base
    //@Override
    public double areaBase()
    {
        return baseInf.area();
    }

    //--------------------------------------------------------------------------
    //Método que proviene de la clase prisma para obtener el area de la figura lateral
    //@Override
    public double areaLateral()
    {
        return (float)cuerpo.area();
    }

    //--------------------------------------------------------------------------
    //Método que proviene de la clase prisma para obtener el total del prisma rcetangulo
    //@Override
    public double areaTotal()
    {
        return areaLateral() + (2*areaBase());
    }

    //--------------------------------------------------------------------------
    //Método que proviene de la clase prisma para obtener el volumen del prisma rectangulo
    //@Override
    public double volumen()
    {
        return baseInf.area() * h;
    }
    
}