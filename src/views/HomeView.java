/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public HomeView() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rrButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        srtfButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador - IngeniebrOS  1.0.0");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("¿Qué algoritmo desea simular?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 530, 50));

        rrButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rrButton.setForeground(new java.awt.Color(0, 0, 0));
        rrButton.setText("RR");
        rrButton.setFocusable(false);
        rrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(rrButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 520, 40));

        exitButton.setBackground(new java.awt.Color(255, 102, 102));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Salir");
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 520, 40));

        srtfButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        srtfButton.setForeground(new java.awt.Color(0, 0, 0));
        srtfButton.setText("SRTF");
        srtfButton.setFocusable(false);
        srtfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srtfButtonActionPerformed(evt);
            }
        });
        jPanel2.add(srtfButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 520, 40));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void srtfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srtfButtonActionPerformed
        
    }//GEN-LAST:event_srtfButtonActionPerformed

    private void rrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrButtonActionPerformed
        
    }//GEN-LAST:event_rrButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JButton getRrButton() {
        return rrButton;
    }

    public JButton getSrtfButton() {
        return srtfButton;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton rrButton;
    private javax.swing.JButton srtfButton;
    // End of variables declaration//GEN-END:variables
}