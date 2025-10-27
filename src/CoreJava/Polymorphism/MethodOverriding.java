package CoreJava.Polymorphism;

class Parent{
    int add(int a, int b){
        return a+b;
    }
}
class ChildOne extends Parent{
    int add(int a, int b){
        return a+b;
    }
}
class ChildTwo extends Parent{
    int add(int a , int b){
        return a+b;
    }
}
class ChildThree extends Parent{
    int add(int a, int b){
        return a+b+100+200;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        ChildThree obj= new ChildThree();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20));

        ChildTwo obj2= new ChildTwo();
        System.out.println(obj2.add(30,40));
        System.out.println(obj2.add(30,40));

        ChildOne obj3= new ChildOne();
        System.out.println(obj3.add(50,60));
        System.out.println(obj3.add(50,60));

    }
}
