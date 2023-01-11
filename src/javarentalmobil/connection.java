/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarentalmobil;

/**
 *
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static Connection conn=null;
    
        public static Connection getConnection(){
        if(conn!=null)
            return conn;
        else{
            String dburl="jdbc:mysql://localhost:3306/"+"javarentalmobil?user=root&password";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection(dburl);
                System.out.println("Sukses");
            }
            catch(ClassNotFoundException | SQLException e){
                System.out.println("Gagal"+e);
            }
            return conn;
        }
    }
    public static void main(String[] args) {
        getConnection();
    }
    
}
