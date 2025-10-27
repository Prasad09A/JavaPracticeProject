package CoreJava.Inheritance;

class Animal{
    void walk(){
        System.out.println("Animals are walking");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs are barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog obj= new Dog();
        obj.bark();
        obj.walk();
    }
}
