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
public class TabelModelMitra extends AbstractTableModel{
         
    List<Mitra> lstMitra;
    
    public TabelModelMitra(List<Mitra> lstMitra)
    {
        this.lstMitra = lstMitra;
    }
    
    @Override
    public int getRowCount() {
        return this.lstMitra.size();
    }
    
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column){
            case 0:
                return "Id_Mitra";
            case 1:
                return"Id";
            case 2:
                return "Jenis";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch (columnIndex){
            case 0:
                return lstMitra.get(rowIndex).getId_Mitra();
            case 1:
                return lstMitra.get(rowIndex).getId();
            case 2:
                return lstMitra.get(rowIndex).getJenis();
            default:
                return null;
        }
    }
}

