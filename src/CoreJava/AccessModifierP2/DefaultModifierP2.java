package CoreJava.AccessModifierP2;


import CoreJava.AccessModifierP1.DefaultModifierP1;

public class DefaultModifierP2 extends DefaultModifierP1 {
    public static void main(String[] args){
        DefaultModifierP2 obj= new DefaultModifierP2();
        //obj.test(); Cannot be accessed from outside package
    }
}
class NonSubclass1{
    public static void main(String[] args) {
        DefaultModifierP2 obj2=new DefaultModifierP2();
        //obj2.test(); Cannot acccess it from outside package
    }
}
