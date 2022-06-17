/*
:*  Autor       : Jesus Gerardo Gonzalez Ramirez
:*  Descripción : Esta clase PrismaTriangulo contiene 2 constructores, uno sin parametros
:*              y otro con tres parametros, tiene 4 métodos de calculo para
:*              saber información del cilindro.
*/

package Prismas;

public class PrismaTriangulo {
    
    private double c1;
    private double c2;
    private double h;
    private Triangulo baseInf;
    private Triangulo baseSup;
    private Rectangulo cuerpo;
    
    //--------------------------------------------------------------------------
    //Constructor sin parametros
    public PrismaTriangulo()
    {
        c1 = 0;
        c2 = 0;
        h = 0;
        baseInf = new Triangulo();
        baseSup = new Triangulo();
        cuerpo = new Rectangulo();
    }
    
    //--------------------------------------------------------------------------
    //Constructor con tres parametros
    public PrismaTriangulo(double c1, double c2, double h)
    {
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
        baseInf = new Triangulo(c1, c2);
        baseSup = new Triangulo(c1, c2);
        cuerpo = new Rectangulo((c1 + c2 + baseInf.hipotenusa()), h);
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
    //Método que proviene de la clase prisma para obtener el area total del prisma
    //@Override
    public double areaTotal()
    {
        return areaLateral() + (2*areaBase());
    }

    //--------------------------------------------------------------------------
    //Método que proviene de la clase prisma para obtener el volumen del prisma
    //@Override
    public double volumen()
    {
        return baseInf.area() * h;
    }
    
}
