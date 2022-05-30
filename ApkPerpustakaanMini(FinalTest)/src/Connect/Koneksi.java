/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class Koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {

        try {
            if (koneksi == null ){
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpusmini", "root", "");
            }
            System.out.println("terkoneksi");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return koneksi;
    }

    public static void main(String[] args) {
        getKoneksi();
    }
    
}
