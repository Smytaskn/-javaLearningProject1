public class MyException extends Exception {

    String ErrorMessage;

    public MyException(String ErrorMessage){
        this.ErrorMessage=ErrorMessage;
    }

    @Override
    public String toString(){
        return "MyException "+"ErrorMessage="+ErrorMessage;
    }



}