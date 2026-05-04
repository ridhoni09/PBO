package UTS;

public class Penerbit {
    int id;
    String namaPenerbit;
    String alamatPenerbit;

    public void index() {
        System.out.println("SELECT * FROM penerbit;");
    }

    void create() {
        System.out.println("INSERT INTO penerbit (id, namaPenerbit, alamatPenerbit) VALUES (NULL, 'Nama Penerbit', 'Alamat');");
    }

    void store() {
        System.out.println("INSERT INTO penerbit (id, namaPenerbit, alamatPenerbit) VALUES (" 
                + id + ", '" + namaPenerbit + "', '" + alamatPenerbit + "');");
    }

    void edit() {
        System.out.println("Form edit penerbit dengan id = " + id);
    }

    void update() {
        System.out.println("UPDATE penerbit SET namaPenerbit='" + namaPenerbit 
                + "', alamatPenerbit='" + alamatPenerbit + "' WHERE id=" + id + ";");
    }

    void destroy() {
        System.out.println("DELETE FROM penerbit WHERE id=" + id + ";");
    }
}