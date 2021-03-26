/**
 * PersonDAO.java
 *
 * Created on June 14, 2019, 10:15 AM
 */

/**
 * Kelas Admin berfungsi untuk memodelkan Admin yang menjadi pengurus
 *
 * @author Kelompok reservasi unique hotel
 */
package Hotelion.entity;

public class Admin {
    private String namaPengguna;
    private String kataSandi;

    public Admin(){

    }

    public Admin(String namaPengguna, String kataSandi) {
        this.namaPengguna = namaPengguna;
        this.kataSandi = kataSandi;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }
}
