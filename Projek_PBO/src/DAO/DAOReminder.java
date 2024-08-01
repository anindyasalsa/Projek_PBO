/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOReminder;
import Helper.KoneksiDB;
import Model.Reminder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DAOReminder implements IDAOReminder {
    Connection con;
 
    private  String strRead = "SELECT * FROM tbl_reminder";
    private  String strInsert = "INSERT INTO tbl_reminder(id_reminder, id, tanggal, deskripsi) VALUES (?, ?, ?, ?)";
    private  String strUpdate = "UPDATE tbl_reminder SET id = ?, tanggal = ?, deskripsi = ? WHERE id_reminder = ?";
    private  String strDelete = "DELETE FROM tbl_reminder WHERE id_reminder = ?";
    
    public DAOReminder()
    {
       con = KoneksiDB.getConnection();
    }

    @Override
    public List<Reminder> getAll() 
    {
        List<Reminder> lstReminder = null;
        try
        { 
            lstReminder = new ArrayList<>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next())
            {
                Reminder reminder = new Reminder();
                reminder.setId_Reminder(rs.getInt("id_reminder"));
                reminder.setId(rs.getInt("id"));
                reminder.setTanggal(rs.getString("tanggal"));
                reminder.setDeskripsi(rs.getString("deskripsi"));
                lstReminder.add(reminder);
            }
        }
        catch(SQLException e)
        {
            System.out.println("error: "+e);
        }
        return lstReminder;
    }    

    @Override
    public void insert(Reminder b) 
    {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setInt(1, b.getId_Reminder());
            statement.setInt(2, b.getId());
            statement.setString(3, b.getTanggal());
            statement.setString(4, b.getDeskripsi());
            statement.execute();
        }catch(SQLException e)
        {
          System.out.println("gagal input");
        }    
        finally
        {
            try {
                statement.close();
            }catch (SQLException ex){
                System.out.println("gagal input");
            }
            
        }
    } 

    @Override
    public void update(Reminder b) 
    {
         PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            statement.setInt(1, b.getId());
            statement.setString(2, b.getTanggal());
            statement.setString(3, b.getDeskripsi());
            statement.setInt(4, b.getId_Reminder());
            statement.executeUpdate();
        }catch(SQLException e)
        {
          System.out.println("gagal input");
        }
        finally
        {
            try {
                statement.close();
            }catch (SQLException ex){
                System.out.println("gagal input");
            }
        }
    }    

    @Override
    public void delete(int Id_Reminder) {
         PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strDelete);
            statement.setInt(1, Id_Reminder);
            statement.execute();
        }catch(SQLException e)
        {
          System.out.println("gagal delete");  
        }
        finally
        {
            try {
                statement.close();
            }catch (SQLException ex){
                System.out.println("gagal delete");
            }
        }
    }
}

