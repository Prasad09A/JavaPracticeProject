package CoreJava.MultiThreading;

class MyThread5 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
        }
    }
}

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException{
        MyThread5 t= new MyThread5();
        t.start();
        t.join();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }

    }
}
