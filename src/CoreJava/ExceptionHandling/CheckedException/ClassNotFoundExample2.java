package CoreJava.ExceptionHandling.CheckedException;

import static java.lang.Class.forName;

public class ClassNotFoundExample2 {
    public static void main(String[] args) {
        try {
            Class.forName("CoreJava.ExceptionHandling.CheckedException.ClassNotFoundExample2");
            System.out.println("System loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    }
