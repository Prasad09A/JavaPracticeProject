package CoreJava.ExceptionHandling.CheckedException;
import java.io.*;

public class IOExceptionUsingTryCatch {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new FileReader("abc.txt"));
            String line= br.readLine();
            System.out.println(line);
            br.close();
        }catch(IOException e){
            System.out.println("Exception has been caught: "+e);
        }
    }
}
