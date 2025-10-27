package JAVA_8.FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String,Integer> number= str->str.length();
        System.out.println(number.apply("java"));
        System.out.println(number.apply("prasad"));
    }
}
