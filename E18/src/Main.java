import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people= Arrays.asList(
        new Person(25,"John"),
        new Person(38,"Jane"),
        new Person(28,"Jake"),
        new Person(32,"David"),
        new Person(27,"Julia"),
        new Person(23,"Mary"));
        Filters filters=new Filters();
        filters.filterList(people);


    }
}