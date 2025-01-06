public class Light extends Device {
    private int brightness;

    public Light(String deviceName, boolean status) {
        super("LIGHT001", deviceName, status);
        this.brightness = 100; // Default brightness
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println(deviceName + " brightness set to " + brightness + "%.");
    }
}