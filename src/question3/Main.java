package question3;

public class Main {
    public static void swap(RectangleWrapper r1, RectangleWrapper r2) {
        Rectangle temp = r1.rectangle;
        r1.rectangle = r2.rectangle;
        r2.rectangle = temp;
    }

    public static void main(String[] args) {
        Rectangle[] rectangles = { // Display rectangles whose area exceeds 1500
                new Rectangle(50, 40),
                new Rectangle(60, 30),
                new Rectangle(50, 20),
                new Rectangle(40, 35)};
        System.out.println("Rectangles with area greater than 1500:");
        for (Rectangle r : rectangles) {
            if (r.getArea() > 1500) {
                System.out.println(r);
                System.out.println("----------------");
            }
        } // Select two rectangles with the same length
        RectangleWrapper r1 = new RectangleWrapper(rectangles[0]);
        RectangleWrapper r2 = new RectangleWrapper(rectangles[2]);
        System.out.println("\nBefore Exchange:");
        System.out.println("Rectangle 1:\n" + r1.rectangle);
        System.out.println("Rectangle 2:\n" + r2.rectangle);
        // Exchange the rectangles
        if (r1.rectangle.getLength() == r2.rectangle.getLength() && r1.rectangle.getWidth() != r2.rectangle.getWidth()) {
            swap(r1, r2);
            // Update the original array
            rectangles[0] = r1.rectangle;
            rectangles[2] = r2.rectangle;
        }
        System.out.println("\nAfter Exchange:");
        System.out.println("Rectangle 1:\n" + rectangles[0]);
        System.out.println("Rectangle 2:\n" + rectangles[2]);
    }
}

