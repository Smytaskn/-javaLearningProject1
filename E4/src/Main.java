import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /*
        //1 ile 100 arasında bir say seçilsin random
        //5 hakkın var tahmin et

        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        int guess_step = 0;
        int guess = 0;

        //System.out.println("1 ile 100 arasında bir sayı seçildi tahmin et!");

        while ((guess != random) && (guess_step < 5)) {
            System.out.println("1 ile 100 arasında bir sayı seçildi tahmin et!");
            guess = scanner.nextInt();
        }

        if (guess == random) {
            System.out.println("tebrikler doğru tahmin ettiniz.");
        } else {
            System.out.println("maalesef doğru bilemediniz.");
        }

        if (guess > random) {
            System.out.println("Çok yüksek bir sayı söylediniz");
        } else if (guess < random) {
            System.out.println("çok düşük bir sayı söylediniz");
        } else if (guess == random) {
            System.out.println("tebrikler bildiniz");
        } else {
            System.out.println("geçerli olmayan bir sayı girdiniz.");
        }

         */
        //1 ile 100 arasında random bir sayı seçtir
        // 5 hakkın var
        //tahmin edilden sayı seçilen sayıdan büyük veya küçük olduğunu belirt(üstündesin altındasın gibi)

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guessChance = 5, guess = 0;

        for (int i = 0; i < guessChance; i++) {
            System.out.println("0 dan 100 e kadar bir sayı seçildi tahmin et");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("tebrikler bildiniz");
                break;
            } else if (guess > randomNumber) {
                System.out.println("büyük bir sayı söylediniz");
            } else if (guess < randomNumber) {
                System.out.println("küçük bir sayı söylediniz");
            }
            else{
                System.out.println("geçerli olmayan bir sayı girdiniz");
            }
            //eğer tahmin hakkın bitti ve doğru tahmin edemediysen buraya girecek
            if((i==guessChance-1)&& guess!=randomNumber ){
                System.out.println("maalesef oyunu kaybettiniz");
            }
            }

    }
}