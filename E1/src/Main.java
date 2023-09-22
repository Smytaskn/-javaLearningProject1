import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        //Scanner ile yaş kategorizasyonu

                Scanner scanner = new Scanner(System.in);

                int age;
                System.out.println("Yaşınızı girin: ");
                age = scanner.nextInt();

                if (age>=70) {
                    System.out.println("çok yaşlı");
                } else if(age>=50){
                    System.out.println("yaşlı");
                }
                else if(age>=30){
                    System.out.println("orta yaşlı");
                }
                else if(age>=10){
                    System.out.println("genç");
                }
                else{
                    System.out.println("çocuk");
                }
            }    */


        //insanlardan yaşlarını al yaşlarına göer kategorize et

        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("yaşınızı giriniz:");
        age = scanner.nextInt();

        if ((age > 0) && (age < 18)) {
            System.out.println("çocuk");
        } else if (age >= 18 && age <= 30) {
            System.out.println("genç");
        } else if (age > 30 && age <= 50) {
            System.out.println("orta yaşlı");
        } else if (age > 50 && age <= 70) {
            System.out.println("yaşlı");
        } else if (age > 70) {
            System.out.println("çok yaşlı");
        } else {
            System.out.println("Geçersiz bir değer girdiniz.");
        }
    }
}
