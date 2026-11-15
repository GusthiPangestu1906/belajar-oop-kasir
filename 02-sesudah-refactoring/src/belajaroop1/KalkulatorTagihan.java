/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */

import java.util.ArrayList;
import java.util.List;

public class KalkulatorTagihan {
    private static final double BIAYA_BUNGKUS_PER_ITEM = 2000;
    
    private final List<ItemPesanan> daftarItem;
    private final boolean isTakeAway;
    private final double persenPromo;
    
    private Double cachedSubtotal = null;
    
    public KalkulatorTagihan(List<ItemPesanan> daftarItem, boolean isTakeAway, double persenPromo) {
        this.daftarItem = new ArrayList<>(daftarItem);
        this.isTakeAway = isTakeAway;
        this.persenPromo = persenPromo;
    }
    
    public double getSubtotal() {
        if (cachedSubtotal == null) {
            double total = 0;
            for (ItemPesanan item : daftarItem) {
                total += item.hitungSubtotal();
            } 
            cachedSubtotal = total;
        }
        return cachedSubtotal;
    }
    
    public double getDiskonPromo() {
        return (persenPromo > 0) ? (getSubtotal() * persenPromo) : 0;
    }
    
    public double getBiayaBungkus() {
        return isTakeAway ? (BIAYA_BUNGKUS_PER_ITEM * daftarItem.size()) : 0;
    }
    
    public double getTotalAkhir() {
        return getSubtotal() - getDiskonPromo() + getBiayaBungkus();
    }
}
