package CoreJava.ExceptionHandling.UnCheckedException;

public class UncheckedExceptionUsingThrows {
    public static void divide(int a, int b) throws ArithmeticException {
        //It is not mandatory to use throws ArithmeticExceptionLine here as compiler
        //won't force you to handle it so,
        //In Unchecked Exception throws is used for documentary purpose only.
        int result = 10 / 0;
        System.out.println(result);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught using Throws: " + e);
        }

    }
}
