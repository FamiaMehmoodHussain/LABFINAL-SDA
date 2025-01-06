public abstract class Device {
    protected String deviceId;
    protected String deviceName;
    protected boolean status;

    public Device(String deviceId, String deviceName, boolean status) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = status;
    }

    public void turnOn() {
        status = true;
        System.out.println(deviceName + " is now ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(deviceName + " is now OFF.");
    }

    public String getStatus() {
        return deviceName + " is " + (status ? "ON" : "OFF");
    }
}