/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author Marcos Mata
 */
public class Pricipal extends javax.swing.JFrame {

    /**
     * Creates new form Pricipal
     */
    public Pricipal() {
        initComponents();
         this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonPricipal2 = new Componentes.BotonPricipal();
        botonPricipal1 = new Componentes.BotonPricipal();
        botonPricipal3 = new Componentes.BotonPricipal();
        botonPricipal4 = new Componentes.BotonPricipal();
        botonPricipal5 = new Componentes.BotonPricipal();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPricipal2.setText("ANMONG US");
        botonPricipal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPricipal2ActionPerformed(evt);
            }
        });
        getContentPane().add(botonPricipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 160, -1));

        botonPricipal1.setText("REPORTAR");
        botonPricipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPricipal1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonPricipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 160, -1));

        botonPricipal3.setText("TAREAS");
        botonPricipal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPricipal3ActionPerformed(evt);
            }
        });
        getContentPane().add(botonPricipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 160, -1));

        botonPricipal4.setText("COMPUTADOR");
        botonPricipal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPricipal4ActionPerformed(evt);
            }
        });
        getContentPane().add(botonPricipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 160, -1));

        botonPricipal5.setText("CARGAR");
        botonPricipal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPricipal5ActionPerformed(evt);
            }
        });
        getContentPane().add(botonPricipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 270, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/todos.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/invitacion.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPricipal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPricipal2ActionPerformed
Uno O=new Uno();
O.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_botonPricipal2ActionPerformed

    private void botonPricipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPricipal1ActionPerformed
Dos a=new Dos();
a.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_botonPricipal1ActionPerformed

    private void botonPricipal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPricipal3ActionPerformed
Tres t=new Tres();
t.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_botonPricipal3ActionPerformed

    private void botonPricipal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPricipal4ActionPerformed
Cuatro o=new Cuatro();
o.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_botonPricipal4ActionPerformed

    private void botonPricipal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPricipal5ActionPerformed
    EjercicoCinco a=new EjercicoCinco();
    a.setVisible(true);
    dispose();
          
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPricipal5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.BotonPricipal botonPricipal1;
    private Componentes.BotonPricipal botonPricipal2;
    private Componentes.BotonPricipal botonPricipal3;
    private Componentes.BotonPricipal botonPricipal4;
    private Componentes.BotonPricipal botonPricipal5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
