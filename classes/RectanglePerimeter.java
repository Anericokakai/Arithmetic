public class RectanglePerimeter {
    private double length;
    private double width;
    public RectanglePerimeter(double length, double width)
    {
        this.length = length;
        this.width = width;
    }


    public double findPerimeter()
    {
        return 2 * (length + width);
    }
}
