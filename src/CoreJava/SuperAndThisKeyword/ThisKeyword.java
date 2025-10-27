package CoreJava.SuperAndThisKeyword;

class ThisParentClass {
    ThisParentClass() {
        this(10, "java", 30);
        System.out.println("no-args constructor of parent class");
    }

    ThisParentClass(int a, int b) {
        System.out.println("2- args constructor of parent class");
    }

    ThisParentClass(int a, String name, int c) {
        System.out.println("3-args constructor of parent class");
    }
}

class ThisChildClass extends ThisParentClass {
    ThisChildClass() {
        System.out.println("No-args constructor of child class");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        ThisChildClass obj = new ThisChildClass();
    }
}
