/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.Scanner;

/**
 *
 * @author SWIFT X 14
 */
public class PerpustakaanXYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Admin admin = new Admin();
        //public AnggotaPerpustakaan(String idAnggota, String nama, String alamat)
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("Firman Bintang Partogi Situmorang","0001","Bandar Lampung");
        admin.tambahAnggota(anggota1);
        AnggotaPerpustakaan anggota2 = new AnggotaPerpustakaan("Ivan Aditya","0002","Bandar Lampung");
        admin.tambahAnggota(anggota2);
        AnggotaPerpustakaan anggota3 = new AnggotaPerpustakaan("Muhammad Aziz Almuhadi","0002","Bandar Lampung");
        admin.tambahAnggota(anggota3);
        //public Buku(String kodeISBN, String judul, String pengarang)
        Buku buku1 = new Buku("0001","Majalah Bobo", "Bobo");
        admin.tambahBuku(buku1);
        Buku buku2 = new Buku("0002","Norweigian Wood", "Haruki Murakami");
        admin.tambahBuku(buku2);
        Buku buku3 = new Buku("0003","Funiculi Funicula", "Toshikazu Kawaguchi");
        admin.tambahBuku(buku3);
                
        int pilihanMenu;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Selamat Datang Di Perpustakaan XYZ");
            System.out.println("1. Login Sebgagai Admin");
            System.out.println("2. Login Sebagai Anggota");
            System.out.println("0. Keluar");
            System.out.println("Pilihan: ");
            pilihanMenu = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihanMenu){
                case 1:
                    //Menu Admin
                    System.out.println("1. Tambah Anggota");
                    System.out.println("2. Hapus Anggota");
                    System.out.println("3. Tambah Buku");
                    System.out.println("4. Hapus Buku");
                    System.out.println("5. Laporan Aktivitas");
                    System.out.println("6. Lihat Daftar Anggota");
                    System.out.println("7. Lihat Daftar Buku");
                    System.out.println("8. Tambah notifikasi");
                    System.out.println("9. Kembali Ke Menu Utama");
                    int pilihanAdmin;
                    System.out.println("Pilihan: ");
                    pilihanAdmin = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch(pilihanAdmin){
                        case 1:
                            System.out.println("Masukan Nama: ");
                            String nama = scanner.nextLine();
                            System.out.println("Masukan id:");
                            String id = scanner.nextLine();
                            System.out.println("Masukan Alamat: ");
                            String alamat = scanner.nextLine();
                            AnggotaPerpustakaan anggota = new AnggotaPerpustakaan(nama,id,alamat);
                            admin.tambahAnggota(anggota);
                            System.out.println("Anggota Berhasi Ditambahkan!");
                            break;
                        case 2:
                            System.out.println("Masukan id dari anggota yang ingin dihapus: ");
                            String idHapus = scanner.nextLine();
                            admin.hapusAnggota(idHapus);
                            break;
                            
                        case 3:
                            System.out.println("Masukan ISBN: ");
                            String ISBN = scanner.nextLine();
                            System.out.println("Masukan Judul:");
                            String judul = scanner.nextLine();
                            System.out.println("Masukan Pengarang: ");
                            String pengarang = scanner.nextLine();
                            Buku buku = new Buku(ISBN,judul,pengarang);
                            admin.tambahBuku(buku);
                            System.out.println("Buku berhasil ditambahkan!");
                            break;
                            
                        case 4:
                            System.out.println("Masukan ISBN dari buku yang ingin dihapus: ");
                            String ISBNHapus = scanner.nextLine();
                            admin.hapusBuku(ISBNHapus);
                            break;
                        case 5:
                            admin.laporanAktivitas();
                            break;
                        case 6:
                            admin.lihatDaftarAnggota();
                            break;
                        case 7:
                            admin.koleksiBuku();
                            break;
                        case 8:
                            System.out.println("Masukan Judul Notifikasi: ");
                            String judulNotifikasi = scanner.nextLine();
                            System.out.println("Masukan Isi Notifikasi: ");
                            String isiNotifikasi = scanner.nextLine();

                            System.out.println("Notifikasi berhasil ditambahkan.");
                            System.out.println(judulNotifikasi);
                            System.out.println(isiNotifikasi);
                            break;
                        case 9:
                            break;
                        default:
                            System.out.println("Input tidak valid!");
                            break;
                    }
                    break;
                    
                    
                case 2:
                    //Menu Anggota
                    System.out.println("1. Koleksi Buku");
                    System.out.println("2. Pinjam Buku");
                    System.out.println("3. Kembalikan Buku");
                    System.out.println("4. Kembali Ke Menu Utama");
                    int pilihanAnggota;
                    System.out.println("Pilihan: ");
                    pilihanAnggota = scanner.nextInt();
                    scanner.nextLine();
                    switch(pilihanAnggota){
                        case 1:
                            admin.koleksiBuku();
                        
                        case 2:
                            System.out.println("Masukan ISBN: ");
                            String isbnPinjam = scanner.nextLine();
                            System.out.println("Masukan id Anggota");
                            String idPinjam = scanner.nextLine();
                            anggota1.pinjamBuku(isbnPinjam, idPinjam);
                        
                        case 3:
                            System.out.println("Masukan ISBN dari buku yang ingin dikembalikan: ");
                            String isbnKembali = scanner.nextLine();
                            anggota1.kembalikanBuku(isbnKembali, admin);
                            break;
                        
                        
                    }
            }
            
        } while(pilihanMenu != 0);
        
        
        
    }
    
}
