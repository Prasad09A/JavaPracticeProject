package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class FindAnyMethod {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(4,1,3,8,2,9,7);

        Optional<Integer> number= numbers.stream().findAny();
        System.out.println(number);
     }
}
