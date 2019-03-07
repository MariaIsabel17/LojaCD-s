/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Cadastrar;



import DAO.CDDAO;
import DAO.Conexao;
import Principal.Menu;
import Principal.Menu2;
import java.io.File;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Modelo.CD;

/**
 *
 * @author Vinicius de Almeida
 */
public class CadastrarCDs extends javax.swing.JFrame {

    /**
     * Creates new form CadastarCDs
     */
    public CadastrarCDs() {
        initComponents();
        setSize(500, 440);
        setResizable(false);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        tfcapa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCapa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Preço = new javax.swing.JTextField();
        Lbcapa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Titulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel6.setText("jLabel6");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Numero de faixas");

        jButton4.setText("Adicionar Músicas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(tfcapa);
        tfcapa.setBounds(280, 150, 70, 30);

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Cadastra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 320, 100, 40);

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 320, 100, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Preço:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 100, 60, 20);

        btnCapa.setText("Selecionar");
        btnCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapa);
        btnCapa.setBounds(360, 160, 100, 23);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Capa:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 150, 60, 20);
        getContentPane().add(Preço);
        Preço.setBounds(100, 100, 160, 30);

        Lbcapa.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        getContentPane().add(Lbcapa);
        Lbcapa.setBounds(300, 190, 160, 190);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("Cadastrar CDs");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 10, 260, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Titulo:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 60, 60, 20);
        getContentPane().add(Titulo);
        Titulo.setBounds(100, 60, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/04.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  new Menu2().setVisible(true);
  dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapaActionPerformed

        try{
        JFileChooser foto = new JFileChooser();
        foto.setCurrentDirectory(new File("C:\\Users\\cliente especial\\Documents\\NetBeansProjects\\Loja de CDs\\src\\img"));
        foto.setDialogTitle("Carregar Capa");
        foto.showOpenDialog(this);
        String a = "" + foto.getSelectedFile().getName();
        tfcapa.setText(a);
        Lbcapa.setIcon(new ImageIcon("C:\\Users\\cliente especial\\Documents\\NetBeansProjects\\Loja de CDs\\src\\img\\" + tfcapa.getText()));
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Não foi possivel carregar capa");
            }
    }//GEN-LAST:event_btnCapaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String titulo = Titulo.getText();
       String preço = Preço.getText();
       String capa = tfcapa.getText();
       
       if (Titulo.equals("")|| Preço.equals("")){
           JOptionPane.showMessageDialog(null, "nenhum campo pode estar vazio", 
                   "Loja de CDs", JOptionPane.WARNING_MESSAGE);
       
       } else {
       Connection con = Conexao.AbrirConexao();
       CDDAO sql = new CDDAO(con);
       int p = Integer.parseInt(preço);
       CD a = new CD();
       
       a.setTitulo(titulo);
       a.setPreco(preço);
       a.setcapa(capa);
       
       sql.Inserir_CadastrarCDs(a);
       Conexao.FecharConexao(con);
       
       Titulo.setText("");
       Preço.setText("");
       tfcapa.setText("");
       JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso", 
               "Loja de CDs", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarCDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCDs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbcapa;
    private javax.swing.JTextField Preço;
    private javax.swing.JTextField Titulo;
    private javax.swing.JButton btnCapa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField tfcapa;
    // End of variables declaration//GEN-END:variables

    
}
