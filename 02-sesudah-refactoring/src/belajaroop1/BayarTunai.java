/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class BayarTunai implements IPembayaran {
    private final double uangDiterima;
    
    public BayarTunai(double uangDiterima) {
        this.uangDiterima = uangDiterima;
    }
    
    @Override
    public void prosesBayar(double totalTagihan) {
        double kembalian = uangDiterima - totalTagihan;
        System.out.printf("Metode: TUNAI | Kembali: Rp%8.0f\n", kembalian);
    }
}
