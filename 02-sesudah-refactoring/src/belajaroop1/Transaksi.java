/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gusthi Pangestu
 */
public class Transaksi {
    private final String waktuPembayaran;
    private final List<ItemPesanan> daftarItem;
    private InfoDelivery infoDelivery;
    private IPembayaran metodePembayaran;

    public Transaksi(String waktuPembayaran, IPembayaran metodePembayaran) {
        this.waktuPembayaran = waktuPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.daftarItem = new ArrayList<>();
    }

    public void setInfoDelivery(InfoDelivery infoDelivery) {
        this.infoDelivery = infoDelivery;
    }

    public void setMetodePembayaran(IPembayaran metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public void tambahPesanan(Menu menu, int jumlah) {
        if (jumlah > 0) {
            daftarItem.add(new ItemPesanan(menu, jumlah));
        }
    }

    public void prosesDanCetakNota(boolean isTakeAway, double persenPromo) {
        KalkulatorTagihan tagihan = new KalkulatorTagihan(daftarItem, isTakeAway, persenPromo);

        cetakHeader();
        cetakDaftarItem();
        cetakRingkasanTagihan(tagihan);
        metodePembayaran.prosesBayar(tagihan.getTotalAkhir());
        System.out.println("====================================================");
    }

    private void cetakHeader() {
        System.out.println("====================================================");
        System.out.println("             Bakso & Mie Ayam Cak Gus               ");
        System.out.println("Waktu  : " + waktuPembayaran);
        if (infoDelivery != null) {
            infoDelivery.cetakInfoDelivery();
        }
        System.out.println("====================================================");
    }

    private void cetakDaftarItem() {
        for (ItemPesanan item : daftarItem) {
            System.out.printf("%-28s x%-3d Rp%10.0f\n",
                    item.getMenu().getNamaMenu(),
                    item.getJumlah(),
                    item.hitungSubtotal());
        }
    }

    private void cetakRingkasanTagihan(KalkulatorTagihan tagihan) {
        System.out.println("----------------------------------------------------");
        System.out.printf("Subtotal                        : Rp%10.0f\n", tagihan.getSubtotal());
        System.out.printf("Diskon Promo                    : Rp%10.0f\n", tagihan.getDiskonPromo());
        System.out.printf("Biaya Bungkus                   : Rp%10.0f\n", tagihan.getBiayaBungkus());
        System.out.printf("Total Tagihan                   : Rp%10.0f\n", tagihan.getTotalAkhir());
    }
}