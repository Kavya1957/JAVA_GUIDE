public class login {
    public void login(String username) {
        System.out.println("Login with username: " + username);
    }

    public void login(String username, String password) {
        System.out.println("Login with username: " + username + " and password: " + password);
    }

    public void login(String username, String password, String otp) {
        System.out.println("Login with username: " + username + ", password: " + password + ", and OTP: " + otp);
    }
public static void main(String[] args) {
        login l = new login();
        l.login("user123");
        l.login("user123", "pass123");
        l.login("user123", "pass123", "otp456");
    }
}
