package JAVA_8.FunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<String> name= names->names.toUpperCase();
        System.out.println(name.apply("java"));
    }
}
