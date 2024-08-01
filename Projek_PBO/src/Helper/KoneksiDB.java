/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class KoneksiDB {
    static Connection con;
    
    public static Connection getConnection(){
        if(con == null){
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_projek","root","anin");
            System.out.print("berhasil ");
            
        } catch (ClassNotFoundException ex) {
              System.out.println("error");
        } catch (SQLException ex) {
              System.out.print("error DB");
            }
        }
        return con;
    }
}
   
