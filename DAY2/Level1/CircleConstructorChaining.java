public class CircleConstructorChaining {
    public static void main(String[] args) {
        Circle circle1 = new Circle(39);
        circle1.displayRadius();
    }
}

class Circle {
    private int radius;

    Circle() {
        this(3);
    }

    Circle(int radius) {
        this.radius = radius;
    }

    public void displayRadius() {
        System.out.println("Your radius of the circle is: " + radius);
    }
}