package CoreJava.Inheritance;

class Animal3{
    void walk(){
        System.out.println("Animals are walking");
    }
}
class Dog3 extends Animal3{
    void bark(){
        System.out.println("Dogs are barking");
    }
}
class Cat3 extends Animal3{
    void meow(){
        System.out.println("Cats are meowing");
    }
}
class babyDog extends Dog3{
    void SmallBark(){
        System.out.println("Baby dog is barking");
    }
}

public class HybridInheritance {
    public static void main(String[] args){
        babyDog obj= new babyDog();
        obj.SmallBark();
        obj.bark();

        Cat3 obj2 = new Cat3();
        obj2.meow();
        obj2.walk();
    }
}
