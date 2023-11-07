package triangle;
class TrianglesArea {
    double base, height;

    public TrianglesArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public static double calculateTriangleArea(double base, double height) {
        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        return area;
    }
}
