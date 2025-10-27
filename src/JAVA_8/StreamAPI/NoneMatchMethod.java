package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class NoneMatchMethod {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("prasad","om","akhilesh","vikas");

        if(names.stream().noneMatch(name->name.length()==3)){
            System.out.println("No match found");
        }
    }
}
