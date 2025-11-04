package JAVA_8.OptionalClass;
import java.util.Optional;

public class OfNullableProgram {
    public static void main(String[] args) {
        String str=null;
        Optional<String> city= Optional.ofNullable(str);
        System.out.println(city);
    }
}
