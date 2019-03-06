package DAO;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.CD;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CDDAO extends ExecuteSQL {

    public CDDAO(Connection con) {
        super(con);
    }
      
    

    public String Inserir_CadastrarCDs(CD a){
        String sql = "insert into cadastrarcd values (0,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getTitulo());
            ps.setString(2, a.getPreco());
            ps.setString(3, a.getcapa());
            
            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso.";
            
            }else {
                return "Erro ao inserir";
            
            }
         
        } catch (SQLException e){
            return e.getMessage();
        
        }
    
    }

    
    
    
    public List<CD> ListarCDS() {
     String sql = "SELECT * FROM `cadastrarcd`";
     List<CD> lista = new ArrayList<>();
     try {
     PreparedStatement ps = getCon(). prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
     if (rs != null) {
     while (rs.next()) {
     CD a = new CD();
     
     a.setcodigo(rs.getInt(1));
     a.setTitulo(rs.getString(2));
     a.setPreco(rs.getString(3));
     a.setcapa(rs.getString(4));
    
    
     
     
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
    
    public List<CD> ListarCdId( String id ) {
     String sql = "SELECT * FROM `cadastrarcd` WHERE id = "+id+" ";
     List<CD> lista = new ArrayList<>();
     try {
     PreparedStatement ps = getCon(). prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
     if (rs != null) {
     while (rs.next()) {
     CD a = new CD();
     
     a.setcodigo(rs.getInt(1));
     a.setTitulo(rs.getString(2));
     a.setPreco(rs.getString(3));
     a.setcapa(rs.getString(4));
     
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
                    
          
    
   public String Aleterar_Cd ( CD a){
    String sql = "UPDATE cadastrarcd SET nomeCd = ? , preco = ? , capa = ?    WHERE id = ? ";
    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
    
    ps.setString(1, a.getTitulo());
    ps.setString(2, a.getPreco());
    ps.setString(3, a.getcapa());
    ps.setInt(4, a.getcodigo());
    
        if(ps.executeUpdate() > 0){
        return "Atualizado com sucesso";}else{ return "Erro ao Atualizar";}
    }catch(SQLException e){
    return e.getMessage();
    }
    
    }
    

 public String Inserir_ExcluirCD(CD a){
     
   String sql = "DELETE FROM cadastrarcd WHERE id = ?";
   
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

 
