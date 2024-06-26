// Abstract class
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void startEngine();

    // Concrete method
    void stopEngine() {
        System.out.println(brand + " engine is stopping.");
    }
}

// Interface
interface Drivable {
    void accelerate();
    void brake();
}

// Derived class Car
class Car extends Vehicle implements Drivable {
    int doors;

    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    @Override
    void startEngine() {
        System.out.println(brand + " car engine is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(brand + " car is braking.");
    }
}

// Derived class Motorcycle
class Motorcycle extends Vehicle implements Drivable {
    boolean hasSidecar;

    Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void startEngine() {
        System.out.println(brand + " motorcycle engine is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " motorcycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(brand + " motorcycle is braking.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("Harley", false);

        System.out.println("Car actions:");
        car.startEngine();
        car.accelerate();
        car.brake();
        car.stopEngine();

        System.out.println("\nMotorcycle actions:");
        motorcycle.startEngine();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.stopEngine();
    }
}
