package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class MapMethod {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("prasad","ram","krishna","akhilesh","vikas","ap","aadhiraja");

        names.stream().map(name->name.length()).distinct().
                forEach(i->System.out.println(i));
    }

    //It takes an element from the stream and applies function to it and returns a new stream with
    //transformed.
}
