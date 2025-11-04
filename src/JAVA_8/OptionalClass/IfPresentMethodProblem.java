package JAVA_8.OptionalClass;

import java.util.Optional;

public class IfPresentMethodProblem {
    public static void main(String[] args) {
        Optional<String> city= Optional.of("Mumbai");
        city.ifPresent(c->System.out.println(c));
    }
}
