package JAVA_8.StreamAPI;

import java.util.*;

public class FindFirstMethod {
    public static void main(String[] args) {
        List<Integer> names= Arrays.asList(6,3,1,5,8,9,7);

        Optional<Integer> numbers= names.stream().findFirst();
        System.out.println(numbers);
    }
}
