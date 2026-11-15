/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class ItemPesanan {
    private Menu menu;
    private int jumlah;
    
    public ItemPesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }
    
    public Menu getMenu() {
        return menu;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public double hitungSubtotal(){
        return menu.getHarga() * jumlah;
    }
}
