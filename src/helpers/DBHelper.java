/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steve
 */
public class DBHelper {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName(Constants.DRIVER);
            con = DriverManager.getConnection(Constants.URL,Constants.USER,Constants.PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;
    }
    
    public static Statement getStatement(Connection con){
        Statement st = null;
        if(con!=null){
            try {
                st = con.createStatement();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return st;
    }
    
    public static PreparedStatement getPreparedStatement(Connection con, String query){
        PreparedStatement ps = null;
        if(con!=null && (query!=null || query!="")){
            try {
                ps = con.prepareStatement(query);
            } catch (Exception ex) {
               ex.printStackTrace();
            }
        }
        return ps;
    }
    
    public static void close(java.util.Scanner sc){
        if(sc!=null){
            sc.close();
        }
    }
    
    public static void close(java.sql.Statement st){
        if(st!=null){
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void close(java.sql.PreparedStatement ps){
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void close(java.sql.Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void close(java.sql.ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
