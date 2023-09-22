


class Circle {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

    class Rectangle {
        private int height;
        private int width;
        private String color;

        public Rectangle(int height, int width, String color) {
            this.height = height;
            this.width = width;
            this.color = color;
        }

        public int getHeight() {

            return height;
        }

        public void setHeight(int height) {

            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {

            this.width = width;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {

            return color;
        }

        public int calculateArea() {
            return width * height;
        }

    }

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Kırmızı");
        Rectangle rectangle = new Rectangle(10, 15, "Mavi");
        Pen pen = new Pen();

        pen.drawCircle(circle);
        pen.drawRectangle(rectangle);

        pen.changeColorCircle("Sarı", circle);
        pen.changeColorRectangle("Yeşil", rectangle);
    }
}