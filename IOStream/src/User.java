import java.io.Serializable;

public class User implements Serializable {
    int no;
    String name;

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String   toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
