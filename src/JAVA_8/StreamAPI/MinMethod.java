package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class MinMethod {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(6,2,4,1,9,8,5);

        Optional<Integer> min= numbers.stream().min((a,b)->a.compareTo(b));
        System.out.println(min);
    }
}
