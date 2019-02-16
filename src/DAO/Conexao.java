/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/lojadecd";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
         
        try { 
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
             throw new RuntimeException("Erro na conexão", ex);
        }
    }
     
    public static void closeConnection(Connection con){
    
    if(con != null){
       
        try {
            con.close();
        } catch (SQLException ex) {
            System.err.print("Erro");
        }
        
       }
    }    
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
    
    if(stmt != null){
       
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        closeConnection(con);
 } 
        
        
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
     if(rs != null){
       
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
     
        closeConnection(con, stmt);
        
    }    
}
