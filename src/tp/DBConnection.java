/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hanifkf
 */
public class DBConnection {
     private static Connection koneksi;
    private static String host="jdbc:mysql://localhost:3306/tpmod10";
    private static String user="root";
    private static String pass="";
private static String driverName = "com.mysql.jdbc.Driver";
    public DBConnection() {
    }
    
    public Connection GetConnection() throws SQLException{
    if (koneksi == null) {  
       try {  
         Class.forName(driverName);  
         System.out.println("Class Driver Ditemukan");  
         try {  
           koneksi = DriverManager.getConnection(host, user, pass);  
           System.out.println("Koneksi Database Sukses");  
         } catch (SQLException se) {  
           System.out.println("Koneksi Database Gagal : " + se);  
           System.exit(0);  
         }  
       } catch (ClassNotFoundException cnfe) {  
         System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe);  
         System.exit(0);  
       }  
     }  
        return koneksi;
    }
}
