package ra.btvd;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 2163561253L;
    private int id;
    private String userName;
    private String password;
    private boolean status;

    public User() {
    }

    public User(int id, String userName, String password, boolean status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
    public void  display(){
        System.out.println(toString());
    }
}
