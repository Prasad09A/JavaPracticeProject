package CoreJava.Static;

class test{
    static{
        System.out.println("Static method executed!");
    }
}

public class StaticBlock {
    public static void main(String[] args){
        test obj= new test();// If we dont create object of test then class never get load into memory
        // and static will not get executed
        System.out.println("Main method Executed!");

    }
}
