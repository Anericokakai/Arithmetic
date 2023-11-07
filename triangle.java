package triangle;
class TrianglesArea {
    double side, area;

    public TrianglesArea(double side, double area) {
        this.side = side;
        this.area = area;
    }

    public static double calculateTriangleArea(double side1, double side2, double side3) {
        // Calculate the semi-perimeter of the triangle
        double s = (side1 + side2 + side3) / 2;

        // Apply Heron's formula to calculate the area
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}

