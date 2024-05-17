
package uts_widhya;

/**
 *
 * @author LENOVO
 */
public class Baju {
    private String nama;
    private String ukuran;

    public Baju(String nama, String ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Ukuran: " + ukuran;
    }
}

