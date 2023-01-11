public class Enclosure {
    private double roomSize = 354.50;
    public boolean isClean = false;
    public float temperature = 27.5f;

    public double getSize() {
        return this.roomSize;
    }
    public boolean getStatus() {
        return this.isClean;

    }
    public float getTemperature() {
        return this.temperature;
    }

    public void closeDoor() {
        System.out.println("The door is closed");
    }
    public void openDoor() {
        System.out.println("The door is opened");
    }
    public void cleanEnclosure() {
        System.out.println("The enclosure has been cleaned");
    }

}

