/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas Transfer berfungsi untuk memodelkan Transfer
 *
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.entity;

import java.util.Date;

public class Transfer  extends MetodePembayaran{
    private String noRekening;
    private String kodeTransfer;

    public Transfer(){

    }

    public Transfer(String noRekening, String kodeTransfer, Date tanggalPembayaran){
        super(tanggalPembayaran);
        this.noRekening = noRekening;
        this.kodeTransfer = kodeTransfer;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getKodeTransfer() {
        return kodeTransfer;
    }

    public void setKodeTransfer(String kodeTransfer) {
        this.kodeTransfer = kodeTransfer;
    }
}
