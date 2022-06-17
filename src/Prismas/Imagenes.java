/*
:*  Autor       : Jesus Gerardo Gonzalez Ramirez       
:*  Descripción : Esta clase Imagenes contiene 2 metodos para poder
:*                colocar una imagen a escala diferente dentro de un label.
*/

package Prismas;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Imagenes {
    //--------------------------------------------------------------------------
    public static Image getScaledImage(Image srcImg, int w, int h)
    {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        
        return resizedImg;
    }
    
    //--------------------------------------------------------------------------
    public static Icon escalarImagen (Icon srcImg, int w, int h)
    {
        Image img = ((ImageIcon)srcImg).getImage();
        img = getScaledImage(img, w, h);
        return new ImageIcon(img);
    }
}
