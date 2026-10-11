/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class BelajarOOP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu mieAyam = new MenuReguler("Mie Ayam", 12000);
        Menu esTeh = new MenuReguler("Es Teh Manis", 4000);
        Menu mieAyamPentol = new MenuSpesial("Mie Ayam", 12000, "Pentol Halus", 5000);
        Menu baksoTetelan = new MenuSpesial("Bakso", 15000, "Tetelan Gurih", 7000);

        // 2. Buat transaksi kasir
        Transaksi transaksi = new Transaksi("11/10/2026 19:30", 70000);

        // 3. Tambahkan pesanan pelanggan
        transaksi.tambahPesanan(mieAyamPentol, 2); // 2 porsi Mie Ayam + Pentol Halus
        transaksi.tambahPesanan(baksoTetelan, 1);    // 1 porsi Bakso + Tetelan Gurih
        transaksi.tambahPesanan(esTeh, 3);           // 3 gelas Es Teh Manis

        // 4. Cetak nota pembayaran
        transaksi.cetakNota();
    }
    
}
