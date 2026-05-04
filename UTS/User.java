package UTS;

public class User {
    int id;
    String email;
    String password;

    void index() {
        System.out.println("SELECT * FROM user;");
    }

    void create() {
        System.out.println("INSERT INTO user (id, email, password) VALUES (NULL, 'email', 'password');");
    }

    void store() {
        System.out.println("INSERT INTO user (id, email, password) VALUES (" 
                + id + ", '" + email + "', '" + password + "');");
    }

    void edit() {
        System.out.println("Form edit user dengan id = " + id);
    }

    void update() {
        System.out.println("UPDATE user SET email='" + email + "', password='" 
                + password + "' WHERE id=" + id + ";");
    }

    void destroy() {
        System.out.println("DELETE FROM user WHERE id=" + id + ";");
    }
}