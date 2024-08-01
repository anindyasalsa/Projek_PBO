/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudmvcdao;
import Helper.KoneksiDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ASUS
 */
public class CRUDMVCDAO {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       KoneksiDB.getConnection();
    }
    
}
