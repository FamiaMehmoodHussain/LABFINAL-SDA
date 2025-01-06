public class SecurityCamera extends Device {
    public SecurityCamera(String deviceName, boolean status) {
        super("CAM001", deviceName, status);
    }

    public void record() {
        System.out.println(deviceName + " is recording.");
    }
}