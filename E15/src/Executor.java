public class Executor {
    public void exec() throws ExceptionS{
        Divider devider = new Divider();
        try {
            devider.devide();
        }
        catch (Exception e) {
            System.out.println("hata");
            throw new ExceptionS();
        }

    }
}



