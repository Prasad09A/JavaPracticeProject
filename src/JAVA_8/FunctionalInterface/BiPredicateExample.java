package JAVA_8.FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String,Integer> number= (str,len)->(str.length()==len);
        System.out.println(number.test("java",4));
        System.out.println(number.test("prasadA",7));
    }
}
