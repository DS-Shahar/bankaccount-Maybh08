import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Rectangle r1 = new Rectangle(7, 7);
        r1.draw();

        System.out.println("Enter width: ");
        int width = reader.nextInt();
        System.out.println("Enter length: ");
        int length = reader.nextInt();
        Rectangle r2 = new Rectangle(length, width);

        System.out.println("Enter width: ");
        width = reader.nextInt();
        System.out.println("Enter length: ");
        length = reader.nextInt();
        Rectangle r3 = new Rectangle(length, width);

        r2.draw();
        r3.draw();

        r2.scale(2);

        System.out.println("Sum of perimeters: " + r2.calcPerimeter() + r3.calcPerimeter());

        System.out.println("Sum of areas: " + r2.calcArea() + r3.calcArea());

        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.5);

        // חישוב והדפסת שטח המעגלים
        System.out.println("The area of the first circle is: " + circle1.area());
        System.out.println("The area of the second circle is: " + circle2.area());
    }
}