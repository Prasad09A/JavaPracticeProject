package JAVA_8.OptionalClass;

import java.util.Optional;

public class IsPresentMethodProgram {
    public static void main(String[] args) {
        Optional<String> city= Optional.of("Mumbai");
        if(city.isPresent()){
            System.out.println("City is: "+city.get());
        }
    }
}
