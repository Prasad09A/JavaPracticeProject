package CoreJava.MultiThreading;

class MyThread8 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
    System.out.println(Thread.currentThread().isDaemon());
    MyThread8 t=  new MyThread8();
    t.setDaemon(true);
    t.start();
        System.out.println("end of Main Thread");

    }
}

//🔹 First, two types of threads in Java
//User Thread (normal thread)
//Example: main thread, or any thread you create without calling setDaemon(true).
//JVM will wait until all user threads are finished before shutting down.
//Daemon Thread (background helper thread)
//Example: garbage collector thread in JVM.
//JVM will NOT wait for daemon threads.
//If all user threads are finished → JVM shuts down immediately, even if daemon threads are still running.
