// 2. create a class "Vehicle", define a method "public void start()" in it. 
// From this class derive a class FourWheeler. How will u override "start()" method of parent class ?
class Vehicle {
    public void start() {
        System.out.println("starting vehicle");
    }
}

class Fourwheeler extends Vehicle {
    public void start() {
        System.out.println("Starting four wheeler");
        super.start(); 
    }
}

public class Main2 {
    public static void main(String[] args) {
        Vehicle car = new Fourwheeler(); //upcasting
        car.start(); //latebinding
    }
}
