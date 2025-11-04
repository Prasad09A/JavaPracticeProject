package JAVA_8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class PipelineOfOperationsExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Prasad", "Vikas","ram","omkar","omkar","abhimanyu");
        names.stream().filter(name->name.length()>3).distinct().forEach(i->System.out.println(i));

System.out.println("Adding change from master");
System.out.println("Adding new line in feature 1");

    }
}
