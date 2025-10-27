package CoreJava.Inheritance;

class Animal2{
    void walk(){
        System.out.println("Animals are walking");
    }
}
class Dog2 extends Animal2{
    void bark(){
        System.out.println("Dogs are barking");
    }
}
class Cat2 extends Animal2{
    void meow(){
        System.out.println("Cats are meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat2 obj= new Cat2();
        obj.meow();
        obj.walk();

        Dog2 obj2=new Dog2();
        obj2.bark();
        obj2.walk();
    }
}
