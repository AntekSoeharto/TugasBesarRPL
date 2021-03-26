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
