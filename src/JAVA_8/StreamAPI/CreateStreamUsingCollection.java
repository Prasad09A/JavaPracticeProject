package JAVA_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class CreateStreamUsingCollection {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(9);

        list.stream().skip(2).forEach(i->System.out.println(i));
    }
}
