package DAO;


import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO extends ExecuteSQL {
    public UsuarioDAO (Connection con){
        super(con);
      }
   
    
     public boolean Logar(String login, String senha){
        boolean finalResult = false;
    String consulta = "SELECT * FROM `usuario` WHERE nome = '"+login+"' AND senha = '"+senha+"'";     
        try {
            PreparedStatement ps = 
            getCon().prepareStatement(consulta);
     
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Usuario a = new Usuario();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
            }
            
        } catch (SQLException ex) {
           ex.getMessage();
        }
    return finalResult;
    }
    
}
