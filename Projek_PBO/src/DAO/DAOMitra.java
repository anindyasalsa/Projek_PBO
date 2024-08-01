/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOMitra;
import Helper.KoneksiDB;
import Model.Mitra;
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
public class DAOMitra implements IDAOMitra {
    Connection con;
    
    private  String strRead = "SELECT * FROM tbl_mitra";
    private  String strInsert = "INSERT INTO tbl_mitra(id_mitra, id, jenis) VALUES (?, ?, ?)";
    private  String strUpdate = "UPDATE tbl_mitra SET id = ?, jenis = ? WHERE id_mitra = ?";
    private  String strDelete = "DELETE FROM tbl_mitra WHERE id_mitra = ?";
    
    public DAOMitra()
    {
       con = KoneksiDB.getConnection();
    }
    
    @Override
    public List<Mitra> getAll() 
    {
        List<Mitra> lstMitra = null;
        try
        { 
            lstMitra = new ArrayList<>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next())
            {
                Mitra mitra = new Mitra();
                mitra.setId_Mitra(rs.getInt("id_mitra"));
                mitra.setId(rs.getInt("id"));
                mitra.setJenis(rs.getString("jenis"));
                lstMitra.add(mitra);
            }
        }
        catch(SQLException e)
        {
            System.out.println("error: "+e);
        }
        return lstMitra;
    }    
 
    @Override
    public void insert(Mitra b) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setInt(1, b.getId_Mitra());
            statement.setInt(2, b.getId());
            statement.setString(3, b.getJenis());
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
    public void update(Mitra b) 
    {
         PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            statement.setInt(1, b.getId());
            statement.setString(2, b.getJenis());
            statement.setInt(3, b.getId_Mitra());
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
    public void delete(int Id_Mitra) 
    {
         PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strDelete);
            statement.setInt(1, Id_Mitra);
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