/*
:*  Autor       : Jesus Gerardo Gonzalez Ramirez   
:*  Descripción : Esta clase cilindro contiene 2 constructores, uno sin parametros
:*                y otro con un solo parametro, tiene 3 métodos de calculo para
:*                saber información del rectangulo.
*/

package Prismas;

public class Cilindro {
    private float radio;
    private double altura;
    private Circulo baseInf;
    private Circulo baseSup;
    private Rectangulo cuerpo;
    
    //--------------------------------------------------------------------------
    public Cilindro()
    {
        radio  = 0; 
        altura = 0;
        baseInf = new Circulo ();
        baseSup = new Circulo ();
        cuerpo = new Rectangulo();
    }
    
    //--------------------------------------------------------------------------
    public Cilindro(float rad, double alt)
    {
        radio = rad;
        altura = alt;
        baseInf = new Circulo (radio);
        baseSup = new Circulo (radio);
        cuerpo = new Rectangulo(baseInf.circunferencia(), alt );
    }
    
    //--------------------------------------------------------------------------
    public float areaBase()
    {
        return (float) baseInf.area();
    }
    
    //--------------------------------------------------------------------------
    public float areaLateral()
    {
        return (float)cuerpo.area();
    }
    
    //--------------------------------------------------------------------------
    public double areaTotal()
    {
        return baseInf.area() + baseSup.area() +cuerpo.area();
    }
    
    //--------------------------------------------------------------------------
    public double volumen()
    {
        return baseInf.area() * altura;
    }
    
    //--------------------------------------------------------------------------
    public String toString()
    {
        return "Cilindro de radio = "+radio+" altura = "+altura;
    }

    //--------------------------------------------------------------------------
    public double getRadio()
    {
        return radio;
    }

    //--------------------------------------------------------------------------
    public void setRadio(float radio) 
    {
        this.radio = radio;
    }

    //--------------------------------------------------------------------------
    public double getAltura()
    {
        return altura;
    }

    //--------------------------------------------------------------------------
    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    float areaToral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
