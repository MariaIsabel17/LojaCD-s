/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.Musica;
/**
 *
 * @author Vinicius de Almeida
 */
public class MusicaDAO extends ExecuteSQL{
    
    public MusicaDAO(Connection con) {
        super(con);
    }

    
    public String Inserir_Cadastrarmusica(Musica a){
        String sql = "insert into cadastrarmusica values (0,?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getDura());
            ps.setString(3, a.getCompo());
            ps.setString(4, a.getGenero());
            
            
            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso.";
            
            }else {
                return "Erro ao inserir";
            
            }
         
        } catch (SQLException e){
            return e.getMessage();
        
        }
    
    }
}
