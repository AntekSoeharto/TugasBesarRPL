/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas MetodePembayaran digunakan untuk abstract model.
 *
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.entity;

import java.util.Date;

public abstract class MetodePembayaran {
    private Date tanggalPembayaran;

    public MetodePembayaran(){

    }

    public MetodePembayaran(Date tanggalPembayaran){
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public Date getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(Date tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }
}
