package CoreJava.ExceptionHandling.UnCheckedException;

public class UnCheckedExceptionUsingTryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        }catch(ArithmeticException e){
            System.out.println("Exception Caught: "+e);
        }
    }
}
