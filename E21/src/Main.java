import java.util.*;

public class Main {
    public static void main(String[] args) {

/*
        Map<Integer,String> namesMap = new HashMap<>();
        namesMap.put(1,"gökhan");
        namesMap.put(2,"ilkem");
        namesMap.put(3,"gökçe");

        Set<Integer> mapKeys=namesMap.keySet();

        for(Iterator<Integer> iterator=mapKeys.iterator();iterator.hasNext();){
            int key=(Integer) iterator.next();
            String value=namesMap.get(key);
            System.out.println(value);
        }


        String[] names= {"deniz","melih","mustafa","zeynep","yasin"};
        System.out.println(names);
        Arrays.sort(names);

        System.out.println("after array sort:");

        for(String name: names){
            System.out.println(name);
        }
*/
        /*

        String[] names= {"deniz","melih","mustafa","zeynep","yasin"};
        List<String> nameList=Arrays.asList(names);

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }
*/


        String[] names= {"deniz","melih","mustafa","zeynep","yasin"};
        List<String> nameList=Arrays.asList(names);

        Collections.shuffle(nameList);
        Collections.sort(nameList);
        Collections.reverse(nameList);

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }




    }
}