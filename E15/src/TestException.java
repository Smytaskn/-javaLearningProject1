public class TestException {
    public static void main(String[] args) {
        Executor executor=new Executor();

        try {
            executor.exec();
        }
        catch(ExceptionS s){
        System.out.println("ExceptionS(Herhangi bir hata türü) türünde bir hatadır.");
        }


    }
}
