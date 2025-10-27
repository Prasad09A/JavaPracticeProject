package CoreJava.MultiThreading;

class MyDemoTest extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run method");
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(7);
        MyDemoTest t = new MyDemoTest();
        t.start();
        t.setPriority(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++) {
            System.out.println("Main method");
        }
    }
}