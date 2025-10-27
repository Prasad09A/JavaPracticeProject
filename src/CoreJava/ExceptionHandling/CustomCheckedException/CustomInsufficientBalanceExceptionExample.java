package CoreJava.ExceptionHandling.CustomCheckedException;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String name){
        super(name);
    }
}

public class CustomInsufficientBalanceExceptionExample {
    public static void CheckBalance(int withdraw, int amount) throws InsufficientBalanceException{
        if(withdraw>amount){
            throw new InsufficientBalanceException("You are trying to withdraw: "+withdraw+
                    "RS and your account balance is: "+amount+"RS So you cannot withdraw");
        }else{
            System.out.println("You can with draw balance easily");
        }
    }
    public static void main(String[] args) {
        try{
            CheckBalance(1000,500);
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

    }
}
