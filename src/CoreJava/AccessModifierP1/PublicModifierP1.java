package CoreJava.AccessModifierP1;

class PublicPackageP1{
    public void test(){
        System.out.println("test method");
    }
}

public class PublicModifierP1 extends PublicPackageP1{
    public static void main(String[] args) {
    PublicModifierP1 obj= new PublicModifierP1();
    obj.test();
    }
}

class NonSubClass{
    public static void main(String[] args) {
        DefaultModifierP1 obj2= new DefaultModifierP1();
        obj2.test();
    }
}