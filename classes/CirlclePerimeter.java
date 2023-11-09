package classes;

public class CirlclePerimeter {
    private double radius;
    private final double PI=22 / 7;




    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }



    public double perimeter(int radius) {

        return 2 * this.PI * radius;
    }
}