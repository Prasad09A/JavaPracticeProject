package CoreJava.Static;

class ParentNew {
    static void test(int a) {
        System.out.println("test method of Parent: ");
    }

    static void test(String name) {
        System.out.println("test method of child: ");
    }
}

public class StaticOverloading {
    public static void main(String[] args) {
        ParentNew.test(10);
        ParentNew.test("prasad");
    }
}
