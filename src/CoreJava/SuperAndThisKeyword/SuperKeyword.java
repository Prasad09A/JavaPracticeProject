package CoreJava.SuperAndThisKeyword;

class ParentClass {
    ParentClass() {
        System.out.println("No-args constructor of parent class");
    }

    ParentClass(int a, String name) {
        System.out.println("2-args constructor of parent class");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super(10, "java");
        System.out.println("No-args constructor of child class");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();

    }
}
