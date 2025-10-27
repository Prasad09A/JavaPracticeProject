package CoreJava.CollectionFramework.MapInterface;
import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("prasad",1);
        map.put("vikas",3);
        map.put("aditya",4);
        map.put("ravi",2);

        System.out.println("Elements present in hashmap is: "+map);
        System.out.println(map.size());
        System.out.println(map.containsKey("vikas"));
        System.out.println(map.containsValue(3));
        System.out.println(map.get(1));
        map.putAll(map);


        map.clear();
        System.out.println("map is empty or not? "+map.isEmpty());


    }
}
