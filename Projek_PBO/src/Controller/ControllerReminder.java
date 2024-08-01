/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOReminder;
import DAOInterface.IDAOReminder;
import Model.Reminder;
import Model.TabelModelReminder;
import View.FormReminder;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerReminder {
    FormReminder frmReminder;
    IDAOReminder iReminder;
    List<Reminder> lstReminder;
    
    public ControllerReminder(FormReminder frmReminder) 
    {
        this.frmReminder = frmReminder;
        iReminder = new DAOReminder();
    }
    
    public void isiTable()
    {
        lstReminder = iReminder.getAll();
        TabelModelReminder tabelReminder = new TabelModelReminder(lstReminder);
        frmReminder.getTabelData().setModel(tabelReminder);
    }
            
    public void insert()
    {
        Reminder b = new Reminder();
        b.setId_Reminder(Integer.parseInt(frmReminder.gettxtId_Reminder().getText()));
        b.setId(Integer.parseInt(frmReminder.gettxtId().getText()));
        b.setTanggal(frmReminder.gettxtTanggal().getText());
        b.setDeskripsi(frmReminder.gettxtDeskripsi().getText());
        iReminder.insert(b);
        JOptionPane.showMessageDialog(null, "input berhasil");
        isiTable();
    }
    
    public void reset()
    {
        if (!frmReminder.gettxtId_Reminder().isEnabled())
            frmReminder.gettxtId_Reminder().setEnabled(true);
        frmReminder.gettxtId_Reminder().setText("");
        frmReminder.gettxtId().setText("");
        frmReminder.gettxtTanggal().setText("");
        frmReminder.gettxtDeskripsi().setText("");
    }
    
    public void isiField(int row)
    {
        frmReminder.gettxtId_Reminder().setEnabled(false);
        frmReminder.gettxtId_Reminder().setText(lstReminder.get(row).getId_Reminder().toString());
        frmReminder.gettxtId().setText(lstReminder.get(row).getId().toString());
        frmReminder.gettxtTanggal().setText(lstReminder.get(row).getTanggal());
        frmReminder.gettxtDeskripsi().setText(lstReminder.get(row).getDeskripsi());
    }
    
    public void update()
    {
        Reminder b = new Reminder();
        b.setId(Integer.parseInt(frmReminder.gettxtId().getText()));
        b.setTanggal(frmReminder.gettxtTanggal().getText());
        b.setDeskripsi(frmReminder.gettxtDeskripsi().getText());
        b.setId_Reminder(Integer.parseInt(frmReminder.gettxtId_Reminder().getText()));
        iReminder.update(b);
        JOptionPane.showMessageDialog(null, "Update berhasil");
        isiTable();
    }

    public void delete() 
    {
        Reminder b = new Reminder();
        iReminder.delete(Integer.parseInt(frmReminder.gettxtId_Reminder().getText()));
        JOptionPane.showMessageDialog(null, "delete berhasil");   
        isiTable();
    }
 }
