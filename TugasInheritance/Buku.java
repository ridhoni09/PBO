package TugasInheritance;
public class Buku {
    public String idBuku;
    public String judul;
    public String penulis;
    public String penerbit;
    public double harga;

    public Buku() {
    }

    public Buku(String idBuku, String judul) {
        this.idBuku = idBuku;
        this.judul = judul;
    }

    public Buku(String idBuku, String judul, String penulis, String penerbit, double harga) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.harga = harga;
    }

    public void tampilData() {
        System.out.println("ID Buku  : " + idBuku);
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Harga    : " + harga);
    }

    public void create() {
        System.out.println("SQL CREATE:");
        System.out.println("INSERT INTO buku VALUES ('" + idBuku + "','" + judul + "','" + penulis + "','" + penerbit + "'," + harga + ")\n");
    }

    public String read() {
        return "SQL READ:\nSELECT * FROM buku WHERE id_buku='" + idBuku + "'\n";
    }

    public void update() {
        System.out.println("SQL UPDATE:");
        System.out.println("UPDATE buku SET judul='" + judul + "' WHERE id_buku='" + idBuku + "'\n");
    }

    public String delete() {
        return "SQL DELETE:\nDELETE FROM buku WHERE id_buku='" + idBuku + "'\n";
    }
}    

