package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class SortedMethod {
    public static void main(String[] args) {
        List<String> numbers= Arrays.asList("prasad","ram","zerox","vikas","hari","akash");

        numbers.stream().sorted().forEach(i->System.out.println(i));
    }
}
