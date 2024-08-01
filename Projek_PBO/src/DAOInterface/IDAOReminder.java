/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Reminder;
import java.util.List;

/**
 * 
 * @author ASUS
 */
public interface IDAOReminder  {
    //read data
    public List<Reminder> getAll();
    //insert data
    public void insert(Reminder b);
    //update data
    public void update(Reminder b);
    //delete data
    public void delete(int b);
    
}
