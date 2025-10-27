package CoreJava.ExceptionHandling.CheckedException;

public class  ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("CoreJava.ExceptionHandling.CheckedException.ClassNotFoundExceptionExamplee");
            System.out.println("Class Loaded Successfully");
        }catch(ClassNotFoundException e){
            System.out.println("Exception Caught: "+e);
        }

    }
}
