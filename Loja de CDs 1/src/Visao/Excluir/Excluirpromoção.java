/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Excluir;

import Principal.Menu;

/**
 *
 * @author Vinicius de Almeida
 */
public class Excluirpromoção extends javax.swing.JFrame {

    /**
     * Creates new form Excluirpromoção
     */
    public Excluirpromoção() {
        initComponents();
        setSize(620, 410);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        tfcapa = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Excluir promoção");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 10, 303, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Preço:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 170, 60, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 170, 230, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Codigo do CD:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 80, 130, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 80, 160, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Preço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 170, 60, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Capa do CD");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 80, 110, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(140, 120, 230, 30);

        tfcapa.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        getContentPane().add(tfcapa);
        tfcapa.setBounds(420, 120, 140, 180);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Titulo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 120, 60, 20);

        jToggleButton2.setBackground(new java.awt.Color(0, 51, 255));
        jToggleButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton2.setText("Voltar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(250, 250, 90, 50);

        jToggleButton3.setBackground(new java.awt.Color(0, 255, 0));
        jToggleButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton3.setText("Excluir");
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(70, 250, 90, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/05.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       new Menu().setVisible(true);
       dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Excluirpromoção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Excluirpromoção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Excluirpromoção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Excluirpromoção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Excluirpromoção().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel tfcapa;
    // End of variables declaration//GEN-END:variables
}
