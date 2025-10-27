package CoreJava.ExceptionHandling.CheckedException;

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.text"));
            String line = br.readLine();
            System.out.println(line);
            br.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}