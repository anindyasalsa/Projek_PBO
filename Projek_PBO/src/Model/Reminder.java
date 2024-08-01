/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Reminder {
    private Integer Id_Reminder;   
    private Integer Id;
    private String Tanggal;
    private String Deskripsi;
    
    /**
     * @return the nim
     */
    public Integer getId_Reminder() {
        return Id_Reminder;
    }

    /**
     * @param Id_Reminder
     */
    public void setId_Reminder(Integer Id_Reminder) {
        this.Id_Reminder = Id_Reminder;
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return the Tanggal
     */
    public String getTanggal() {
        return Tanggal;
    }

    /**
     * @param Tanggal
     */
    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    
    /**
     * @return the Tanggal
     */
    public String getDeskripsi() {
        return Deskripsi;
    }

    /**
     * @param Deskripsi
     */
    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }
}

