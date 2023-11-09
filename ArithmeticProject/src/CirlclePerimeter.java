public class CirlclePerimeter {
    private double radius;
    private final double PI;

    public CirlclePerimeter(double radius) {
        this.radius = radius;
        PI = 22 / 7;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }
}