
public class Main {
    public static void main(String[] args) {

        try {
            function1(1);
            System.exit(1);
        } catch (MyException ex) {
            System.out.println(ex.toString());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            System.out.println("last operation");
        }


        public static void funciton1(int number) throws MyException {
            if (number % 2 == 0) {
                throw new MyException("It should not be even!");
            } else {
                System.out.println("good");
            }
        }
    }
}