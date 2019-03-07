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
public class Carrinho {

    public static void setValueAt(String titulo, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Nome;
    private String Preco;
    private String Capa;
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getPreco() {
        return Preco;
    }

    public void setPreco(String Preco) {
        this.Preco = Preco;
    }
    
    public String getCapa() {
        return Capa;
    }

    public void setCapa(String Capa) {
        this.Capa = Capa;
    }
    
}
