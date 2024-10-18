public class Circle {
    private static double PI = 3.14159; // Corrected the PI value for accuracy

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5),
                new Circle(10),
                new Circle(15)
        };

        for (Circle circle : circles) {
            System.out.printf("Area of circle with radius %.2f is %.2f%n", circle.radius, circle.computeArea());
        }
    }
}