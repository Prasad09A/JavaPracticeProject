package CoreJava.ExceptionHandling;

public class StackOverflowErrorExample {
    public static void main(String[] args) {
        StackOverflowErrorExample obj= new StackOverflowErrorExample();
        obj.test1();
    }
    public void test1(){
        test2();
    }
    public void test2(){
        test1();
    }
}
