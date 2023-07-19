import products.Product;
import vehicles.*;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.water.Motor;
import vehicles.water.Speedboat;
import vehicles.air.Plane;
import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuel());
        System.out.println(car1.getPrice());

        // lab tests (vehicles.water vehicle related)...
        Speedboat speedboat1 = new Speedboat(50,20,new Product("Speedboat",10000,8),"Wood", new Motor(50,50));
        vehicles.add(speedboat1);

        speedboat1.startEngine();
        System.out.println(speedboat1.getFuel());
        System.out.println(speedboat1.getPrice());

        Plane plane1 = new Plane(100000,100,new Product("Plane",10000000,2),2,40000,500, new Motor(90,5000));
        vehicles.add(plane1);

        plane1.startEngine();
        System.out.println(plane1.getFuel());
        System.out.println(plane1.getPrice());

    }
}
