/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class MenuSpesial extends Menu {
    private String namaTambahan;
    private double biayaTambahan;
    
    public MenuSpesial (String namaMenu, double hargaDasar, String namaTambahan, double biayaTambahan) {
        super (namaMenu, hargaDasar);
        this.namaTambahan = namaTambahan;
        this.biayaTambahan = biayaTambahan;
    }
    
    public String getNamaTambahan () {
        return this.namaTambahan;
    }
    
    @Override
    public double getHarga () {
        return super.getHarga() + this.biayaTambahan;
    }
    
    @Override
    public String getNamaMenu () {
        return super.getNamaMenu() + " (" +this.namaTambahan + ")";
    }
}
