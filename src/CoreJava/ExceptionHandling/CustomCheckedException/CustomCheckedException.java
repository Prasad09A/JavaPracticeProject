package CoreJava.ExceptionHandling.CustomCheckedException;
import java.io.*;

class AgeInvalidException extends Exception{
    public AgeInvalidException(String name){
        super(name);
    }
}
public class CustomCheckedException {
    public static void ValidateAge(int age) throws AgeInvalidException{
        if(age<18){
            throw new AgeInvalidException("Invalid AGE: Age must be 18 years to vote!");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args) {
        try{
            ValidateAge(16);
        }catch(AgeInvalidException e){
            System.out.println("Custom Checked Exception caught: "+e.getMessage());
        }
    }
}
