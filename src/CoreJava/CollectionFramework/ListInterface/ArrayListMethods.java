package CoreJava.CollectionFramework.ListInterface;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("C");
        list.add("D");

        System.out.println("Original List is: "+list);
        list.add(1,"Z");
        System.out.println("after adding element at index: "+list);
        list.remove("z");
        System.out.println("checks if element exist in list or not: "+list.contains("B"));
        System.out.println("Elements at 2nd index"+list.get(2));
        System.out.println("Size of the list is: "+list.size());

        list.set(0,"f");
        System.out.println("Updated list is: "+list);
        list.clear();
        System.out.println("Check if string is empty "+list.isEmpty());
        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("C"));
        
    }
}
