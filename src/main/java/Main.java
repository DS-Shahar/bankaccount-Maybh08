import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        BankAccount lisaAcc = new BankAccount(1000, -1000, "Lisa");
        BankAccount bobAcc = new BankAccount(1000, -1000, "Bob");
        System.out.println(lisaAcc);
        System.out.println(bobAcc);
        lisaAcc.transfer(bobAcc, 500);
        System.out.println(lisaAcc);
        System.out.println(bobAcc);
        lisaAcc.transfer(bobAcc, 1600);
        System.out.println(lisaAcc);
        System.out.println(bobAcc);

        Rectangle r1 = new Rectangle(7,7);
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
    }
}