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
public class TransaksiPengembalian {
    private String tanggalKembali;
    private String waktuKembali;
    private int lamaPinjam;
    private String kodeISBN;
    private AnggotaPerpustakaan idAnggota;

    public TransaksiPengembalian(String tanggalKembali, String waktuKembali, int lamaPinjam, String kodeISBN, AnggotaPerpustakaan idAnggota) {
        this.tanggalKembali = tanggalKembali;
        this.waktuKembali = waktuKembali;
        this.lamaPinjam = lamaPinjam;
        this.kodeISBN = kodeISBN;
        this.idAnggota = idAnggota;
    }   

    public String getTanggalKembali() {
        return tanggalKembali;
    }
    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getWaktuKembali() {
        return waktuKembali;
    }
    public void setWaktuKembali(String waktuKembali) {
        this.waktuKembali = waktuKembali;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }
    public void setLamaPinjam(int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }
     
}
