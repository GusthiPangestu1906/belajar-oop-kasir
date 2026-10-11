/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;
import java.util.ArrayList;

/**
 *
 * @author Gusthi Pangestu
 */
public class Transaksi {
    private String waktuPembayaran;
    private double uangBayar;
    private ArrayList<Menu> daftarMenu;
    private ArrayList<Integer> daftarJumlah;
    
    public Transaksi (String waktuPembayaran, double uangBayar) {
        this.waktuPembayaran = waktuPembayaran;
        this.uangBayar = uangBayar;
        this.daftarMenu = new ArrayList<>();
        this.daftarJumlah = new ArrayList<>();
    }
    
    public void tambahPesanan (Menu menu, int jumlah) {
        if (jumlah > 0) {
            daftarMenu.add(menu);
            daftarJumlah.add(jumlah);
        }
        else {
            System.out.println("Jumlah Pesanan Harus Lebih Dari 0!");
        }
    }
    
    public double hitungTotal () {
        double total = 0;
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu menu = daftarMenu.get(i);
            int jumlah = daftarJumlah.get(i);
            total += menu.getHarga() * jumlah;
        }
        return total;
    }
    
    public double hitungKembalian () {
        return this.uangBayar = uangBayar - hitungTotal();
    }
    
    public void cetakNota() {
        System.out.println("=========================================");
        System.out.println("Bakso & Mie Ayam Cak Gus");
        System.out.println("Waktu: " + this.waktuPembayaran       );
        System.out.println("=========================================");

        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu menu = daftarMenu.get(i);
            int jumlah = daftarJumlah.get(i);
            double subtotal = menu.getHarga() * jumlah;

            System.out.printf("%-24s x%d  Rp%8.0f\n", menu.getNamaMenu(), jumlah, subtotal);
        }

        System.out.println("-----------------------------------------");
        System.out.printf("Total Tagihan           : Rp%8.0f\n", hitungTotal());
        System.out.printf("Uang Diterima           : Rp%8.0f\n", this.uangBayar);
        System.out.printf("Kembalian               : Rp%8.0f\n", hitungKembalian());
        System.out.println("=========================================");
        System.out.println("        Terima Kasih Atas Kunjungan Anda! ");
        System.out.println("=========================================");
    }
}
