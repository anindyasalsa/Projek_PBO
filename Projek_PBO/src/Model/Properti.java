/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Properti {
    private Integer Id;
    private String Nama;
    private String Jenis;
    private String Alamat;
    private String Kota;
    
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
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Jenis
     */
    public String getJenis() {
        return Jenis;
    }

    /**
     * @param Jenis the Jenis to set
     */
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the alamat to set
     */ 
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    /**
     * @return the kota
     */
    public String getKota() {
        return Kota;
    }

    /**
     * @param Kota
     */ 
    public void setKota(String Kota) {
        this.Kota = Kota;
    }
    
}
