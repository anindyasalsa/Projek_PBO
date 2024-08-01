/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;

import Model.History;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IDAOHistory {
    //read data
    public List<History> getAll();
    //insert data
    public void insert(History b);
    //update data
    public void update(History b);
    //delete data
    public void delete(int b);
}
