/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOMitra;
import DAOInterface.IDAOMitra;
import Model.Mitra;
import Model.TabelModelMitra;
import View.FormMitra;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerMitra {
    
    FormMitra frmMitra;
    IDAOMitra iMitra;
    List<Mitra> lstMitra;
    
    public ControllerMitra(FormMitra frmMitra) 
    {
        this.frmMitra = frmMitra;
        iMitra = new DAOMitra();
    }
    
    public void isiTable()
    {
        lstMitra = iMitra.getAll();
        TabelModelMitra tabelMitra = new TabelModelMitra(lstMitra);
        frmMitra.getTabelData().setModel(tabelMitra);
    }
            
    public void insert()
    {
        Mitra b = new Mitra();
        b.setId_Mitra(Integer.parseInt(frmMitra.gettxtId_Mitra().getText()));
        b.setId(Integer.parseInt(frmMitra.gettxtId().getText()));
        b.setJenis(frmMitra.gettxtJenis().getText());
        iMitra.insert(b);
        JOptionPane.showMessageDialog(null, "input berhasil");
        isiTable();
    }
    
    public void reset()
    {
        if (!frmMitra.gettxtId_Mitra().isEnabled())
            frmMitra.gettxtId_Mitra().setEnabled(true);
        frmMitra.gettxtId_Mitra().setText("");
        frmMitra.gettxtId().setText("");
        frmMitra.gettxtJenis().setText("");
    }
    
    public void isiField(int row)
    {
        frmMitra.gettxtId_Mitra().setEnabled(false);
        frmMitra.gettxtId_Mitra().setText(lstMitra.get(row).getId_Mitra().toString());
        frmMitra.gettxtId().setText(lstMitra.get(row).getId().toString());
        frmMitra.gettxtJenis().setText(lstMitra.get(row).getJenis());
    }
    
    public void update()
    {
        Mitra b = new Mitra();
        b.setId(Integer.parseInt(frmMitra.gettxtId().getText()));
        b.setJenis(frmMitra.gettxtJenis().getText());
        b.setId_Mitra(Integer.parseInt(frmMitra.gettxtId_Mitra().getText()));
        iMitra.update(b);
        JOptionPane.showMessageDialog(null, "Update berhasil");
        isiTable();
    }

    public void delete() {
        Mitra b = new Mitra();
        iMitra.delete(Integer.parseInt(frmMitra.gettxtId_Mitra().getText()));
        JOptionPane.showMessageDialog(null, "delete berhasil");   
        isiTable();
    }
}
