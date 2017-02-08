package modul10_tugasbank;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisdaniar
 */
public class TugasModul10 extends javax.swing.JFrame {
int t,s,tab=50000;
    /**
     * Creates new form TugasModul10
     */
    public TugasModul10() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPin = new javax.swing.JTextField();
        jbEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("BOJONEGORO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 70, 140, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Masukkan 4 Digit Pin Anda ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 110, 210, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ATM BNI SYARIAH");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 40, 190, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Selamat Datang");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 10, 140, 40);
        jPanel1.add(tfPin);
        tfPin.setBounds(30, 150, 320, 40);

        jbEnter.setText("ENTER");
        jbEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnterActionPerformed(evt);
            }
        });
        jPanel1.add(jbEnter);
        jbEnter.setBounds(110, 200, 150, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 380, 300);

        setBounds(0, 0, 396, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnterActionPerformed
       int Pin;
       int pin=1234;
       
       Pin = Integer.parseInt(tfPin.getText().toString());
       if (Pin == pin)
       {
           this.setVisible(false);
           new Frame2().setVisible(true);
       }
       else if ( Pin != pin)
       {
           JOptionPane.showMessageDialog(null, "Masukkan PIN dengan benar!");
       }
    }//GEN-LAST:event_jbEnterActionPerformed

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
            java.util.logging.Logger.getLogger(TugasModul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasModul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasModul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasModul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasModul10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEnter;
    private javax.swing.JTextField tfPin;
    // End of variables declaration//GEN-END:variables
}
