//  Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("Car constructor");
    }

    void start() {
        super.start();
        System.out.println("Car started.");
    }

    void drive() {
        System.out.println("Car is being driven.");
    }
}

class Bike extends Vehicle {
    Bike() {
        System.out.println("Bike constructor");
    }

    void start() {
        super.start();
        System.out.println("Bike started.");
    }

    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bike bike = new Bike();
        

        car.start();
        car.drive();
        
        bike.start();
        bike.ride();
    }
}
