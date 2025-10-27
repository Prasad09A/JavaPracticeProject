package CoreJava.Blocks;


public class InstanceBlock {
    {
        System.out.println("Instance Block 1");
    }
    {
        System.out.println("Instance block 2");
    }

    public static void main(String[] args) {
        InstanceBlock obj= new InstanceBlock();
        System.out.println("main block executes");

    }
}
