package CoreJava.ExceptionHandling;

public class RuntimeStackMechanism {
    public static void main(String[] args) {
        dostuff();
    }
    public static void dostuff(){
        domorestuff();
    }
    public static void domorestuff(){
        System.out.println("Hello World!");
    }
}
