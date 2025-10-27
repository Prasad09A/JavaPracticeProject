package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class CreateEmptyStream {
    public static void main(String[] args) {
        Stream<CreateEmptyStream> stream= Stream.empty();
        System.out.println(stream.count());
    }
}
