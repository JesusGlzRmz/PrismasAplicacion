/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*             Frame que carga una imagen antes de abrir la aplicacion
:*        
:*  Archivo     : SplashFrame.java
:*  Autor       : Jesus Gerardo Gonzalez Ramirez   18130561
:*  Fecha       : 21/Oct/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Este Frame nos permite tener un splash antes de abrir la aplicacion 
                  en donde muestra el logo del tec laguna, una barra de cargar y 
                  datos propios de nosotros.
:*  Ultima modif:
:*  Fecha         Modifico             Motivo
:*========================================================================================== 
:*  21/Oct/2020   Jesus Glz            Agregar Prologo
:*------------------------------------------------------------------------------------------*/
package Prismas;

import com.sun.awt.AWTUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class SplashFrame extends javax.swing.JFrame {

    private Timer timer;
    
    public SplashFrame() {
        initComponents();
        
        AWTUtilities.setWindowOpaque(this, false);
        this.setSize(400, 272);
        this.setLocationRelativeTo(null);
        
        //Definir el timer
        timer = new Timer(100, 
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev)
            {
                if(jPBarAvance.getValue() < 100)
                    jPBarAvance.setValue(jPBarAvance.getValue() + 3);
                else
                {
                    timer.stop();
                    new PrismasFrame().setVisible(true);
                    dispose();
                }
            }
        });
        
        timer.start();
        
    }
    
    public static void ejecutar () {
                /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashFrame().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBarAvance = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPBarAvance.setForeground(new java.awt.Color(51, 255, 255));
        getContentPane().add(jPBarAvance);
        jPBarAvance.setBounds(10, 190, 380, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("PrismasApp");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 10, 230, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ITL.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 60, 110, 120);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 40, 0, 210);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         ejecutar ();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jPBarAvance;
    // End of variables declaration//GEN-END:variables
}
