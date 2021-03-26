/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas Debit berfungsi untuk memodelkan Debit dengan extends MetodePembayaran
 *
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.entity;

import java.util.Date;

public class Debit extends MetodePembayaran{
    private String noRek;

    public Debit(){

    }

    public Debit(String noRek) {
        this.noRek = noRek;
    }

    public Debit(Date tanggalPembayaran, String noRek) {
        super(tanggalPembayaran);
        this.noRek = noRek;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }
}
