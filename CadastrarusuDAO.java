/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.cadastrarusu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius de Almeida
 */
public class CadastrarusuDAO extends ExecuteSQL {
    public CadastrarusuDAO(Connection con) {
        super(con);
    }

    public String Inserir_Cadastrarusu(cadastrarusu a){
        String sql = "insert into cadastrarusuario values (0,?,?,?,?,?,?,?)";
        try {
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setString(1,a.getNome());
        ps.setString(2,a.getEmail());
        ps.setString(3,a.getCpf());
        ps.setString(4,a.getTelefone());
        ps.setString(5,a.getLogin());
        ps.setString(6,a.getSenha());
        ps.setString(7,a.getSenha2());
        
       
        if (ps.executeUpdate() > 0){
        return "Cadastrado com sucesso.";
        
        }else{
        return "Erro ao cadastrar";
        
        }
        
        
        } catch (SQLException e){
        return e.getMessage();
        }
    
}
    
  public List<cadastrarusu> ListarUsuarios() {
     String sql = "SELECT * FROM `cadastrarusuario`";
     List<cadastrarusu> lista = new ArrayList<>();
     try {
     PreparedStatement ps = getCon(). prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
     if (rs != null) {
     while (rs.next()) {
     cadastrarusu a = new cadastrarusu();
     
     a.setcodigo(rs.getInt(1));
     a.setNome(rs.getString(2));
     a.setEmail(rs.getString(3));   
     
     lista.add(a);
} 
  return lista;
} else {
   return null;
}
} catch (SQLException e) {
   return null;
}
}

  
   public String Aleterar_Usuario (cadastrarusu a){
    String sql = "UPDATE cadastrarusuario SET usuario = ? , email = ? , cpf = ?, telefone = ?, login = ?, senha = ?  WHERE id = ? ";
    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
    
    ps.setString(1, a.getNome());
    ps.setString(2, a.getEmail());
    ps.setString(3, a.getCpf());
    ps.setString(4, a.getTelefone());
    ps.setString(5, a.getLogin());
    ps.setString(6, a.getSenha());
    ps.setInt(7, a.getcodigo());
    
    
        if(ps.executeUpdate() > 0){
        return "Atualizado com sucesso";}else{ return "Erro ao Atualizar";}
    }catch(SQLException e){
    return e.getMessage();
    }
    
    }
    
    public List<cadastrarusu> ListarUsuarioId( String id ) {
     String sql = "SELECT * FROM `cadastrarusuario` WHERE id = "+id+" ";
     List<cadastrarusu> lista = new ArrayList<>();
     try {
     PreparedStatement ps = getCon(). prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
     if (rs != null) {
     while (rs.next()) {
     cadastrarusu a = new cadastrarusu();
     
     a.setcodigo(rs.getInt(1));
     a.setNome(rs.getString(2));
     a.setEmail(rs.getString(3));
     a.setCpf(rs.getString(4));
     a.setTelefone(rs.getString(5));
     a.setLogin(rs.getString(6));
     a.setSenha(rs.getString(7));
     
     
     lista.add(a);
} 
  return lista;
} else {
   return null;
}
} catch (SQLException e) {
   return null;
}
   
}
   
   
 public String Inserir_ExcluirUsuario(cadastrarusu a){
     
   String sql = "DELETE FROM cadastrarusuario WHERE id = ?";
   
   try{
       PreparedStatement ps = getCon().prepareStatement(sql);
           
            ps.setInt(1, a.getcodigo());
            
   
     if(ps.executeUpdate() > 0){
          return "Excluido com Sucesso";
          
   }else{
            
   return "Erro ao Excluir";}
     
   }catch( SQLException e){
     return e.getMessage();
   }
   }
  
}
