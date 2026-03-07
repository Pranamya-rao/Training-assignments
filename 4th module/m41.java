abstract class Shape {
    // Abstract method (no body)
    abstract void display();
}

// Concrete class extending the abstract class
class Circle extends Shape {
    @Override
    void display() {
        System.out.println("Displaying a Circle.");
    }
}

public class m41 {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        myCircle.display();
    }
}
