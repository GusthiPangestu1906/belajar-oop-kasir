/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public abstract class PembayaranNonTunai implements IPembayaran {
    private final String idReferensi;
    
    public PembayaranNonTunai(String idReferensi) {
        this.idReferensi = idReferensi;
    }
    
    public String getIdReferensi() {
        return idReferensi;
    }
}
