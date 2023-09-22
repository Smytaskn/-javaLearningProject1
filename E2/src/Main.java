import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        //kaç not girileceğini
        //girilen not sayısı 101 ise programı çalıştırmayacak

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet not gireceksiniz? ");
        int notAdedi = scanner.nextInt();

        int toplamNot = 0;

        if (notAdedi < 100 && notAdedi > 0) {
            for (int i = 1; i <= notAdedi; i++) {
                System.out.print("Not " + i + ": ");
                int not = scanner.nextInt();
                toplamNot += not;
            }
        } else if (notAdedi == 101) {
            System.out.println("program sonu");
        }

        if ((notAdedi > 0) && (notAdedi != 101)) {
            double notOrtalamasi = (double) toplamNot / notAdedi;
            System.out.println("\n--- Sonuç ---");
            System.out.println("Not Adedi: " + notAdedi);
            System.out.println("Not Ortalaması: " + notOrtalamasi);
        } else {
            System.out.println("Hiç not girilmedi.");
        }
 */
        //öğrencinin aldığı notlar 4 farklı not girilecek
        //not ortalaması hesaplanacak

        /*
        String studentName;
        int biology,math,science,history;
        int average=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("ogrencinin adı nedir?");
        studentName=scanner.nextLine();

        System.out.println("ogrencinin biyoloji notu:");
        biology=scanner.nextInt();

        System.out.println("ogrencinin matematik notu:");
        math=scanner.nextInt();

        System.out.println("ogrencinin fen notu:");
        science=scanner.nextInt();

        System.out.println("ogrencinin tarih notu:");
        history=scanner.nextInt();

        average=((science+math+biology+history)/4);


        System.out.println("öğrencinin adı "+studentName+" öğrencinin not ortalaması:"+average);

        */

        //öğrenci adı ne
        //kaç tane not girilecek
        //bu notların toplamı ve girilecek not sayısına bölünmesi
        //sonucunda ortalmanın bulunması
        //sonunda öğrenci adı ve not ortalaması bastırılması


    String studentName;
    int notAdet;
    int average;
        int sum = 0;
        int not;

        Scanner scanner=new Scanner(System.in);

        System.out.println("öğrencinin adı ne:");
        studentName=scanner.nextLine();

        System.out.println("kaç tane not girilecek:");
        notAdet=scanner.nextInt();

        for(int i=0;i<notAdet;i++){
            System.out.println("lütfen notunuzu giriniz:");
            not=scanner.nextInt();
            if(notAdet ==101){
                System.out.println("101 ve fazlasında not adedi giremezsiniz!");
            break;
            }
            sum=sum+not;
        }

        average=(sum/notAdet);

        System.out.println(studentName+" adlı öğrencinin not ortalaması:"+average);
    }
}


