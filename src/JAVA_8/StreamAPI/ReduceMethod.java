package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(5,1,9,7,2,4,6);

        Optional<Integer> result= numbers.stream().reduce((a,b)->(a+b));
        System.out.println(result);
    }
}
