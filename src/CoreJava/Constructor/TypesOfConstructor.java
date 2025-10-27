package CoreJava.Constructor;

class ConstructorExample {
    String name;
    int age;

    ConstructorExample() {
        System.out.println("Default Constructor");
    }

    ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parametrized constructor");
    }
}

public class TypesOfConstructor {
    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();   //No-Args Constructors

        ConstructorExample obj2 = new ConstructorExample("java", 25);//Parameterized Constructors
        System.out.println(obj2.name + obj2.age);
    }
}
