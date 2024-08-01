/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Properti;
import java.util.List;

/**
 * 
 * @author ASUS
 */
public interface IDAOProperti  {
    //read data
    public List<Properti> getAll();
    //insert data
    public void insert(Properti b);
    //update data
    public void update(Properti b);
    //delete data
    public void delete(int b);
    //search data
    public List<Properti> getAllByKota(String Kota);
}
