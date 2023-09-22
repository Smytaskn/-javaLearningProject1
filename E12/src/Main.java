
public abstract class Shape {
    private int startX;
    private int startY;

    //setter getter


    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public abstract void draw();
}

public class Circle extends Shape{
    @Override
    public void draw() {

    }
}


public class Main {
    public static void main(String[] args) {

        Shape circle= new Circle();

        circle.draw();



        System.out.println("Hello world!");
    }
}