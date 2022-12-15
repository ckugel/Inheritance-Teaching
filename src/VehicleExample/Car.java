package src.VehicleExample;

public class Car extends Vehicle{
    protected double speed;

    public Car() {
        super(4);
        speed = 40;
    }

    public void goForward() {
        position += speed;
    }
}
