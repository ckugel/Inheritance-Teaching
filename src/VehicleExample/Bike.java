package src.VehicleExample;

public class Bike extends Vehicle{
    protected double maxSpeed;

    public Bike() {
        super(2);
        maxSpeed = 2.5;
    }

    public void moveForward() {
        position += maxSpeed;
    }
}
