
package DAO;

import Modelo.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class CompraDAO  extends ExecuteSQL{
    
    public CompraDAO (Connection con) {
        super(con);
    }
    
    
    
    public String Comprar_CD (Compra a){
        String sql = "INSERT INTO comprarcd values (0,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getIdcd());
            ps.setString(2, a.getFormapagamento());
            ps.setString(3, a.getTipopagamento());
            ps.setString(4, a.getTipoenvio());
            ps.setString(5, a.getEndereco());
            
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
