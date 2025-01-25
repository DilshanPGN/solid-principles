package liskov.substitution.principle;

public class RectangleTest {
    public static void testRectangleArea(Rectangle rectangle, int width, int height) {
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        int area = rectangle.computeArea();
        assert area == width * height : "Area calculation is incorrect";
        System.out.println(area);
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        testRectangleArea(rectangle, 5, 10);

        Rectangle square = new Square();
        testRectangleArea(square, 5, 10);

        //ou can see, we got different results for the same input.
    }
}
