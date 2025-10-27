package CoreJava.Static;

class Employee{
    static int value;
    static{
        System.out.println("Static block executed");
        value=16;
    }
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Main block executed");
        System.out.println(Employee.value);
    }
}
//Static Initialization block is used to initialize static variable in static block.
