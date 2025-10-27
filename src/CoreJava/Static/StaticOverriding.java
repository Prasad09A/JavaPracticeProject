package CoreJava.Static;

class Parent{
    static void show(){
        System.out.println("Static Show method of parent");
    }
}
class child extends Parent{
    static void show(){
        System.out.println("Static show method of child");
    }
}

public class StaticOverriding {
    public static void main(String[] args) {
        Parent P= new child();
        P.show(); // calls parent when static and normal method calls child bcoz object is of child
    }
}
/*This is called method hiding, because:
The child’s static method doesn’t override the parent’s.
It only hides the parent’s version if you call it using Child.show().
But if you use a Parent reference, JVM calls the parent’s version.*/
