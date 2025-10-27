package CoreJava.MultiThreading;

class MyThread7 extends Thread{
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
            Thread.sleep(2000);
        }}catch(InterruptedException e){
            System.out.println("Thread Interrupted ");
        }
    }}


public class InterruptMethod {
    public static void main(String[] args) {
        MyThread7 t= new MyThread7();
        t.start();
        t.interrupt();
        System.out.println("End of main Thread");
    }
}
