import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int plate,area;
        int total_area=0;

        System.out.println("Kaç tane şehir gireceksiniz?");
        int  city_number=scanner.nextInt();

        int array[][]=new int[city_number][2];

        for(int i=0;i<city_number;i++){
            System.out.println("lütfen yazacağınız "+(i+1)+".şehrin  plaka kodunu giriniz:");
            plate=scanner.nextInt();
            array[i][0]=plate;
        }
        for(int i=0;i<city_number;i++){
        System.out.println("lütfen "+(i+1)+". şehrin alanını giriniz:");
        area=scanner.nextInt();
        array[i][1]=area;
        total_area +=area;
        }

        System.out.println("Şehir Listesi:");
        for (int i = 0; i < city_number; i++) {
            System.out.println("Plaka Kodu: " + array[i][0] + ", Alan: " + array[i][1]);
        }
        System.out.println("total area: "+total_area);



        /*
        String[][] plakalar = new String[][];

        Scanner scanner = new Scanner(System.in);
        System.out.println("plaka kodu giriniz:");
        String plakaKodu= scanner.nextLine();

        String sehir= null;

        for(int i=0; i< plakalar.length;i++){

        }
*/
    /*p= plate number
       int area=0;
        Scanner scanner= new Scanner(System.in);

        int p= scanner.nextInt();*/







    }
}