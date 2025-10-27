package CoreJava.CollectionFramework.ListInterface;
import java.util.*;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");
        list.add("Mango");
        list.add("Milkshake");

        System.out.println("Elements present in LinkedList are: "+list);
        list.addFirst("grapes");
        list.addLast("strawberry");
        System.out.println("Elements after adding first and last elements in LinkedList are: "+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("Elements after removing first and last elements in LinkedList are: "+list);
        System.out.println(list.contains("apple"));
        System.out.println(list.size());
        list.remove("Banana");
        System.out.println("List after removing banana is: "+list);

        System.out.println(list.get(1));
        System.out.println(list.set(2,"keliii"));
        System.out.println(list.indexOf("mango"));
        System.out.println(list.lastIndexOf("aaple"));
        System.out.println(list.poll());
        System.out.println(list.peek());

        list.clear();
        System.out.println(list.isEmpty());




    }
}
