package CoreJava.CustomImmutableClass;
import java.util.Date;

final class Employee{
    private final String name;
    private final int age;
    private final Date dateOfJoining;

    Employee(String name, int age, Date dateOfJoining){
        this.name= name;
        this.age= age;
        this.dateOfJoining= new Date(dateOfJoining.getTime());
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Date getDateOfJoining(){
        return new Date(dateOfJoining.getTime());
    }
    public String toString(){
        return name+age+dateOfJoining;
    }
}

public class CustomImmutableClass {
    public static void main(String[] args) {
        Date date= new Date();
        Employee emp= new Employee("prasad ",25,date);

        System.out.println(emp);

        date.setTime(267276);
        System.out.println("After updating through setter method "+emp);

        emp.getDateOfJoining().setTime(57577);
        System.out.println("After updating through getter method "+emp);
    }
}
