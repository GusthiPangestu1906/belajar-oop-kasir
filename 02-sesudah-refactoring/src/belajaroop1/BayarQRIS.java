/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class BayarQRIS extends PembayaranNonTunai {
    public BayarQRIS(String idReferensi) {
        super(idReferensi);
    }
    
    @Override
    public void prosesBayar(double totalTagihan) {
        System.out.printf("Metode: QRIS   | Ref: %-12s | LUNAS Rp%8.0f\n", getIdReferensi(), totalTagihan);
    }
}
