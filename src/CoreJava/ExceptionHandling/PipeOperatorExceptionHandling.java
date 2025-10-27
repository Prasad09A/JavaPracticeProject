package CoreJava.ExceptionHandling;

public class PipeOperatorExceptionHandling {
    public static void main(String[] args) {
        try{
            int result= 10/1;
            int[] arr= new int[5];
            arr[10]=11;
            String str= null;
            System.out.println(str.length());
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println(e);
        }
    }
}
