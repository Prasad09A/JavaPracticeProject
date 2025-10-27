package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class CreateStreamOfSingleElement {
    public static void main(String[] args) {
        Stream<CreateStreamOfSingleElement> numbers= Stream.of(new CreateStreamOfSingleElement());
        System.out.println(numbers.count());
    }
}
