/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Daniel
 */
public class Operacion extends javax.swing.JFrame {

    /**
     * Creates new form Operacion
     */
    public Operacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtDato1 = new javax.swing.JTextField();
        TxtDato2 = new javax.swing.JTextField();
        BtnFin = new javax.swing.JButton();
        LblResultado = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 300));
        getContentPane().setLayout(null);

        jLabel1.setText("Dame datos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 16);

        jLabel2.setText("Dame dato");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 60, 16);

        jLabel3.setText("Resultado");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 60, 16);
        getContentPane().add(TxtDato1);
        TxtDato1.setBounds(120, 20, 100, 22);
        getContentPane().add(TxtDato2);
        TxtDato2.setBounds(120, 60, 100, 22);

        BtnFin.setText("Fin");
        BtnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFin);
        BtnFin.setBounds(90, 220, 72, 23);

        LblResultado.setText("jLabel4");
        getContentPane().add(LblResultado);
        LblResultado.setBounds(130, 110, 37, 16);

        jCheckBox1.setText("Suma");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(20, 140, 53, 20);

        jCheckBox2.setText("Resta");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(20, 170, 60, 20);

        jCheckBox3.setText("Multiplicacion");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(140, 140, 100, 20);

        jCheckBox4.setText("Division");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(140, 170, 65, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnFinActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int numero1=0,numero2=0,total=0;
        numero1=Integer.parseInt(TxtDato1.getText());
        numero2=Integer.parseInt(TxtDato2.getText());
        total=numero1+numero2;
        LblResultado.setText(""+total);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        int numero1=0,numero2=0,total=0;
        numero1=Integer.parseInt(TxtDato1.getText());
        numero2=Integer.parseInt(TxtDato2.getText());
        total=numero1-numero2;
        LblResultado.setText(""+total);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        int numero1=0,numero2=0,total=0;
        numero1=Integer.parseInt(TxtDato1.getText());
        numero2=Integer.parseInt(TxtDato2.getText());
        total=numero1*numero2;
        LblResultado.setText(""+total);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int numero1=0,numero2=0,total=0;
        numero1=Integer.parseInt(TxtDato1.getText());
        numero2=Integer.parseInt(TxtDato2.getText());
        total=numero1/numero2;
        LblResultado.setText(""+total);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(Operacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFin;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JTextField TxtDato1;
    private javax.swing.JTextField TxtDato2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
