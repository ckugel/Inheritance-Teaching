package src.VehicleExample;

public class Vehicle {
    protected int numberOfWheels;
    protected double position;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        position = 0;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * naturally it's safe to assume that this is a really stupid way to get position after going forward
     * we can get more specific with by overriding this method in subclasses
     */
    public void goForward() {
        position += numberOfWheels;
    }

    public String toString() {
        return String.valueOf(position);
    }
}
