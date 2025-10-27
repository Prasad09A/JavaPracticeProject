package CoreJava.MultiThreading;

class MyThreadDemo extends Thread{
    public void start(){
        System.out.println("Child start method");
    }
    public void run(){
        System.out.println("Child run method");
    }
}

public class OverridingOfStartMethod {
    public static void main(String[] args) {
        MyThreadDemo t= new MyThreadDemo();
        t.start();
        System.out.println("main method");
    }
}
