/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SWIFT X 14
 */
public class AnggotaPerpustakaan {
    private String idAnggota;
    private String nama;
    private String alamat;
    private ArrayList<TransaksiPeminjaman> riwayatPeminjaman;
    private ArrayList<TransaksiPengembalian> riwayatPengembalian;

    public AnggotaPerpustakaan(String idAnggota, String nama, String alamat){
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.riwayatPeminjaman = new ArrayList<>();
        this.riwayatPengembalian = new ArrayList<>();
    }
    

    public String getIdAnggota() {
        return idAnggota;
    }
    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<TransaksiPeminjaman> getRiwayatPeminjaman() {
        return riwayatPeminjaman;
    }
    public void setRiwayatPeminjaman(ArrayList<TransaksiPeminjaman> riwayatPeminjaman) {
        this.riwayatPeminjaman = riwayatPeminjaman;
    }  

    public ArrayList<TransaksiPengembalian> getRiwayatPengembalian() {
        return riwayatPengembalian;
    }
    public void setRiwayatPengembalian(ArrayList<TransaksiPengembalian> riwayatPengembalian) {
        this.riwayatPengembalian = riwayatPengembalian;
    }
    
    public void pinjamBuku(String isbn, String id) {
        Admin admin = new Admin();
        Buku buku = null;

        // Iterate through the book collection to find the book with the given ISBN
        for (Buku book : admin.getDaftarBuku() ) {
            if (book.getKodeISBN().equals(isbn)) {
                buku = book;
                break;
            }
        }

        if (buku != null && buku.isStatusBuku()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukan Tanggal Peminjaman: ");
            String tanggalPinjam = scanner.nextLine();
            System.out.println("Masukan Waktu/Pukul Peminjaman");
            String waktuPinjam = scanner.nextLine();

            // Assuming this is the current instance of AnggotaPerpustakaan
            String idAnggota = id;

            // Create TransaksiPeminjaman using the book's ISBN
            TransaksiPeminjaman transaksi = new TransaksiPeminjaman(tanggalPinjam, waktuPinjam, isbn, idAnggota);

            // Add the transaction to the member's history
            getRiwayatPeminjaman().add(transaksi);

            // Update the book status
            buku.setStatusBuku(false);
        } else {
            System.out.println("Buku tidak tersedia atau ISBN tidak valid.");
        }
    }

    
    public void kembalikanBuku(Buku buku){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan Tanggal Pengembalian: ");
        String tanggalKembali = scanner.nextLine();
        System.out.println("Masukan Waktu/Pukul Pengembalian: ");
        String waktuKembali = scanner.nextLine();
        System.out.println("Masukan Lama Peminjaman (hari): ");
        int lamaPinjam = scanner.nextInt();
        String kodeISBN = buku.getKodeISBN();
        AnggotaPerpustakaan idAnggota = this;    
        TransaksiPengembalian transaksi = new TransaksiPengembalian(tanggalKembali, waktuKembali, lamaPinjam, kodeISBN, idAnggota);
        getRiwayatPengembalian().add(transaksi);
        buku.setStatusBuku(true);
        
    }
    
}
