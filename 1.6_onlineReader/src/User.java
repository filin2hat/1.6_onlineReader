public class User {
    public String userName;
    public String userSurname;
    public String userEmail;

    public static int totalOnline = 0;

    public User(String userName, String userSurname, String userEmail) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        totalOnline++;
    }
}
