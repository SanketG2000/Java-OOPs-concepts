class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Over {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw(); // Calls the draw() method of Circle
        shape2.draw(); // Calls the draw() method of Rectangle
    }
}
