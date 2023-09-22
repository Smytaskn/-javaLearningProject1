public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        super();
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getDrawingInfo() {
        return "Circle with radius: " + radius + ", color: " + getColor();
    }
}


