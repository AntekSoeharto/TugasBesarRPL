package Hotelion.entity;

public class Mainan {
    private String id;
    private String nama;
    private double harga;
    private int jumalah;

    public Mainan(){

    }

    public Mainan(String id, String nama, double harga, int jumalah) {
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
