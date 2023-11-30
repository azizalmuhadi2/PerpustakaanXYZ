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
public class Notifikasi {
    private String judul;
    private String isi;

    public Notifikasi(String judul, String isi) {
        this.judul = judul;
        this.isi = isi;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }
    public void setIsi(String isi) {
        this.isi = isi;
    }
    
    public void kirimNotifikasi(){
        System.out.println(judul);
        System.out.println(isi);
    }
}
