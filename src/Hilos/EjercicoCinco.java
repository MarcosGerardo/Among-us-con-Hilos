
package Hilos;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class EjercicoCinco extends javax.swing.JFrame {

   
    public EjercicoCinco() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/uar.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/BOTONuLTIMO.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 40, 30));

        jbar.setForeground(new java.awt.Color(0, 153, 0));
        jbar.setStringPainted(true);
        getContentPane().add(jbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/ULTIMA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       
        Avanzando avanzando = new Avanzando();
      
        
        avanzando.setBar(jbar);
    
        
        Thread hilo = new Thread(avanzando);
     
        hilo.start();       
        
        
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Pricipal o=new Pricipal();
o.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jbar;
    // End of variables declaration//GEN-END:variables
}

class Avanzando implements Runnable
{
    JProgressBar bar;
    
   
    
    @Override
    public void run() 
    {
        for (int i = 1; i <= 100; i++)
        {      
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Avanzando.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.getBar().setValue(i);
            
            if (this.getBar().getValue() == 100)
            {
                JOptionPane.showMessageDialog(new EjercicoCinco(), "SE HAN DESCARGADO LOS DOCUMENTOS ");
            }                        
        }        
        
    }

    public void setBar(JProgressBar bar)
    {
        this.bar = bar;
    }
    
    public JProgressBar getBar()
    {
        return bar;
    }
    
}