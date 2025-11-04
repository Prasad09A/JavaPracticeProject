package JAVA_8.OptionalClass;

import java.util.Optional;

public class ofMethodexample {
    public static void main(String[] args) {
        Optional<String> result= Optional.of("Mumbai");
        System.out.println(result.get());
    }
}
