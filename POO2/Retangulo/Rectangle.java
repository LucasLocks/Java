package POO2.Retangulo;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return String.format("AREA = %.2f%n", area()) +
               String.format("PERIMETRO = %.2f%n", perimeter()) +
               String.format("DIAGONAL = %.2f", diagonal());
    }
}
