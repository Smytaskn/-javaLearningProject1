import java.util.concurrent.Callable;

class Car{
    private String color;
    private int capacity;

    public Car(){
        color="Blue";
        capacity=5;
    }
    public Car(String color,int capasity){
        color=this.color;
        capasity=this.capacity;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        Car car2 =new Car("Red",4);
        System.out.println(car);
        System.out.println(car2);

            }
        }

