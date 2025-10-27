package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;


public class SkipMethod {
    public static void main(String[] args) {
    List<String> names= Arrays.asList("prasad","vikas","ram","hari","prakash");

    names.stream().skip(2).forEach(i->System.out.println(i));
    }
}
