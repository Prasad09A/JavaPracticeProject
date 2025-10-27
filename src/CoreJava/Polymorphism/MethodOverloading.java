package CoreJava.Polymorphism;

public class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double x, double y, double z) {
        return x + y + z;
    }
    long add(long p, long r){
        return p+r;
    }

    public static void main(String[] args) {
    MethodOverloading obj= new MethodOverloading();
    System.out.println(obj.add(10,20));
    System.out.println(obj.add(10,20,30));
    System.out.println(obj.add(233455554,34543,644477));
    System.out.println(obj.add(576445267,635773686));
    }
}
