package TugasInheritance;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Constructor tanpa parameter ===");
        Buku b1 = new Buku();
        b1.idBuku = "B001";
        b1.judul = "Laskar Pelangi";
        b1.penulis = "Andrea Hirata";
        b1.penerbit = "Bentang Pustaka";
        b1.harga = 75000.0;
        
        b1.tampilData();
        System.out.println("\nJudul Buku : " + b1.judul + "\n");
        
        b1.create();
        System.out.println(b1.read());
        b1.update();
        System.out.println(b1.delete());
        System.out.println("--------------------------------------\n");

        System.out.println("=== 2. Constructor 2 Parameter ===");
        Buku b2 = new Buku("B002", "Filosofi Teras");
        System.out.println("ID Buku : " + b2.idBuku);
        System.out.println("Judul   : " + b2.judul);
        System.out.println("\n--------------------------------------\n");

        System.out.println("=== 3. Constructor 5 Parameter ===");
        Buku b3 = new Buku("B003", "Bumi Manusia", "Pramoedya Ananta Toer", "Hasta Mitra", 90000.0);
        b3.tampilData();
        System.out.println();
        
        b3.create();
        System.out.println(b3.read());
        b3.update();
        System.out.println(b3.delete());
        System.out.println("--------------------------------------\n");

        System.out.println("=== 4. Object Class Turunan (BukuFiksi) ===");
        BukuFiksi novel = new BukuFiksi("BF001", "Harry Potter", "J.K. Rowling", "Gramedia", 150000.0, "Fantasi", 4.8);
        
        novel.tampilData();
        System.out.println();
        novel.create();
        System.out.println(novel.read());
        novel.update();
        System.out.println(novel.delete());
        
        novel.infoGenre();
        System.out.println(novel.statusRating());
        System.out.println("--------------------------------------");
    }
}