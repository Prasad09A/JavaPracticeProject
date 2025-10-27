package JAVA_8.StreamAPI;

import java.util.stream.Stream;


public class CreateStreamMultipleValues {
    public static void main(String[] args) {
        Stream<Integer> numbers= Stream.of(2,7,4,1,9,6,8);
        System.out.println(numbers.count());
    }
}
