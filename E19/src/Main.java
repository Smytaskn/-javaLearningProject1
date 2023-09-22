import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("simay",22);

        FileOutputStream fileOutputStream =new FileOutputStream();
        try(ObjectOutputStream oos=new ObjectOutputStream(fileOutputStream("student.ser"))){
            oos.writeObject(student);
            System.out.println("Student objesi serialized");
        }
        catch(IOException e){
            e.printStackTrace();
        }



    }
}