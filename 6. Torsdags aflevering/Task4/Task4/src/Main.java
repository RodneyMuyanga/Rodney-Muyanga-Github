public class Main
{
    public static void main(String[] args)
    {
        Square square = new Square(22,7);
        Circle circle = new Circle(25);
        System.out.println(square.getArea());

        ShapeBuilder builder = new ShapeBuilder();
        builder.addShape(square);
        builder.addShape(circle);

    }
}