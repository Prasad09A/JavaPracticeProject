package CoreJava.Encapsulation;

class Employee{
    private String name;
    private int age;

    Employee(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee emp= new Employee("prasad",25);

        System.out.println("Updated values after setting and getting name");
        emp.setName("java");
        System.out.println(emp.getName());

        emp.setAge(25);
        System.out.println(emp.getAge());
    }
}
