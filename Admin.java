/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SWIFT X 14
 */
public class Admin {
    
    private ArrayList<AnggotaPerpustakaan> daftarAnggota = new ArrayList<>();
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<TransaksiPeminjaman> daftarTransaksi = new ArrayList<>();
    public ArrayList<AnggotaPerpustakaan> getDaftarAnggota() {
        return daftarAnggota;
    }
    
    public Admin() {
    }
  
    
    public void tambahAnggota(AnggotaPerpustakaan anggota){
        daftarAnggota.add(anggota);
    }
//    public void hapusAnggota(AnggotaPerpustakaan anggota){
//        daftarAnggota.remove(anggota);
//    }
    public void hapusAnggota(String idAnggota) {
    // Menggunakan iterator dengan nama yang berbeda
    Iterator<AnggotaPerpustakaan> anggotaIterator = daftarAnggota.iterator();
    
    while (anggotaIterator.hasNext()) {
        AnggotaPerpustakaan anggota = anggotaIterator.next();
        if (anggota.getIdAnggota().equals(idAnggota)) {
            anggotaIterator.remove();
            System.out.println("Anggota dengan ID " + idAnggota + " telah dihapus.");
            return;
        }
    }
    
    System.out.println("Anggota dengan ID " + idAnggota + " tidak ditemukan.");
}

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    
    
    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
    }
//    public void hapusBuku(Buku buku){
//        daftarBuku.remove(buku);
//    }
    public void hapusBuku(String kodeISBN) {
    // Using iterator with a different name
    Iterator<Buku> bukuIterator = daftarBuku.iterator();

    while (bukuIterator.hasNext()) {
        Buku buku = bukuIterator.next();
        if (buku.getKodeISBN().equals(kodeISBN)) {
            bukuIterator.remove();
            System.out.println("Buku dengan ISBN " + kodeISBN + " telah dihapus.");
            return;
        }
    }

    System.out.println("Buku dengan ISBN " + kodeISBN + " tidak ditemukan.");
}

    
    public void laporanAktivitas(){
        for (AnggotaPerpustakaan anggota : daftarAnggota) {
        System.out.println("Aktivitas untuk Anggota: " + anggota.getNama());
        
        // Riwayat Peminjaman
        System.out.println("Riwayat Peminjaman:");
        for (TransaksiPeminjaman transaksi : anggota.getRiwayatPeminjaman()) {
            System.out.println("Tanggal Pinjam: " + transaksi.getTanggalPinjam());
            System.out.println("Waktu Pinjam: " + transaksi.getWaktuPinjam());
        }
        
        // Riwayat Pengembalian
        System.out.println("Riwayat Pengembalian:");
        for (TransaksiPengembalian transaksi : anggota.getRiwayatPengembalian()) {
            System.out.println("Tanggal Kembali: " + transaksi.getTanggalKembali());
            System.out.println("Waktu Kembali: " + transaksi.getWaktuKembali());
            System.out.println("Lama Peminjaman: " + transaksi.getLamaPinjam() + " hari");
        }
        
        System.out.println("------------------------------------------");
    }
    }
    
    public void koleksiBuku() {
        System.out.println("Buku Collection:");
        for (Buku buku : daftarBuku) {
            System.out.println("ISBN: " + buku.getKodeISBN());
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Pengarang: " + buku.getPengarang());
            System.out.print("Status Buku: ");
            if(buku.isStatusBuku()){
                System.out.print("Tersedia");
            }
            else{
                System.out.print("Sedang Dipinjam");
            }
            System.out.println("");
            System.out.println("------------------------------------------");
        }
    }
    
    public void lihatDaftarAnggota() {
        System.out.println("Daftar Anggota:");
        for (AnggotaPerpustakaan anggota : daftarAnggota) {
            System.out.println("ID Anggota: " + anggota.getIdAnggota());
            System.out.println("Nama: " + anggota.getNama());
            System.out.println("Alamat: " + anggota.getAlamat());
            System.out.println("------------------------------------------");
        }
    }
    
}
