/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JTextField;

/**
 *
 * @author Vinicius de Almeida
 */
public class Musica {
    
    
     private int codigo;
     private String nome;
     private String dura;
     private String compo;
     private String genero;
     

 public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDura() {
        return dura;
    }

    public void setDura(String dura ) {
        this.dura = dura;
    }
    public String getCompo() {
        return compo;
    }

    public void setCompo(String compo) {
        this.compo = compo;
    }
    
   public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }    

    
    
}

