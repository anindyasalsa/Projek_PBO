/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOProperti;
import DAOInterface.IDAOProperti;
import Model.Properti;
import Model.TabelModelProperti;
import View.FormProperti;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerProperti {
    FormProperti frmProperti;
    IDAOProperti iProperti;
    List<Properti> lstProperti;
    
    public ControllerProperti(FormProperti frmProperti) {
        this.frmProperti = frmProperti;
        iProperti = new DAOProperti();
    }
    
    public void isiTable()
    {
        lstProperti = iProperti.getAll();
        TabelModelProperti tabelProperti = new TabelModelProperti(lstProperti);
        frmProperti.getTabelData().setModel(tabelProperti);
    }
            
    public void insert()
    {
        Properti b = new Properti();
        b.setId(Integer.parseInt(frmProperti.gettxtID().getText()));
        b.setNama(frmProperti.gettxtNama().getText());
        b.setJenis(frmProperti.gettxtJenis().getText());
        b.setAlamat(frmProperti.gettxtAlamat().getText());
        b.setKota(frmProperti.gettxtKota().getText());
        iProperti.insert(b);
        JOptionPane.showMessageDialog(null, "input berhasil");
    }
    
    public void reset()
    {
        if (!frmProperti.gettxtID().isEnabled())
            frmProperti.gettxtID().setEnabled(true);
        frmProperti.gettxtID().setText("");
        frmProperti.gettxtNama().setText("");
        frmProperti.gettxtJenis().setText("");
        frmProperti.gettxtAlamat().setText("");
        frmProperti.gettxtKota().setText("");
    }
    
    public void isiField(int row)
    {
        frmProperti.gettxtID().setEnabled(false);
        frmProperti.gettxtID().setText(lstProperti.get(row).getId().toString());
        frmProperti.gettxtNama().setText(lstProperti.get(row).getNama());
        frmProperti.gettxtJenis().setText(lstProperti.get(row).getJenis());
        frmProperti.gettxtAlamat().setText(lstProperti.get(row).getAlamat());
        frmProperti.gettxtKota().setText(lstProperti.get(row).getKota());
    }
    
    public void update()
    {
        Properti b = new Properti();
        b.setNama(frmProperti.gettxtNama().getText());
        b.setJenis(frmProperti.gettxtJenis().getText());
        b.setAlamat(frmProperti.gettxtAlamat().getText());
        b.setKota(frmProperti.gettxtKota().getText());
        b.setId(Integer.parseInt(frmProperti.gettxtID().getText()));
        iProperti.update(b);
        JOptionPane.showMessageDialog(null, "Update berhasil");
    }

    public void delete() {
        Properti b = new Properti();
        iProperti.delete(Integer.parseInt(frmProperti.gettxtID().getText()));
        JOptionPane.showMessageDialog(null, "delete berhasil");    
    }

    public void cari() {
        lstProperti = iProperti.getAllByKota(frmProperti.gettxtCariNama().getText());
        TabelModelProperti tabelProperti = new TabelModelProperti(lstProperti);
        frmProperti.getTabelData().setModel(tabelProperti);
    }
}