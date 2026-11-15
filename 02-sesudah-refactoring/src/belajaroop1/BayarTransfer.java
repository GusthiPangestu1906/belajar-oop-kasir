/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class BayarTransfer extends PembayaranNonTunai {
    private final String namaBank;
    
    public BayarTransfer(String namaBank, String idReferensi) {
        super(idReferensi);
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesBayar(double totalTagihan) {
        System.out.printf("Metode: TF %-3s | Ref: %-12s | LUNAS Rp%8.0f\n", namaBank, getIdReferensi(), totalTagihan);
    }
}
