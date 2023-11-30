/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.Date;

/**
 *
 * @author SWIFT X 14
 */
public class TransaksiPeminjaman {
    private String tanggalPinjam;
    private String waktuPinjam;
    private String tempoPinjam = "14 Hari";
    private String kodeISBN;
    private String idAnggota;

    public TransaksiPeminjaman(String tanggalPinjam, String waktuPinjam, String kodeISBN, String idAnggota) {
        this.tanggalPinjam = tanggalPinjam;
        this.waktuPinjam = waktuPinjam;
        this.kodeISBN = kodeISBN;
        this.idAnggota = idAnggota;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }
    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getWaktuPinjam() {
        return waktuPinjam;
    }
    public void setWaktuPinjam(String waktuPinjam) {
        this.waktuPinjam = waktuPinjam;
    }

    public String getTempoPinjam() {
        return tempoPinjam;
    }
    public void setTempoPinjam(String tempoPinjam) {
        this.tempoPinjam = tempoPinjam;
    }
    
    private boolean statusPinjam = false; // Menandakan apakah buku sudah dipinjam atau belum

    // Metode untuk melakukan pinjaman buku
    public void pinjamBuku(String tanggalPinjam, String waktuPinjam) {
        if (!statusPinjam) { // Cek apakah buku sudah dipinjam atau belum
            this.tanggalPinjam = tanggalPinjam; // Mengatur tanggal pinjam
            this.waktuPinjam = waktuPinjam; // Mengatur waktu pinjam
            statusPinjam = true; // Mengubah status buku menjadi sudah dipinjam
            System.out.println("Buku berhasil dipinjam pada tanggal " + tanggalPinjam + " pukul " + waktuPinjam);
        } else {
            System.out.println("Maaf, buku sudah dipinjam sebelumnya");
        }
    }
    
    // Metode untuk mengecek status peminjaman buku
    public boolean cekStatusPinjam() {
        return statusPinjam;
    }
    
}
