package TugasInheritance;
public class BukuFiksi extends Buku {
    public String genre;
    public double rating;

    public BukuFiksi(String idBuku, String judul, String penulis, String penerbit, double harga, String genre, double rating) {
        super(idBuku, judul, penulis, penerbit, harga); // Memanggil constructor induk
        this.genre = genre;
        this.rating = rating;
    }

    public void infoGenre() {
        System.out.println("Genre    : " + genre);
    }

    public String statusRating() {
        return "Rating   : " + rating + " / 5.0";
    }
}
