package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class CountMethod {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,1,6,4,9,8,6,1,7,2,3);

        long result= numbers.stream().count();
        System.out.println(result);
    }
}
