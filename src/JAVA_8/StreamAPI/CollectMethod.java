package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collector.*;

public class CollectMethod {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("prasad","ravi","vikas","akhilesh");

        List<String> name=names.stream().collect(Collectors.toList());
        System.out.println(name);
    }
}
