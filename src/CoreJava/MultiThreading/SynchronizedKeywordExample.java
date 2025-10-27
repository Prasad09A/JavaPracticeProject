package CoreJava.MultiThreading;

class Table{
    synchronized void Value(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class MyThread101 extends Thread{
    Table t;
    MyThread101(Table t){
        this.t=t;
    }
    public void run(){
        t.Value(5);
    }
}
class MyThread102 extends Thread{
    Table t;
    MyThread102(Table t){
        this.t=t;
    }
    public void run(){
        t.Value(100);
    }
}

public class SynchronizedKeywordExample {
    public static void main(String[] args) {
    Table obj= new Table();
    MyThread101 t1= new MyThread101(obj);
    MyThread102 t2= new MyThread102(obj);

    t1.start();
    t2.start();
    }
}
