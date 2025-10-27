package CoreJava.ExceptionHandling.UnCheckedException;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str="abc";
        try{
            int num= Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("Exception caught: "+e);
        }
    }
}
