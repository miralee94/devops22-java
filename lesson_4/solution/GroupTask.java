package lesson_4.solution;

public class GroupTask {
    private String brand, model, registrationNumber, color;
    private double maxSpeed, currentSpeed;
    public static String vehicleClass = "Personbil Klass 1";
    public final static double MPH_TO_KPH_CONSTANT = 1.609344;

    public GroupTask(String brand, String model, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public static double convertMphToKph(double mph) {
        return mph * MPH_TO_KPH_CONSTANT;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        }
    }

    public void brake() {
        if (currentSpeed > 0) {
            --currentSpeed;
        }
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return brand + "-" + model + "-" + registrationNumber;
    }

    public static void main(String[] args) {
        GroupTask volvo = new GroupTask("volvo", "xc90", "abc123");
        volvo.setColor("red");
        volvo.setMaxSpeed(200);
        volvo.accelerate();
        volvo.brake();
        volvo.brake();
        System.out.println(volvo.getCurrentSpeed());

        GroupTask saab = new GroupTask("saab", "900", "bbb333");
        saab.setMaxSpeed(1);
        saab.accelerate();
        saab.accelerate();
        double currentSpeedMph = saab.getCurrentSpeed();
        System.out.println(currentSpeedMph);
        System.out.println(GroupTask.convertMphToKph(currentSpeedMph));

        System.out.println(saab);
    }

}
