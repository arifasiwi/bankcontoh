package antrianbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    public static Connection setKoneksi(){
        String connString = "jdbc:mysql://localhost/antrianbank";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //make connection
            conn = DriverManager.getConnection(connString, "root", "");
            System.out.println("Berhasil");
        } catch (Exception e) {
            System.out.println("Failed");
        }
        return conn;
    }
    
    public static int execute(String SQL){
        int status = 0;
        Connection koneksi = setKoneksi();
        try {
            Statement st = koneksi.createStatement();
            status = st.executeUpdate(SQL);
        } catch (Exception e) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;
    }
    
    public static ResultSet executeQuery(String SQL){
        ResultSet rs = null;
        Connection koneksi = setKoneksi();
        try {
            Statement st = koneksi.createStatement();
            rs = st.executeQuery(SQL);
        } catch (Exception e) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
        }   
        return rs;
    }
}
