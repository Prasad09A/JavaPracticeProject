package CoreJava.MultiThreading;

class MyDemoNew extends Thread{
    public void run(){
        System.out.println("Run method");
    }
}

public class GettingSettingNameOfThreads {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyDemoNew t= new MyDemoNew();
        System.out.println(t.getName());
        Thread.currentThread().setName("abc");
        System.out.println(Thread.currentThread().getName());

    }
}
