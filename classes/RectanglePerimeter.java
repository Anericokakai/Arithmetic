package classes;

public class RectanglePerimeter {
    private int  length;
    private int width;
    public RectanglePerimeter(int length, int width)
    {
        this.length = length;
        this.width = width;
    }


    public int findPerimeter()
    {
        return 2 * (length + width);
    }
}
