interface Vehicle {
    void start(); // Abstract method by default
}

// Class implementing the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a key ignition.");
    }
}

public class m42{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
    }
}
