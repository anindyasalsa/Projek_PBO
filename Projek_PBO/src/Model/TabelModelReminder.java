/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TabelModelReminder extends AbstractTableModel{
         
    List<Reminder> lstReminder;
    
    public TabelModelReminder(List<Reminder> lstReminder)
    {
        this.lstReminder = lstReminder;
    }
    
    @Override
    public int getRowCount() {
        return this.lstReminder.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column){
            case 0:
                return "Id_Reminder";
            case 1:
                return"Id";
            case 2:
                return "Tanggal";
            case 3:
                return "Deskripsi";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch (columnIndex){
            case 0:
                return lstReminder.get(rowIndex).getId_Reminder();
            case 1:
                return lstReminder.get(rowIndex).getId();
            case 2:
                return lstReminder.get(rowIndex).getTanggal();
            case 3:
                return lstReminder.get(rowIndex).getDeskripsi();
            default:
                return null;
        }
    }
}

