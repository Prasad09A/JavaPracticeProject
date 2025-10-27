package CoreJava.AccessModifierP2;

import CoreJava.AccessModifierP1.PrivateModifierP1;

public class PrivateModifierP2 extends PrivateModifierP1 {
    public static void main(String[] args) {
        PrivateModifierP2 obj= new PrivateModifierP2();
        //obj.test(); Cannot access it from outside package subclass
    }
}

class NonSubClassDifferentPackage{
    public static void main(String[] args) {
        PrivateModifierP2 obj2= new PrivateModifierP2();
        //obj2.test();  Cannot access it from outside package nonsubclass
    }
}
