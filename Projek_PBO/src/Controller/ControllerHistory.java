/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOHistory;
import DAOInterface.IDAOHistory;
import Model.History;
import Model.TabelModelHistory;
import View.FormHistory;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerHistory {
    FormHistory frmHistory;
    IDAOHistory iHistory;
    List<History> lstHistory;
    
    public ControllerHistory(FormHistory frmHistory) 
    {
        this.frmHistory = frmHistory;
        iHistory = new DAOHistory();
    }
    
    public void isiTable()
    {
        lstHistory = iHistory.getAll();
        TabelModelHistory tabelHistory = new TabelModelHistory(lstHistory);
        frmHistory.getTabelData().setModel(tabelHistory);
    }
            
            
    public void insert()
    {
            History b = new History();
            b.setId_Transaksi(Integer.parseInt(frmHistory.gettxtId_Transaksi().getText()));
            b.setId(Integer.parseInt(frmHistory.gettxtId().getText()));
            b.setTanggal(frmHistory.gettxtTanggal().getText());
            b.setKategori(frmHistory.gettxtKategori().getSelectedItem().toString());
            b.setJumlah(frmHistory.gettxtJumlah().getText());
            b.setDeskripsi(frmHistory.gettxtDeskripsi().getText());
            iHistory.insert(b);
            JOptionPane.showMessageDialog(null, "Input berhasil");
            isiTable(); 
            reset(); 
    }
    
    public void reset()
    {
        if (!frmHistory.gettxtId_Transaksi().isEnabled()) {
            frmHistory.gettxtId_Transaksi().setEnabled(true);
        }
        frmHistory.gettxtId_Transaksi().setText("");
        frmHistory.gettxtId().setText("");
        frmHistory.gettxtTanggal().setText("");
        frmHistory.gettxtKategori().setSelectedItem("Pemasukan");
        frmHistory.gettxtJumlah().setText("");
        frmHistory.gettxtDeskripsi().setText("");
    }
    
    public void isiField(int row)
    {
        frmHistory.gettxtId_Transaksi().setEnabled(false);
        frmHistory.gettxtId_Transaksi().setText(lstHistory.get(row).getId_Transaksi().toString());
        frmHistory.gettxtId().setText(lstHistory.get(row).getId().toString());
        frmHistory.gettxtTanggal().setText(lstHistory.get(row).getTanggal());
        frmHistory.gettxtKategori().setSelectedItem(lstHistory.get(row).getKategori());
        frmHistory.gettxtJumlah().setText(lstHistory.get(row).getJumlah());
        frmHistory.gettxtDeskripsi().setText(lstHistory.get(row).getDeskripsi());
    }
    
    public void update()
    {
        History b = new History();
            b.setId_Transaksi(Integer.parseInt(frmHistory.gettxtId_Transaksi().getText()));
            b.setId(Integer.parseInt(frmHistory.gettxtId().getText()));
            b.setTanggal(frmHistory.gettxtTanggal().getText());
            b.setKategori(frmHistory.gettxtKategori().getSelectedItem().toString());
            b.setJumlah(frmHistory.gettxtJumlah().getText());
            b.setDeskripsi(frmHistory.gettxtDeskripsi().getText());
            iHistory.update(b);
            JOptionPane.showMessageDialog(null, "Update berhasil");
            isiTable(); 
            reset(); 
    }

    public void delete() {
        History b = new History();
        iHistory.delete(Integer.parseInt(frmHistory.gettxtId_Transaksi().getText()));
        JOptionPane.showMessageDialog(null, "delete berhasil");    
    }
}
