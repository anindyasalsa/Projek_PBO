/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;

import Model.Mitra;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IDAOMitra {
    //read data
    public List<Mitra> getAll();
    //insert data
    public void insert(Mitra b);
    //update data
    public void update(Mitra b);
    //delete data
    public void delete(int b);
}
