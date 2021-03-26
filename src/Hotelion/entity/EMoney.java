/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas EMoney berfungsi untuk memodelkan EMoney dengan extends MetodePembayaran
 *
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.entity;

import java.util.Date;

public class EMoney extends MetodePembayaran {
    private String noHp;

    public EMoney(){

    }

    public EMoney(String noHp) {
        this.noHp = noHp;
    }

    public EMoney(Date tanggalPembayaran, String noHp) {
        super(tanggalPembayaran);
        this.noHp = noHp;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}
