/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class Menu {
    private String namaMenu;
    private double hargaDasar;
    
    public Menu(String namaMenu, double hargaDasar) {
        this.namaMenu = namaMenu;
        this.hargaDasar = hargaDasar;
    }
    
    public String getNamaMenu () {
        return this.namaMenu;
    }
    
    public double getHarga () {
        return this.hargaDasar;
    }
}
