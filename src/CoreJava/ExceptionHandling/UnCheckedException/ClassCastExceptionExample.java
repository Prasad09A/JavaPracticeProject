package CoreJava.ExceptionHandling.UnCheckedException;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj= "prasad";

        try{
            Integer num= (Integer) obj;
            System.out.println(num);
        }catch(ClassCastException e){
            System.out.println(e);
        }
    }
}
//🔎 What happens?
//obj is a String at runtime.
//You try to cast it to an Integer.
//JVM checks and sees "Java" is not an Integer, so it throws ClassCastException.
//Output will be something like: