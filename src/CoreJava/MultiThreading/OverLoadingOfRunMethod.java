package CoreJava.MultiThreading;

class MyThread1 extends Thread{
    public void run(){
        System.out.println("no-args run method");
    }
    public void run(int a){
        System.out.println("Args run method");
    }
}

public class OverLoadingOfRunMethod {
    public static void main(String[] args) {
        MyThread1 t= new MyThread1();
        t.start();
    }
}

//Overloading of run method is possible but thread class start method is always calls
//no args run method.
//If you want to call the remaining overloaded run method then you have to call it explicitly
//Just like normal method call.
