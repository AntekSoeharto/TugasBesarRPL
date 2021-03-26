package Hotelion.entity;

import java.util.Date;

public class Transfer  extends MetodePembayaran{
    public String noRekening;
    public String kodeTransfer;

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
