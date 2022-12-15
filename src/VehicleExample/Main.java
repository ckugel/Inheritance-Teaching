package src.VehicleExample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        example();
    }
    public static void example() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bike());
        vehicles.add(new Bike());
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Car());

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < vehicles.size(); i++) {
                vehicles.get(i).goForward();
            }
        }
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i));
        }
    }
}
