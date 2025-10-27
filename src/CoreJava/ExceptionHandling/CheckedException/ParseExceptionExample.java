package CoreJava.ExceptionHandling.CheckedException;
import java.text.*;

public class ParseExceptionExample {
    public static void main(String[] args) {
        try{
            new SimpleDateFormat("MM/DD/YYYY").parse("2025-05-12");
        }catch(ParseException e){
            System.out.println(e);
        }

    }
}
