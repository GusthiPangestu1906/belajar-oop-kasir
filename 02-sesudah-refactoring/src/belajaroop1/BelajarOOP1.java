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
        Menu mieAyamSpesial = new MenuSpesial("Mie Ayam", 12000, "Pentol & Tetelan", 6000);
        Menu baksoReguler = new MenuReguler("Bakso Halus", 13000);
        Menu esTeh = new MenuReguler("Es Teh Manis", 4000);

        // 1. Transaksi Dine-In + Tunai + Promo 10%
        Transaksi trx1 = new Transaksi("15/11/2026 20:10", new BayarTunai(60000));
        trx1.tambahPesanan(mieAyamSpesial, 2);
        trx1.tambahPesanan(esTeh, 2);
        trx1.prosesDanCetakNota(false, 0.10);

        System.out.println();

        // 2. Transaksi Take-Away + Delivery + QRIS
        Alamat alamat1 = new Alamat("Jl. Keputih Tegal No. 5", "Sukolilo", "Surabaya", "60111");
        InfoDelivery delivery1 = new InfoDelivery("Gusthi", "08123456789", alamat1, "VIP-2026");

        Transaksi trx2 = new Transaksi("15/11/2026 20:25", new BayarQRIS("QR-20261115-01"));
        trx2.setInfoDelivery(delivery1);
        trx2.tambahPesanan(baksoReguler, 3);
        trx2.prosesDanCetakNota(true, 0);

        System.out.println();

        // 3. Transaksi Take-Away + Transfer Bank
        Transaksi trx3 = new Transaksi("15/11/2026 20:40", new BayarTransfer("BCA", "TF-99887766"));
        trx3.tambahPesanan(mieAyamSpesial, 1);
        trx3.tambahPesanan(baksoReguler, 1);
        trx3.prosesDanCetakNota(true, 0.05);
    }
}
