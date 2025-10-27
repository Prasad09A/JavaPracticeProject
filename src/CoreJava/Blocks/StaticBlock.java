package CoreJava.Blocks;

class ExampleP{
    static{
        System.out.println("Static block executes!");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        ExampleP obj= new ExampleP();
        System.out.println("main block executes");

    }
}
