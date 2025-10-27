package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class TraverseStream {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,2,6,4,8,6,9,1);
        Stream<Integer> stream= numbers.stream();

        stream.forEach(i->System.out.println(i));

        stream.forEach(i->System.out.println(i));//It gives exception as only one time
        //Traversing elements is possible like iteration.
    }
}
