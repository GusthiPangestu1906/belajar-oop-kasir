/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop1;

/**
 *
 * @author Gusthi Pangestu
 */
public class InfoDelivery {
    private String namaPelanggan;
    private String noHp;
    private Alamat alamat;
    private String kodeMember;
    
    public InfoDelivery(String namaPelanggan, String noHp, Alamat alamat, String kodeMember) {
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHp;
        this.alamat = alamat;
        this.kodeMember = kodeMember;
    }
    
    public void cetakInfoDelivery() {
        System.out.println("Pemesan: " + namaPelanggan + " (" + noHp + ")");
        System.out.println("Alamat: " + alamat);
        System.out.println("Member: " + kodeMember);
    }
}
