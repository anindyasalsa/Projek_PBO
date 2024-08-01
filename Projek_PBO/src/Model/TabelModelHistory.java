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
public class TabelModelHistory extends AbstractTableModel{
         
    List<History> lstHistory;
    

    public TabelModelHistory(List<History> lstHistory)
    {
        this.lstHistory = lstHistory;
    }
    
    @Override
    public int getRowCount() {
        return this.lstHistory.size();
    }
    
    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column){
            case 0:
                return "Id_Transaksi";
            case 1:
                return"Id";
            case 2:
                return "Tanggal";
            case 3:
                return "Kategori";
            case 4:
                return "Jumlah";
            case 5:
                return "Deskripsi";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch (columnIndex){
            case 0:
                return lstHistory.get(rowIndex).getId_Transaksi();
            case 1:
                return lstHistory.get(rowIndex).getId();
            case 2:
                return lstHistory.get(rowIndex).getTanggal();
            case 3:
                return lstHistory.get(rowIndex).getKategori();
            case 4:
                return lstHistory.get(rowIndex).getJumlah();
            case 5:
                return lstHistory.get(rowIndex).getDeskripsi();
            default:
                return null;
        }
    }
}
