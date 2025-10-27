package CoreJava.Abstraction;

abstract class WayOfEating{
    abstract void eat();
}
class IndianWayOfEating extends WayOfEating{
    void eat(){
        System.out.println("Indian way of eating");
    }
}
class WesternWayOfEating extends WayOfEating{
    void eat(){
        System.out.println("Western way of eating");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        WesternWayOfEating obj= new WesternWayOfEating();
        obj.eat();

        IndianWayOfEating obj2= new IndianWayOfEating();
        obj2.eat();
    }
}
