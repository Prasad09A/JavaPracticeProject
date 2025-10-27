package CoreJava.String;

public class HashcodeExample {
    public static void main(String[] args) {

        HashcodeExample obj= new HashcodeExample();
        System.out.println("Hashcode of obj is: "+obj.hashCode());

        String s="prasad";
        System.out.println("Hashcode of s is: "+s.hashCode());

        String s1=new String("prasad");
        System.out.println("Hashcode of s1 is: "+s1.hashCode());
    }
}
//Hashcode is a unique code generated yh JVM at the time of creatio of object.
//Hashcode is used to perform some operation on the hashing related algorithms like
//hashmap and hashtable.
//Hashcode is always same if 2 objetcs are same.
//hashcode does not provide the memory address of object.
