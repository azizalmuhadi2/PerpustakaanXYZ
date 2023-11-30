/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

/**
 *
 * @author SWIFT X 14
 */
public class Buku {
    private String kodeISBN;
    private String judul;
    private String pengarang;
    private boolean statusBuku;

    public Buku(String kodeISBN, String judul, String pengarang) {
        this.kodeISBN = kodeISBN;
        this.judul = judul;
        this.pengarang = pengarang;
        this.statusBuku = true;
    }

    public String getKodeISBN() {
        return kodeISBN;
    }
    public void setKodeISBN(String kodeISBN) {
        this.kodeISBN = kodeISBN;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public boolean isStatusBuku() {
        return statusBuku;
    }
    public void setStatusBuku(boolean statusBuku) {
        this.statusBuku = statusBuku;
    }    
    
}
