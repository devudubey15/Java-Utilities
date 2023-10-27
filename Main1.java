//  1. Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
//  Also show, if needed how will u invoke parent class constructor from child class ?


 class Base {
    Base() {
        System.out.println("Constructor of Base class");
    }
}

class Derived extends Base {
    Derived() {
        super(); 
        System.out.println("Constructor of Derived class");
    }
}

class Child extends Derived {
    Child() {
        super(); 
        System.out.println("Constructor of Child class");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
