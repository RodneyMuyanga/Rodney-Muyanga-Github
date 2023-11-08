public class  Square implements Shape
{
    double width;
    double length;

    public Square(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return width * length;
    }
}
