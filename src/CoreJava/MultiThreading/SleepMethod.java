package CoreJava.MultiThreading;

class MyThread6 extends Thread{
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
            Thread.sleep(2000);
        }}catch(InterruptedException e){
            System.out.println("Exception caused: ");
        }
    }
}

public class SleepMethod {
    public static void main(String[] args) {
        MyThread6 t= new MyThread6();
        t.start();
    }
}
