/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas Kamar berfungsi untuk memodelkan Kamar
 *
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.entity;

public class Kamar {
    private int nomor;
    private String tipe;
    private double harga;
    private boolean isPakai;

    public Kamar(){

    }

    public Kamar(int nomor, String tipe, double harga, boolean isPakai) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.harga = harga;
        this.isPakai = isPakai;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public boolean isPakai() {
        return isPakai;
    }

    public void setPakai(boolean pakai) {
        isPakai = pakai;
    }
}
