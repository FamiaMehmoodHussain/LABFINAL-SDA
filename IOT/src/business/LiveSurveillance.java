import java.util.ArrayList;

public class LiveSurveillance {
    private ArrayList<SecurityCamera> cameras;

    public LiveSurveillance() {
        cameras = new ArrayList<>();
        cameras.add(new SecurityCamera("Front Door Camera", true));
        cameras.add(new SecurityCamera("Backyard Camera", false));
    }

    public void selectCamera(int index) {
        if (index >= 0 && index < cameras.size()) {
            SecurityCamera camera = cameras.get(index);
            System.out.println("Selected: " + camera.deviceName);
            camera.record();
        } else {
            System.out.println("Invalid camera selection.");
        }
    }

    public void alert() {
        Alert alert = new Alert("Motion detected in the backyard!");
        alert.sendAlert();
    }
}
