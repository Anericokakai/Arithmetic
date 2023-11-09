public class CircleArea {
    private  double radius;
    private final double PI;

    CircleArea(double radius){
        this.radius = radius;
        PI = 22 / 7;
    }
    public double area(){
        return  PI * radius * radius;
    }
}
