package JAVA_8.StreamAPI;


import java.util.stream.Stream;
import java.util.*;

public class LimitMethod {
    public static void main(String[] args) {
    List<String> names= Arrays.asList("prasad","vikas","ravi","arjun","ram","hari","shikhar","virat");

    names.stream().limit(5).
            forEach(i->System.out.println(i));
    }
}
