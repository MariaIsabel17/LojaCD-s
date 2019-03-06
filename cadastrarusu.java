/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Vinicius de Almeida
 */ 
public class cadastrarusu {
    private int codigo;
    private String Nome;
    private String Email;
    private String Cpf;
    private String Telefone;
    private String Login;
    private String Senha;
    private String Senha2;
  
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
    
    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public String getSenha2() {
        return Senha2;
    }

    public void setSenha2(String Senha2) {
        this.Senha2 = Senha2;
    }
        
      public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int codigo ) {
        this.codigo = codigo;
    }
}
