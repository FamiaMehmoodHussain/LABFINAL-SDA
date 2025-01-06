public class HomeAutomationSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Home Automation System!");

        // Login functionality
        Login login = new Login();
        if (login.login("admin", "password123")) {
            System.out.println("Login Successful!");

            // Device examples
            Light light = new Light("Living Room Light", false);
            light.turnOn();
            light.setBrightness(75);
            System.out.println(light.getStatus());

            // Live Surveillance example
            LiveSurveillance surveillance = new LiveSurveillance();
            surveillance.selectCamera(1);
            surveillance.alert();

        } else {
            System.out.println("Login Failed!");
        }
    }
}