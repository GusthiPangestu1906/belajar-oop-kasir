/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class Alamat {
    private String jalan;
    private String kecamatan;
    private String kota;
    private String kodePos;
    
    public Alamat(String jalan, String kecamatan, String kota, String kodePos) {
        this.jalan = jalan;
        this.kecamatan = kecamatan;
        this.kota = kota;
        this.kodePos = kodePos;
    }
    
    public String getAlamat() {
        return jalan + ", " + kecamatan + ", " + kota + " " + kodePos;
    }
}
