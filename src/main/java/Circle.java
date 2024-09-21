public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // פעולה שמחשבת את שטח המעגל
    public double area() {
        return Math.PI * radius * radius;
    }
}
