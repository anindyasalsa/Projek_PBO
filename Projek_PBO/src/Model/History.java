/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class History {
    private Integer Id_Transaksi;
    private Integer Id;
    private String Tanggal;
    private String Kategori;
    private String Jumlah;
    private String Deskripsi;
    /**
     * @return the id
     */
    public Integer getId_Transaksi() {
        return Id_Transaksi;
    }
    
    /**
     * @param Id_Transaksi
     */
    public void setId_Transaksi(Integer Id_Transaksi) {
        this.Id_Transaksi = Id_Transaksi;
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
     * @return the nim
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
     * @return the Jenis
     */
    public String getKategori() {
        return Kategori;
    }

    /**
     * @param Kategori
     */
    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }
    
     /**
     * @return the Jumlah
     */
    public String getJumlah() {
        return Jumlah;
    }

    /**
     * @param Jumlah
     */
    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }

    /**
     * @return the Deskripsi
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
