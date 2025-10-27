package CoreJava.ExceptionHandling.CustomUnCheckedException;

class AgeTooSmallException extends RuntimeException{
    public AgeTooSmallException(String name){
        super(name);
    }
}

public class CustomUncheckException {
    public static void ValidateAge(int age){
        if(age<18){
            throw new AgeTooSmallException("You are not eligible to vote!");
        }else{
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        try{
            ValidateAge(16);
        }catch(AgeTooSmallException e){
            System.out.println("Custom Unchecked Exception Caught: "+e);
        }
    }
}
