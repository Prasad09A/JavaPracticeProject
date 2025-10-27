package JAVA_8.FunctionalInterface;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> number= num->num%2==0;
        System.out.println(number.test(10));
        System.out.println(number.test(7));

    }
}
