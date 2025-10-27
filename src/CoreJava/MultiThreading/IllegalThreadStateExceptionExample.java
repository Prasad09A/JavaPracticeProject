package CoreJava.MultiThreading;

class MyDemo extends Thread{
    public void run(){
        System.out.println("Run method");
    }
}

public class IllegalThreadStateExceptionExample {
    public static void main(String[] args) {
        MyDemo t= new MyDemo();
        t.start();
        t.start();
    }
}
//When a thread is running using t.start() method and you executes another t.start() method
//Then it will be throw a runtime Exception saying IllegalThreadStateException
