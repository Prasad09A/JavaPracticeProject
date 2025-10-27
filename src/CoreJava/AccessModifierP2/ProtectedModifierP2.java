package CoreJava.AccessModifierP2;


import CoreJava.AccessModifierP1.ProtectedModifierP1;

public class ProtectedModifierP2 extends ProtectedModifierP1 {
    public static void main(String[] args) {
        ProtectedModifierP2 obj= new ProtectedModifierP2();
        obj.test();
    }
}

class NonSubClass{
    public static void main(String[] args) {
        ProtectedModifierP2 obj2= new ProtectedModifierP2();
        //obj2.test(); We cannot access it from outside package subclass.
    }
}
