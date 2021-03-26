/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas Makanan berfungsi untuk memodelkan Makanan
 *
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.entity;

public class Makanan {
    private String id;
    private String nama;
    private double harga;
    private int jumalah;

    public Makanan(){

    }

    public Makanan(String id, String nama, double harga, int jumalah) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jumalah = jumalah;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumalah() {
        return jumalah;
    }

    public void setJumalah(int jumalah) {
        this.jumalah = jumalah;
    }
}
