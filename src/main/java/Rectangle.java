public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int calcArea() {
        return this.length * this.width;
    }
    public int calcPerimeter() {
        return 2 * (this.length + this.width);
    }
    public void scale(int factor) {
        this.width *= factor;
        this.length *= factor;
    }

    public String toString() {
        return "Width: " + width + "Length: " + length;
    }
}
