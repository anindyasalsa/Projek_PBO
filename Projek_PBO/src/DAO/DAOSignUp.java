/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAORegist;
import Helper.KoneksiDB;
import Model.SignUp;
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
public class DAOSignUp implements IDAORegist {
          
    Connection con;
    
    private final String strRead = "SELECT * FROM tbl_signup";
    private final String strInsert = "INSERT INTO tbl_signup(username, email, password, confirm_password) VALUES (?, ?, ?, ?)";
    
    public DAOSignUp()
    {
       con = KoneksiDB.getConnection();
    }

    @Override
    public List<SignUp> getAll() 
    {
        List<SignUp> lstRegist = null;
        try
        { 
            lstRegist = new ArrayList<>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next()) {
                SignUp regist = new SignUp();
                regist.setUsername(rs.getString("username"));
                regist.setEmail(rs.getString("email"));
                regist.setPassword(rs.getString("password"));
                regist.setConfirm_Password(rs.getString("confirm_password"));
                lstRegist.add(regist);
            }
        }
        catch(SQLException e)
        {
            System.out.println("error: "+e);
        }
        return lstRegist;
    }    

    @Override
    public void insert(SignUp b) 
    {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setString(1, b.getUsername());
            statement.setString(2, b.getEmail());
            statement.setString(3, b.getPassword());
            statement.setString(4, b.getConfirm_Password());
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
}


