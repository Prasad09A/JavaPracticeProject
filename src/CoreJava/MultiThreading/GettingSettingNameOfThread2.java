package CoreJava.MultiThreading;

class MyThreadParent extends Thread{
    public void run(){
        System.out.println("Run method");
    }
}

public class GettingSettingNameOfThread2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThreadParent t= new MyThreadParent();
        System.out.println(t.getName());
        t.start();
        Thread.currentThread().setName("Abc");
        System.out.println(Thread.currentThread().getName());
    }
}
