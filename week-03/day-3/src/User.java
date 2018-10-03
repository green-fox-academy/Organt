import java.lang.reflect.Array;

public class User {
    String username;
    String email;
    String password;
    int age;

    public User() {
        System.out.println("A user is created");
    }

    public User(String username, String email, String password, int age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public void yearPast() {
        yearPast(1);
    }

    public void yearPast(int years) {
        age += years;
    }
}
