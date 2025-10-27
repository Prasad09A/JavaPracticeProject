package CoreJava.MultiThreading;

class MyThread2 extends Thread{

}

public class OverridingOfRunMethod {
    public static void main(String[] args) {
    MyThread2 t= new MyThread2();
    t.start();
    }
}

//If run method is not override then thread class run() method is called and it has
//empty implementation so we won't get any output