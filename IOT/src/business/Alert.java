public class Alert {
    private String message;

    public Alert(String message) {
        this.message = message;
    }

    public void sendAlert() {
        System.out.println("ALERT: " + message);
    }
}