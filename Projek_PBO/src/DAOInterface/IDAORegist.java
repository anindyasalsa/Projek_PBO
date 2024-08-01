/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;

import Model.SignUp;
import View.Regist;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IDAORegist {
    //read data
    public List<SignUp> getAll();
    //insert data
    public void insert(SignUp b);
}

