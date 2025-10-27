package CoreJava.Abstraction;

interface A{
    void show();
}
interface B{
    void test();
}

class InterfaceWay implements B{
  public void test(){
      System.out.println("test method of interface B");
  }
  public void show(){
      System.out.println("show method of interface A");
  }
}

public class InterfaceExample {
    public static void main(String[] args) {
        InterfaceWay obj= new InterfaceWay();
        obj.test();
        obj.show();
    }
}
