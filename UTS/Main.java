package UTS;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.id = 1;
        user.email = "ridhoni@gmail.com";
        user.password = "12345";

        Penerbit penerbit = new Penerbit();
        penerbit.id = 1;
        penerbit.namaPenerbit = "Gramedia";
        penerbit.alamatPenerbit = "Jakarta";

        // BUKU
        Buku buku = new Buku();
        buku.id = 1;
        buku.judul = "Belajar Java";
        buku.penulis = "Ridhoni";
        buku.tahun = 2025;
        buku.penerbit = penerbit;
        
        System.out.println("=== USER ===");
        user.index();
        user.create();
        user.store();
        user.edit();
        user.update();
        user.destroy();
        
        System.out.println("\n=== PENERBIT ===");
        penerbit.index();
        penerbit.create();
        penerbit.store();
        penerbit.edit();
        penerbit.update();
        penerbit.destroy();

        System.out.println("\n=== BUKU ===");
        buku.index();
        buku.create();
        buku.store();
        buku.edit();
        buku.update();
        buku.destroy();
    }
}