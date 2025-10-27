package CoreJava.AccessModifierP2;

import CoreJava.AccessModifierP1.PublicModifierP1;

public class PublicModifierP2 extends PublicModifierP1 {
    public static void main(String[] args) {
        PublicModifierP2 obj2= new PublicModifierP2();
        obj2.test();
    }
}

class NonSubclassOutsidePackage{
    public static void main(String[] args) {
        PublicModifierP2 obj3= new PublicModifierP2();
        obj3.test();
    }
}
