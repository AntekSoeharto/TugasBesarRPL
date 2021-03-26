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
