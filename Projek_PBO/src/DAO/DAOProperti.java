/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOProperti;
import Helper.KoneksiDB;
import Model.Properti;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;


/**
 *
 * @author ASUS
 */
public class DAOProperti implements IDAOProperti{
    Connection con;
    
    String strRead = "select * from tbl_properti";
    String strInsert = "insert into tbl_properti(id,nama,jenis,alamat,kota) values (?,?,?,?,?);";
    String strUpdate = "update tbl_properti set nama=?, jenis=?, alamat=?, kota=?, where id=?";
    String strDelete = "delete from tbl_properti where id=?";
    String strSearch = "select * from tbl_properti where kota like ?;";
    
    public DAOProperti()
    {
       con = KoneksiDB.getConnection();
    }
    
    @Override 
    public List<Properti> getAll() 
    {
        List<Properti> lstProperti = null;
        try
        { 
            lstProperti = new ArrayList<>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next())
            {
                Properti properti = new Properti();
                properti.setId(rs.getInt("id"));
                properti.setNama(rs.getString("nama"));
                properti.setJenis(rs.getString("jenis"));
                properti.setAlamat(rs.getString("alamat"));
                properti.setKota(rs.getString("kota"));
                lstProperti.add(properti);
            }
        }
        catch(SQLException e)
        {
            System.out.println("error: "+e);
        }
        return lstProperti;
    }
    
    
    
    @Override
    public void insert(Properti b) 
    {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setInt(1, b.getId());
            statement.setString(2,b.getNama());
            statement.setString(3, b.getJenis());
            statement.setString(4,b.getAlamat());
            statement.setString(5,b.getKota());
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
    public void update(Properti b) 
    {
         PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            statement.setString(1,b.getNama());
            statement.setString(2, b.getJenis());
            statement.setString(3,b.getAlamat());
            statement.setString(4,b.getKota());
            statement.setInt(5, b.getId());
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
    public void delete(int id) 
    {
         PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strDelete);
            statement.setInt(1, id);
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
    

    @Override
    public List<Properti> getAllByKota(String Kota) {
         List<Properti> lstProperti = null;
        try
        { 
            lstProperti = new ArrayList<Properti>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+Kota+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                Properti properti = new Properti();
                properti.setId(rs.getInt("Id"));
                properti.setNama(rs.getString("Nama"));
                properti.setJenis(rs.getString("Jenis"));
                properti.setAlamat(rs.getString("Alamat"));
                properti.setKota(rs.getString("Kota"));
                lstProperti.add(properti);
            }
        }
        catch(SQLException e)
        {
            System.out.println("error: "+e);
        }
        return lstProperti;
    }    
    }
