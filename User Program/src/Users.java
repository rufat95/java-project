import java.util.Objects;

public class Users {
    private String userName;
    private String userPassword;

    public Users() {}

    public Users(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(getUserName(), users.getUserName())
                && Objects.equals(getUserPassword(), users.getUserPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getUserPassword());
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
