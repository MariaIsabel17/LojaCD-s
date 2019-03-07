package DAO;


import Modelo.prausu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class prausuDAO extends ExecuteSQL {
    public prausuDAO (Connection con){
        super(con);
      }
   
    
     public boolean Logar(String login, String senha){
        boolean finalResult = false;
    String consulta = "SELECT * FROM `cadastrarusuario` WHERE login = '"+login+"' AND senha = '"+senha+"'";     
        try {
            PreparedStatement ps = 
            getCon().prepareStatement(consulta);
     
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    prausu a = new prausu();
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
