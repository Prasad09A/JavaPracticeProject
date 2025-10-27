package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class AllMatchMethod {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("prasad","ravi","om","akhilesh","vikas");

        if(names.stream().allMatch(name->name.length()>1)){
            System.out.println("all match found");
        }
    }
}
