import java.util.*;
import java.util.Collections;
import java.lang.Object;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String inputText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Vestibulum commodo nisi eu condimentum porta. Mauris interdum eu dolor vitae consequat." +
                " Nam ligula felis, convallis ut dui interdum, ullamcorper maximus mi. " +
                "Nullam posuere ex libero, a tincidunt tortor suscipit nec. " +
                "Donec viverra est id leo lacinia sagittis. Pellentesque at" +
                " nulla tortor. Fusce turpis nulla, pharetra ac eros eget, luctus scelerisque mi. " +
                "Cras id mi vitae urna dictum dignissim. Praesent eu luctus diam. " +
                "Sed aliquet, risus ac ultricies mollis, quam augue consectetur lectus, a condimentum justo" +
                " felis vel justo. Nullam accumsan sem nulla, vitae hendrerit dolor " +
                "rhoncus vel. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;" +
                " Mauris eget gravida ligula.\n" +
                "\n" +
                "Proin ultrices, quam eu mattis malesuada, ligula magna faucibus elit," +
                "sed eleifend sem neque at metus. Praesent quis est pharetra nisi dapibus commodo at ut orci." +
                " Cras metus lorem, congue in nibh ultricies, gravida volutpat arcu. Mauris scelerisque viverra mauris, " +
                "vitae pharetra sem aliquet ac. Phasellus sit amet nunc in orci viverra iaculis at ac massa. Maecenas sit amet tellus leo." +
                "Vestibulum volutpat feugiat sapien a condimentum. Proin pulvinar at leo sed pretium. Suspendisse potenti. Cras pulvinar ornare faucibus.\n" +
                "\n" +
                "Donec tincidunt odio quis vehicula tincidunt. Quisque commodo pulvinar laoreet." +
                " Ut sed felis sed magna interdum blandit. Proin euismod, arcu nec sagittis pellentesque," +
                "odio diam aliquet risus, id accumsan arcu augue ac velit." +
                " Morbi felis leo, elementum et augue eget, ultricies sodales mauris." +
                "Cras lobortis, massa ac dapibus congue, tortor tellus faucibus mi, a bibendum magna lorem quis metus. " +
                "Pellentesque vulputate egestas turpis at feugiat.";


        inputText = inputText.toLowerCase()
                .replace(",", "")
                .replace(".", "")
                .replace("\n", "");


        String[] words = inputText.split(" ");
        // kelimeleri ayırdık(boşluk doğru mu word i.in \\ mı kullanmalıyız) bir diziye atadık

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            int count = Collections.frequency(Arrays.asList(words), word);
            wordCounts.put(word, count);
        }

        for (String key : wordCounts.keySet()) {
            //keyset word countun anahatarısı set koleksiyounu döndürür
            int frequency = wordCounts.get(key);
            System.out.println("key:" + key + " " + "kaç kez:" + frequency);
        }

        List<String> uniqueWords = new ArrayList<>(wordCounts.keySet());
        Collections.sort(uniqueWords);
        //alfabetik olarak sıraladık

        //alfabetik olarak bastırdık
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        for (String word : uniqueWords) {
            int count = wordCounts.get(word);
            System.out.println(word + ":" + count);

        }

        Function<Integer, Integer> doubleNumber;
        doubleNumber = x -> x * 2;
    }
}


        /*
        for(String word: words){
        int count=wordCounts.getOrDefault(low)
                wordCounts.put(count)

        }

        for(Map.Entry<String,Integer> ent)




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan metni alın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni girin:");
        String text = scanner.nextLine();

        // Metni boşluklara göre böler ve kelimeleri bir diziye ekler
        String[] words = text.split("\\s+");

        // Kelimeleri saymak için bir harita (map) kullanın
        Map<String, Integer> wordCounts = new HashMap<>();

        // Her kelimenin sayısını sayın
        for (String word : words) {
            // Kelimenin küçük harfli haliyle işlem yapmak için
            String lowercaseWord = word.toLowerCase();

            // Haritada bu kelimenin sayısını artırın
            wordCounts.put(lowercaseWord, wordCounts.getOrDefault(lowercaseWord, 0) + 1);
        }

        // Kelimeleri alfabetik sıraya göre sıralamak için bir TreeMap kullanın
        Map<String, Integer> sortedWordCounts = new TreeMap<>(wordCounts);

        // Sonuçları ekrana yazdırın
        for (Map.Entry<String, Integer> entry : sortedWordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
*/