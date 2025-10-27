package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class DistinctMethod {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("prasad","ravi","prasad","krishna","vikas","krishna");

        names.stream().distinct().forEach(i->System.out.println(i));
    }
}
