package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class SortedWIthComparatorMethod {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("prasad","hari","akash","lkhilesh","gmilkanthwar","om");
        names.stream().sorted((String name1,String name2)->name1.length()-name2.length()).
                forEach(i->System.out.println(i));
    }
}
