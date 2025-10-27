package CoreJava.Inheritance;

class Animal1{
    void walk(){
        System.out.println("Animals are walking");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dogs are barking");
    }
}
class Cat1 extends Dog1{
    void meow(){
        System.out.println("Cats are meowing");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Cat1 obj= new Cat1();
        obj.meow();
        obj.bark();
        obj.walk();
    }
}
