public class Login {
    private String username = "admin";
    private String password = "password123";

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void register(String newUsername, String newPassword) {
        this.username = newUsername;
        this.password = newPassword;
        System.out.println("User registered successfully.");
    }

    public void forgotPassword() {
        System.out.println("Password recovery initiated.");
    }
}