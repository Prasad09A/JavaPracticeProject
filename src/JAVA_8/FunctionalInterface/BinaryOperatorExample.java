package JAVA_8.FunctionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> number= (a,b)->(a+b);
        System.out.println(number.apply(5,5));
    }

}
