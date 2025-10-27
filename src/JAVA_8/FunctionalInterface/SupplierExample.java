package JAVA_8.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> input= ()->"Hello Prasad";
        System.out.println(input.get());
    }
}
