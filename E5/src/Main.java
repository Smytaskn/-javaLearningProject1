import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        dizi yaz içine random sayılar ata
        normal ve tersini bastır

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("diziyi normal sırada bastır:" + Arrays.toString(array));

        System.out.print("diziyi ters bastır:");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
*/
        //boyutu 10 olan bir dizi oluştur içine 0-100 arasında normal sayılar ata
        //diziyi normal sırada bastır
        //diziyi ters sırada bastır

        int array[]= new int[10];
        Random random=new Random();

        for(int i=0;i< array.length;i++) {
            array[i] = random.nextInt(100)+1;
        }

        for(int i=0;i< array.length;i++){
            System.out.println("diziyi normal sırada bastır: "+array[i]);
        }

        for(int i = array.length-1; i>=0; i--){
            System.out.println("diziyi tersten bastırır: "+array[i]);
        }



        //burada bu kodu böyle de yazabilirsin
        //System.out.println("diziyi normal sırada bastır:"+Arrays.toString(array));






    }
}