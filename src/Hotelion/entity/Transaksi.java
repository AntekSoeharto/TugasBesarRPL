/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas Transaksi berfungsi untuk memodelkan Transaksi
 *
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.entity;

import Hotelion.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaksi {
    private String kode;
    private Date tanggalTransaksi;
    private Date tanggalCheckin;
    private Kamar kamarPesanan;
    private int durasi;
    private MetodePembayaran metodeBayar;
    private StatusTransaksi status;
    private List<Makanan> listMakanan = new ArrayList<Makanan>();
    private List<Pakaian> listPakaian = new ArrayList<Pakaian>();
    private List<Mainan> listMainan = new ArrayList<Mainan>();

    public Transaksi(){

    }

    public Transaksi(String kode, Date tanggalTransaksi, Date tanggalCheckin, Kamar kamarPesanan, int durasi, MetodePembayaran metodeBayar, StatusTransaksi status, List<Makanan> listMakanan, List<Pakaian> listPakaian, List<Mainan> listMainan) {
        this.kode = kode;
        this.tanggalTransaksi = tanggalTransaksi;
        this.tanggalCheckin = tanggalCheckin;
        this.kamarPesanan = kamarPesanan;
        this.durasi = durasi;
        this.metodeBayar = metodeBayar;
        this.status = status;
        this.listMakanan = listMakanan;
        this.listPakaian = listPakaian;
        this.listMainan = listMainan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public Date getTanggalCheckin() {
        return tanggalCheckin;
    }

    public void setTanggalCheckin(Date tanggalCheckin) {
        this.tanggalCheckin = tanggalCheckin;
    }

    public Kamar getKamarPesanan() {
        return kamarPesanan;
    }

    public void setKamarPesanan(Kamar kamarPesanan) {
        this.kamarPesanan = kamarPesanan;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public MetodePembayaran getMetodeBayar() {
        return metodeBayar;
    }

    public void setMetodeBayar(MetodePembayaran metodeBayar) {
        this.metodeBayar = metodeBayar;
    }

    public StatusTransaksi getStatus() {
        return status;
    }

    public void setStatus(StatusTransaksi status) {
        this.status = status;
    }

    public List<Makanan> getListMakanan() {
        return listMakanan;
    }

    public void setListMakanan(List<Makanan> listMakanan) {
        this.listMakanan = listMakanan;
    }

    public List<Pakaian> getListPakaian() {
        return listPakaian;
    }

    public void setListPakaian(List<Pakaian> listPakaian) {
        this.listPakaian = listPakaian;
    }

    public List<Mainan> getListMainan() {
        return listMainan;
    }

    public void setListMainan(List<Mainan> listMainan) {
        this.listMainan = listMainan;
    }
}
