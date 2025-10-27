package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class FilterMethod {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("prasad","ravi","vikas","nilesh");

        names.stream().filter(str->str.length()>5).
                forEach(i->System.out.println(i));
    }
}
