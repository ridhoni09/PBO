package UTS;

public class User {
    int id;
    String email;
    String password;

    public void index() {
        System.out.println("SELECT * FROM user;");
    }

    public void create() {
        System.out.println("INSERT INTO user VALUES (NULL, 'email', 'password');");
    }

    public void store() {
        System.out.println("INSERT INTO user (id, email, password) VALUES (" 
                + id + ", '" + email + "', '" + password + "');");
    }

    public void edit() {
        System.out.println("Form edit user dengan id = " + id);
    }

    public void update() {
        System.out.println("UPDATE user SET email='" + email + "', password='" 
                + password + "' WHERE id=" + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM user WHERE id=" + id + ";");
    }
}