package CoreJava.ExceptionHandling.TryWithResource;
import java.io.*;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try(BufferedReader br= new BufferedReader(new FileReader("abc.txt"))){
            String line= br.readLine();
            System.out.println(line);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
