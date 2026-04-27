package Tugas02;

public class Buku {
    String judul;
    String penulis;
    int tahunTerbit;

    Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    Buku() {
    judul = "Tidak diketahui";
    penulis = "Anonim";
    tahunTerbit = 0;
    }
    
     public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun: " + tahunTerbit);
    }

    public String getInfo() {
        return judul + " oleh " + penulis;
    }
}