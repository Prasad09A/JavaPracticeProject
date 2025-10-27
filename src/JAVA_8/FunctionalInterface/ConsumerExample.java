package JAVA_8.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> names= name->System.out.println(name.toUpperCase());
        names.accept("java");
    }
}
