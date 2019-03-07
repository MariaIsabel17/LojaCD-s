/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Cadastrar;

import DAO.CadastrarusuDAO;
import DAO.Conexao;
import Modelo.cadastrarusu;
import Principal.Loginprausu;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius de Almeida
 */
public class Cadastrarusu extends javax.swing.JFrame {

    /**
     * Creates new form cadastrarusu
     */
    public Cadastrarusu() {
        initComponents();
        setSize(500, 440);
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
        Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Telefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        f = new javax.swing.JPasswordField();
        w = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 40, 60, 20);
        getContentPane().add(Nome);
        Nome.setBounds(40, 60, 380, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 94, 60, 20);
        getContentPane().add(Email);
        Email.setBounds(39, 120, 380, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(38, 150, 50, 22);
        getContentPane().add(Cpf);
        Cpf.setBounds(40, 170, 380, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 200, 100, 20);
        getContentPane().add(Telefone);
        Telefone.setBounds(40, 220, 380, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Login");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 250, 49, 22);
        getContentPane().add(Login);
        Login.setBounds(40, 280, 160, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Senha:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 260, 70, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Comfirmação de senha");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 320, 210, 22);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 360, 110, 30);

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 360, 80, 30);
        getContentPane().add(f);
        f.setBounds(220, 280, 200, 30);
        getContentPane().add(w);
        w.setBounds(251, 320, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/02.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = Nome.getText();
        String email = Email.getText();
        String cpf = Cpf.getText();
        String telefone = Telefone.getText();
        String login = Login.getText();
        String senha = f.getText();
        String senha2 = w.getText();
        if (nome.equals("")|| email.equals("")|| cpf.equals("")|| telefone.equals("")|| login.equals("")|| senha.equals("")|| senha2.equals("")){
        JOptionPane.showMessageDialog(null,"nenhum campo pode estar vazio", "Loja de CDs", JOptionPane.WARNING_MESSAGE);
        } else{
            Connection con = Conexao.AbrirConexao();
            CadastrarusuDAO sql = new CadastrarusuDAO(con);
            cadastrarusu a = new cadastrarusu();
            
            a.setNome(nome);
            a.setEmail(email);
            a.setCpf(cpf);
            a.setTelefone(telefone);
            a.setLogin(login);
            a.setSenha(senha);
            a.setSenha2(senha2);
            
            sql.Inserir_Cadastrarusu(a);
            Conexao.FecharConexao(con);
            
            Nome.setText("");
            Email.setText("");
            Cpf.setText("");
            Telefone.setText("");
            Login.setText("");
            f.setText("");
            w.setText("");
            
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso.", "Loja de CDs", JOptionPane.INFORMATION_MESSAGE);
         
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new Loginprausu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrarusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrarusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrarusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrarusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrarusu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cpf;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Login;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Telefone;
    private javax.swing.JPasswordField f;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField w;
    // End of variables declaration//GEN-END:variables
}