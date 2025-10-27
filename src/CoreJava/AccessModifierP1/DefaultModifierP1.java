package CoreJava.AccessModifierP1;

class SameClass {
    void test(){
        System.out.println("Test method");
    }
}

public class DefaultModifierP1 extends SameClass {
    public static void main(String[] args) {
        DefaultModifierP1 obj= new DefaultModifierP1();
        obj.test();
    }
}

class NonSubclass{
    public static void main(String[] args) {
        DefaultModifierP1 obj2= new DefaultModifierP1();
        obj2.test();
    }
}
