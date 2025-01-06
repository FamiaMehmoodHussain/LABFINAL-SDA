public class Thermostat extends Device {
    private float temperature;

    public Thermostat(String deviceName, boolean status) {
        super("THERMO001", deviceName, status);
        this.temperature = 22.0f; // Default temperature
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println(deviceName + " temperature set to " + temperature + "°C.");
    }
}