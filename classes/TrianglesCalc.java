package classes;

 public class TrianglesCalc {
    double base, height;

    public TrianglesCalc(double base, double height) {
        this.base = base;
        this.height = height;
    }

     public TrianglesCalc() {

     }

     public  double calculateTriangleArea(double base, double height) {
        // Calculate the area of the triangle

        return 0.5 * base * height;
    }
}
