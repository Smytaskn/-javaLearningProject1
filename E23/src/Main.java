import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings =new ArrayList<String>(Arrays.asList("sf","asfasf","fs","afasf","gh","asfas","asfasf","gsdfg"));
        List<Integer> ex=new ArrayList<>(Arrays.asList(0,1));

        ListFilter<String> filter1= (s)->(s.contains("a"));
        ListFilter<String> filter2= (s)->(s.length()==2);
        ListFilter<String> filter3= (s)->(s.startsWith("a"));
        ListFilter<List<Integer>> filter4= (s)->(s.get(0)==0);



    }}
        /*
       List arrayList =new ArrayList();
       arrayList.add("hello");
       arrayList.add("world");

       ListFilter listFilter= (text) ->text.contains("b");
       ListFilter listFilter1=(text) -> text.contains("a");

       List otherList= new ArrayList();
       otherList.add("Helloa");

        //compareList(arrayList,listFilter1);
       compareList(otherList,listFilter1);

    }

    public static void compareList(List list,ListFilter listFilter){
        for(int i=0;i< list.size();i++){
            if(listFilter.satisfiesCondition(list.get(i).toString())){
                System.out.println(list.get(i));
            }
        }
    }

}/*