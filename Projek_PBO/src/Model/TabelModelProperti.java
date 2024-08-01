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
public class TabelModelProperti extends AbstractTableModel{
        
    List<Properti> lstProperti;
    
    public TabelModelProperti(List<Properti> lstProperti)
    {
        this.lstProperti = lstProperti;
    }
    
    @Override
    public int getRowCount() {
        return this.lstProperti.size();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column){
            case 0:
                return "ID";
            case 1:
                return"Nama";
            case 2:
                return "Jenis";
            case 3:
                return "Alamat";
            case 4:
                return "Kota";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch (columnIndex){
            case 0:
                return lstProperti.get(rowIndex).getId();
            case 1:
                return lstProperti.get(rowIndex).getNama();
            case 2:
                return lstProperti.get(rowIndex).getJenis();
            case 3:
                return lstProperti.get(rowIndex).getAlamat();
            case 4: 
                return lstProperti.get(rowIndex).getKota();
            default:
                return null;
        }
    }
}
