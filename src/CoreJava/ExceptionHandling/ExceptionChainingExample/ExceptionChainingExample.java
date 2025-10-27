package CoreJava.ExceptionHandling.ExceptionChainingExample;

class InsufficientFundException extends Exception{
    public InsufficientFundException(String name, Throwable cause){
        super(name,cause);
    }
}

public class ExceptionChainingExample {
    public static void CheckBalance(int withdraw, int balance) throws InsufficientFundException{
        try{
            if(withdraw>balance){
                throw new ArithmeticException("You are trying to withdraw "+withdraw+
                        " RS and amount you have in your account is "+balance+" RS");
            }else{
                System.out.println("Withdrawal successful and you remaining balance post withdrawal is "+
                        (balance-withdraw));
            }
        }catch(ArithmeticException e){
            throw new InsufficientFundException("Error while withdrawing money ",e);
        }
    }

    public static void main(String[] args) {
        try{
            CheckBalance(1000,500);
        }catch(InsufficientFundException e){
            System.out.println("High-level error: "+e.getMessage());
            System.out.println("Root cause: "+e.getCause().getMessage());
        }
    }
}
