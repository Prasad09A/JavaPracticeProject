package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class MaxMethod {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,1,9,7,5,6,8);

        Optional<Integer> max= numbers.stream().max((a,b)->a.compareTo(b));
        System.out.println(max);
    }
}
