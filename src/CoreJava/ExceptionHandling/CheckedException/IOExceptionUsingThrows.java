package CoreJava.ExceptionHandling.CheckedException;

import java.io.*;

public class IOExceptionUsingThrows {
    public static void readFile() throws IOException{
        BufferedReader br= new BufferedReader(new FileReader("abc.txt"));
        String line=br.readLine();
        System.out.println(line);
        br.close();
    }
    public static void main(String[] args) {
        try{
            readFile();
        }catch(IOException e){
            System.out.println("Exception caught using throws  "+e);
        }
    }
}
