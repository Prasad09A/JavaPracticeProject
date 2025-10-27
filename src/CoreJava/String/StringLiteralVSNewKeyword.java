package CoreJava.String;

public class StringLiteralVSNewKeyword {
    public static void main(String[] args) {
        String s1="java"; //SCP
        String s2=new String("java"); //heap area

        boolean result= s1.equals(s2); //checks content
        System.out.println("Using equals method: "+result);

        boolean result1= (s1==s2);  //checks memory address
        System.out.println("Using new method: "+result1);
    }
}
