/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.CD;
import Modelo.Carrinho;
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
public class CarrinhoDAO extends ExecuteSQL {
     
    public CarrinhoDAO(Connection con) {
        super(con);
    }
    

  public  String Cadastrar_Carrinho(Carrinho a){

    String sql = "INSERT INTO carrinho VALUES (0,?,?,?)";
    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
    ps.setString(1,a.getNome());
    ps.setString(2,a.getPreco());
     ps.setString(2,a.getCapa());
    
    
    if(ps.executeUpdate() > 0){
        return "Inserido com sucesso";
    }else{
        return "Erro ao Insessir";
                    }
    }catch(SQLException e){
        return e.getMessage();
    }
}  
  
    public List<CD>  ListarCarrinho(String nome){
    
    String sql = "SELECT * FROM `carrinho` JOIN `cd` WHERE nome =  '"+nome+"'AND carrinho.id_cd = cd.codigo";
    List<CD> lista = new ArrayList<>();
    
    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
    ResultSet rs =  ps.executeQuery();
    
    if(rs != null){
        while(rs.next()){
            CD a = new CD();
            a.setTitulo(rs.getString(4));
            a.setcodigo(rs.getInt(3));
            a.setPreco(rs.getString(6));
            lista.add(a);
            }
        return lista;
    }else{
        return null;
        }
    
    }catch( SQLException e){
        return null;
    }
    
}
}
