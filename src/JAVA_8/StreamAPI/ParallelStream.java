package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,1,8,5,5,9,4,6);
        System.out.println("Normal way of printing streams elements: ");
        numbers.stream().filter(num->(num>=5)).
                distinct().forEach(i->System.out.println(i));

        System.out.println("Parallel way of printing streams elements: ");

        numbers.parallelStream().filter((num->num>=5)).
                distinct().forEach(i->System.out.println(i));
    }
}
