package CoreJava.SuperAndThisKeyword;

class BothParentClass{
    BothParentClass(){
        this(10,30);
        System.out.println("No-args constructor of parent class");
    }
    BothParentClass(int a, String b, int c){
        this();
        System.out.println("3-args constructor of parent class");
    }
    BothParentClass(int a, int b){
        System.out.println("2 args constructor of parent class");
    }
}
class BothChildClass extends BothParentClass{
    BothChildClass(int a, String name){
        super(10,"java",30);
        System.out.println("no args constructor of child class");
    }
}

public class SuperAndThis {
    public static void main(String[] args) {
        BothChildClass obj= new BothChildClass(10,"prasad");
    }
}
