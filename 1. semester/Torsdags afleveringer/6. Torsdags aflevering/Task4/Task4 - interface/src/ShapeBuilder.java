import java.util.ArrayList;

public class ShapeBuilder
{
    ArrayList<Shape> shapes=new ArrayList<>();

    public void addShape(Shape s)

    {
        shapes.add(s);
    }

    public void getTotalArea()
    {
        double result = 0;

        for(Shape tempShape : shapes) {
            result += tempShape.getArea();
            System.out.println(tempShape.getArea());
        }
        System.out.println(result);
    }
}

/*
for(int i = 0; i <=> noget; i++) {
result += shapes.get(i).getArea()
}
result = 0;
for(Shape tempShape : shapes) {
result += tempShape.getArea();
}


 */
