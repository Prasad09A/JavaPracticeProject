package CoreJava.Static;

public class StaticAllMethods {
    static void test(){   //Static method with no return and no parameters
        System.out.println("test method of static");
    }

    static void square(int a){//2)Static method with no return and parameters.
        System.out.println("Square: "+(a*a));
    }

    static int getTen(){     //3) Static method with return and no parameter
        return 10;
    }

    static int add(int a, int b){  //4) Static method with return type with parameters
        return a+b;
    }

    public static void main(String[] args) {
        StaticAllMethods.test();  //1)Static method with no return and no parameters

        StaticAllMethods.square(6); //2)Static method with no return and parameters.

        System.out.println(getTen()); //3) Static method with return and no parameter.

        System.out.println(add(10,20)); //4) Static method with return type with parameters
    }
}
