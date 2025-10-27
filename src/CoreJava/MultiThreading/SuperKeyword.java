package CoreJava.MultiThreading;

class ThreadDemo extends Thread {
    public void start() {
        super.start();
        System.out.println("Child method start method");
    }

    public void run() {
        System.out.println("Child method run method");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();

    }
}
