package Tugas02;

public class Main {
    public static void main(String[] args) {
        Buku b1 = new Buku();
        
        Buku b2 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);

        System.out.println("=== Buku 1 (Constructor Kosong) ===");
        b1.tampilkanInfo();

        System.out.println("\n=== Buku 2 (Constructor Isi) ===");
        b2.tampilkanInfo();
    }
}