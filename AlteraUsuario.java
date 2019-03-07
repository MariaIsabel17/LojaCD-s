/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Alterar;

import DAO.CadastrarusuDAO;
import DAO.Conexao;
import Modelo.cadastrarusu;
import Principal.Menu;
import Principal.Menu2;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius de Almeida
 */
public class AlteraUsuario extends javax.swing.JFrame {

    public AlteraUsuario() {
        initComponents();
        setSize(500, 428);
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tele = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        senha2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        senha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        Titulo1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Senha:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Cofimar senha:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(41, 333, 134, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Pesguisar id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 40, 110, 22);
        getContentPane().add(Titulo2);
        Titulo2.setBounds(390, 40, 50, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Cadastrar Usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 0, 320, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 50, 80, 20);
        getContentPane().add(tele);
        tele.setBounds(280, 220, 170, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 190, 90, 20);
        getContentPane().add(usuario);
        usuario.setBounds(40, 80, 410, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 120, 70, 20);
        getContentPane().add(email);
        email.setBounds(40, 150, 410, 30);
        getContentPane().add(senha2);
        senha2.setBounds(40, 360, 160, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Login:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 260, 70, 20);
        getContentPane().add(login);
        login.setBounds(40, 290, 230, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("CPF:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 190, 70, 22);
        getContentPane().add(senha);
        senha.setBounds(280, 290, 170, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Senha:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(280, 260, 70, 20);
        getContentPane().add(cpf);
        cpf.setBounds(40, 220, 230, 30);

        jToggleButton1.setBackground(new java.awt.Color(0, 102, 255));
        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton1.setText("Voltar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(377, 350, 73, 40);

        jToggleButton2.setBackground(new java.awt.Color(255, 102, 0));
        jToggleButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton2.setText("Salvar alteração");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(226, 350, 145, 40);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 40, 50, 30);

        Titulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo1ActionPerformed(evt);
            }
        });
        getContentPane().add(Titulo1);
        Titulo1.setBounds(230, 40, 60, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 40, 18, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/02.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      new Menu().setVisible(true);
      dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
     
        String Nome = usuario.getText();
        String Email = email.getText();
        String Cpf = cpf.getText();
        String Telefone = tele.getText();
        String Login = login.getText();
        String Senha = senha.getText();
        
        int id = Integer.parseInt(Titulo2.getText());

        if (usuario.equals("")|| email.equals("")  || cpf.equals("") || tele.equals("") 
                || login.equals("") || senha.equals("")){
            JOptionPane.showMessageDialog(null, "nenhum campo pode estar vazio",
                "Loja de CDs", JOptionPane.WARNING_MESSAGE);

        } else {
            Connection con = Conexao.AbrirConexao();
             CadastrarusuDAO sql = new CadastrarusuDAO(con);
            
            cadastrarusu a = new cadastrarusu();
            
            a.setNome(Nome);
            a.setEmail(Email);
            a.setCpf(Cpf);
            a.setTelefone(Telefone);
            a.setLogin(Login);
            a.setSenha(Senha);
            a.setcodigo(id);

            sql.Aleterar_Usuario(a);
            Conexao.FecharConexao(con);

            JOptionPane.showMessageDialog(null,"Alteraçao  realizada com sucesso",
                "Loja de CDs", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new Menu2().setVisible(true);
           
        }
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void Titulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
           String id = Titulo1.getText();
           if(id.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null," Informe o id para alterar as informaçes ! ","Loja de Cd", JOptionPane.INFORMATION_MESSAGE);

           }else{
            Connection con = Conexao.AbrirConexao();
            CadastrarusuDAO cd = new CadastrarusuDAO(con);

            List<cadastrarusu> lista = new ArrayList<>();
            lista = cd.ListarUsuarioId(id);

            for( cadastrarusu a: lista ){
                Titulo1.setText("");
                Titulo2.setText(""+ a.getcodigo());
                usuario.setText(""+ a.getNome());
                email.setText(""+ a.getEmail());
                cpf.setText(""+ a.getCpf());
                tele.setText(""+ a.getTelefone());
                login.setText(""+ a.getLogin());
                senha.setText(""+ a.getSenha());
            
            }
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlteraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteraUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Titulo1;
    private javax.swing.JTextField Titulo2;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField login;
    private javax.swing.JTextField senha;
    private javax.swing.JTextField senha2;
    private javax.swing.JTextField tele;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
