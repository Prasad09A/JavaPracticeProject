package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class anyMatchMethod {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("prasad","ravi","krishna","om","akhilesh");

        if(names.stream().anyMatch(name->name.length()==4)){
            System.out.println("one match is found");
        }


    }
}
