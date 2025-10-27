package CoreJava.MultiThreading;

class MyDemo2 extends Thread{
    int total=0;
    public void run(){
        synchronized(this){
            System.out.println("Child Thread starts calculation");
            for(int i=0;i<10;i++){
                total= total +i;
            }
            System.out.println("Child Thread trying to give notification");
            this.notify();
        }
    }
}

public class WaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        MyDemo2 t= new MyDemo2();
        t.start();
        synchronized(t){
            System.out.println("Main method calling wait  method");
            t.wait();
            System.out.println("Child Thread gets notification: "+ t.total);
        }
    }
}
