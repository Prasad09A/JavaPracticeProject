package JAVA_8.FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionalExample {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> number= (a,b)->(a+b);
        System.out.println(number.apply(5,5));
    }
}
