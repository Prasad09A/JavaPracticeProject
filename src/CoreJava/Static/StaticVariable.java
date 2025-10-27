package CoreJava.Static;

class Student{
    String name;
    static String College;
}

public class StaticVariable {
    public static void main(String[] args) {
    Student.College="IIT";
    Student s1= new Student();
    s1.name="prasad";
    System.out.println("Name of 1st student is: "+s1.name+" And College name is: "+Student.College);

    Student s2= new Student();
    s2.name="akash";
    System.out.println("Name of 2nd student is: "+s2.name+" And College name is "+Student.College);
    }
}
