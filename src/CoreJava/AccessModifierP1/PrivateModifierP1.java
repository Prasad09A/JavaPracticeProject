package CoreJava.AccessModifierP1;

class PrivatePackageP1{
    private void test(){
        System.out.println("test method");
    }
}
public class PrivateModifierP1 extends PrivatePackageP1{
    public static void main(String[] args) {
        PrivateModifierP1 obj= new PrivateModifierP1();
        //obj.test(); Cannot access it from same package subclass
    }
}

class NonSubClassSamePackage{
    public static void main(String[] args) {
        PrivateModifierP1 obj2= new PrivateModifierP1();
        //obj2.test();  Cannot access it from same package subclass
    }
}