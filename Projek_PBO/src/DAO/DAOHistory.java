/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOHistory;
import Helper.KoneksiDB;
import Model.History;
import java.math.BigDecimal;
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

public class DAOHistory implements IDAOHistory{
    Connection con;
    
    private String strRead = "SELECT * FROM tbl_history";
    private String strInsert = "INSERT INTO tbl_history(id_transaksi, id, tanggal, kategori, jumlah, deskripsi) VALUES (?, ?, ?, ?, ?, ?)";
    private String strUpdate = "UPDATE tbl_history SET id = ?, tanggal = ?, kategori = ?, jumlah = ?, deskripsi = ? WHERE id_transaksi = ?";
    private String strDelete = "DELETE FROM tbl_history WHERE id_transaksi = ?";

    public DAOHistory()
    {
       con = KoneksiDB.getConnection();
    }
    
    @Override 
    public List<History> getAll() 
    {
        List<History> lstHistory = null;
        try
        { 
            lstHistory = new ArrayList<>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next())
            {
                History history = new History();
                history.setId_Transaksi(rs.getInt("id_transaksi"));
                history.setId(rs.getInt("id"));
                history.setTanggal(rs.getString("tanggal"));
                history.setKategori(rs.getString("kategori"));
                history.setJumlah(rs.getString("jumlah"));
                history.setDeskripsi(rs.getString("deskripsi"));
                lstHistory.add(history);
            }
        }
        catch(SQLException e)
        {
            System.out.println("error: "+e);
        }
        return lstHistory;
    }
    
    @Override
    public void insert(History b) 
    {
        PreparedStatement statement = null;
        try
        {
        statement = con.prepareStatement(strInsert);
        statement.setInt(1, b.getId_Transaksi()); 
        statement.setInt(2, b.getId());
        statement.setString(3, b.getTanggal());
        statement.setString(4, b.getKategori());
        statement.setBigDecimal(5, new BigDecimal(b.getJumlah())); 
        statement.setString(6, b.getDeskripsi());
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
    public void update(History b) 
    {
         PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            statement.setInt(1, b.getId());
            statement.setString(2, b.getTanggal());
            statement.setString(3, b.getKategori());
            statement.setString(4, b.getJumlah());
            statement.setString(5, b.getDeskripsi());
            statement.setInt(6, b.getId_Transaksi());
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
}