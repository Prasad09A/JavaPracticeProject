package CoreJava.ExceptionHandling.TryCatchFinally;
import java.io.*;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        BufferedReader br= null;
        try {
            br = new BufferedReader(new FileReader("abc.txt"));
            String line = br.readLine();
            System.out.println(line);
        }catch(IOException e){
            System.out.println("Exception has been caught: "+ e);
        }finally{
            try{
                if(br!=null){
                    br.close();
                }
            }catch(IOException e){
                System.out.println("Exception caught in finally block: "+e);
            }
        }
    }
}
