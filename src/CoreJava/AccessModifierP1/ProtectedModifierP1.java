package CoreJava.AccessModifierP1;

class ProtectedPackageP1{
    protected void test(){
        System.out.println("test method");
    }
}
public class ProtectedModifierP1 extends ProtectedPackageP1{
    public static void main(String[] args) {
        ProtectedModifierP1 obj= new ProtectedModifierP1();
        obj.test();
    }
}

class NonSubClassSamePackage1{
    public static void main(String[] args) {
        ProtectedModifierP1 obj2= new ProtectedModifierP1();
        obj2.test();
    }
}
