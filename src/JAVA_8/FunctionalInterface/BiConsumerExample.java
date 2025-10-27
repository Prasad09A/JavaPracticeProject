package JAVA_8.FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,Integer> names=(name,age)->System.out.println("name of the employee is: "+
                name+" and age is: "+age);
        names.accept("Prasad",24);
    }
}
