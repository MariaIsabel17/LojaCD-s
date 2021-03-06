/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Cadastrar;

import Principal.Menu;
import Principal.Menu2;

import DAO.MusicaDAO;
import DAO.Conexao;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Modelo.Musica;

/**
 *
 * @author Vinicius de Almeida
 */
public class Cadastrarmusica extends javax.swing.JFrame {

    /**
     * Creates new form Cadastramusica
     */
    public Cadastrarmusica() {
        initComponents();
        setSize(500, 425);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Genero = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        Dura = new javax.swing.JTextField();
        Compo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Cadastrar músicas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 10, 330, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Duração:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 130, 80, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Genero:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 270, 120, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("ID do CD:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 60, 90, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("compositor:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 200, 120, 20);
        getContentPane().add(Genero);
        Genero.setBounds(70, 300, 300, 30);
        getContentPane().add(Nome);
        Nome.setBounds(70, 90, 300, 30);
        getContentPane().add(Dura);
        Dura.setBounds(70, 160, 300, 30);
        getContentPane().add(Compo);
        Compo.setBounds(70, 230, 300, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 60, 60, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(280, 60, 90, 20);

        jToggleButton2.setBackground(new java.awt.Color(0, 255, 0));
        jToggleButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton2.setText("Cadastrar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(70, 340, 120, 40);

        jToggleButton3.setBackground(new java.awt.Color(0, 51, 255));
        jToggleButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton3.setText("Voltar");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(250, 340, 80, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/04.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
          new Menu2().setVisible(true);
          dispose();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
          
       String nome = Nome.getText();
       String dura = Dura.getText();
       String compo = Compo.getText();
       String genero = Genero.getText();
       
       if (Nome.equals("")|| Dura.equals("") || Compo.equals("") || Genero.equals("")){
           JOptionPane.showMessageDialog(null, "nenhum campo pode estar vazio", 
                   "Loja de CDs", JOptionPane.WARNING_MESSAGE);
       
       } else {
       Connection con = Conexao.AbrirConexao();
       MusicaDAO sql = new MusicaDAO(con);
       Musica a = new Musica();
       
       a.setNome(nome);
       a.setDura(dura);
       a.setCompo(compo);
       a.setGenero(genero);
       
       sql.Inserir_Cadastrarmusica(a);
       Conexao.FecharConexao(con);
       
       Nome.setText("");
       Dura.setText("");
       Compo.setText("");
       Genero.setText("");
       JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso", "Loja de CDs", JOptionPane.INFORMATION_MESSAGE)
;
       }
    }                                              

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
            java.util.logging.Logger.getLogger(Cadastrarmusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrarmusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrarmusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrarmusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrarmusica().setVisible(true);
            }
        });    

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Compo;
    private javax.swing.JTextField Dura;
    private javax.swing.JTextField Genero;
    private javax.swing.JTextField Nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
