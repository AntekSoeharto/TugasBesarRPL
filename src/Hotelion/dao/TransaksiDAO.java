/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas TransaksiDAO berfungsi untuk menyediakan akses ke tabel Transaksi di
 * database.
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.dao;
import Hotelion.entity.*;

import java.util.ArrayList;

public class TransaksiDAO {

    public TransaksiDAO(){

    }

    //Untuk mengecek kode transaksi
    public boolean cekKodeTransaksi(String kode){

        return true;
    }

    //Untuk mengambil semua transaksi
    public ArrayList<Transaksi> ambilSemuaTransaksi(){


        return null;
    }

    //untuk mengambil satu transaksi
    public Transaksi ambilSatuTransaksi(String kode){


        return null;
    }

    //Untuk menambah Transaksi ke database
    public boolean tambahTransaksi(Transaksi transaksi){

        return true;
    }

    //Untuk Ubah Transaksi
    public boolean ubahTransaksi(Transaksi transaksi){

        return true;
    }

    //Untuk memperbarui transaksi khususnya di makanan
    public boolean perbaruiMakanan(Transaksi transaksi){

        return true;
    }

    //Untuk memperbarui transaksi khususnya di mainan
    public boolean perbaruiMainan(Transaksi transaksi){

        return true;
    }

    //Untuk memperbarui transaksi khususnya di makanan
    public boolean perbaruiPakaian(Transaksi transaksi){

        return true;
    }







}
