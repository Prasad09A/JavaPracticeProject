package JAVA_8.RealWorldProgramsJAVA8;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    int id;
    int age;
    String name;
    String department;
    double salary;
    int yearOfJoining;
    String gender;

    Employee(int id, int age, String name, String department, double salary, int yearOfJoining, String gender){
        this.id= id;
        this.age=age;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.yearOfJoining=yearOfJoining;
        this.gender=gender;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
    public int getYearOfJoining(){
        return yearOfJoining;
    }
    public String getGender(){
        return gender;
    }
    public String toString(){
        return "Id: "+id+" ,Age: "+age+" ,name: "+name+" ,department: "+department+" ,salary: "+salary+" ,yearofJoining: "
                +yearOfJoining+" ,gender: "+gender;
    }
}

public class RealWorldEmployeeProgram {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<Employee>();

        employeeList.add(new Employee(101,20,"Prasad","FullStack Development",28192,2025,"male"));
        employeeList.add(new Employee(102,40,"Akash","UI Development",70583,2021,"male"));
        employeeList.add(new Employee(103,23,"Radha","Backend Development",130284,2015,"female"));
        employeeList.add(new Employee(104,21,"Krishna","FullStack Development",110677,2017,"male"));
        employeeList.add(new Employee(105,32,"Vikas","Frontend Development",87999,2019,"male"));
        employeeList.add(new Employee(106,37,"Namrata","Frontend Development",140034,2012,"female"));
        employeeList.add(new Employee(107,27,"Sonali","Devops Development",45678,2023,"female"));
        employeeList.add(new Employee(108,20,"Pratik","Devops Development",81342,2018,"male"));
        employeeList.add(new Employee(109,19,"Sonali","UI Development",98657,2014,"female"));
        employeeList.add(new Employee(110,24,"Gaurav","Backend Development",77612,2020,"male"));
        employeeList.add(new Employee(111,29,"Aditya","Frontend Development",67290,2022,"male"));

        Map<String, Long> Total= employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));

        System.out.println("Total male and Female Employees in the organization are: "+Total);
        System.out.println("================================================================");

        employeeList.stream().map(e->e.getDepartment()).distinct().forEach(d->System.out.println("Name of all departments are below: "+d));
        System.out.println("================================================================");

        Map<String,Double> resultnew= employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingInt(d->d.getAge())));
        System.out.println("Avergae age of male and female employees are: "+resultnew);
        System.out.println("================================================================");

        Optional<Employee> output= employeeList.stream().max((a,b)->Double.compare(a.getSalary(),b.getSalary()));
        System.out.println("Highest Paid employee present in the organization is: "+output.get());

        System.out.println("=================================================================");
        System.out.println("Employee who joined organization after 2015 are below: ");
        employeeList.stream().filter(e->e.getYearOfJoining()>2015).forEach(d->System.out.println(d.getName()));
        System.out.println("=================================================================");
        System.out.println("number of employees in each department: ");
        Map<String,List<Employee>> value=employeeList.stream().collect(Collectors.groupingBy(e->e.getDepartment()));
        value.forEach((department, names)->{
           System.out.println(department+": ");
           names.forEach(d->System.out.println(d.getName()));
        });

        System.out.println("=================================================================");
        Map<String,Double> check= employeeList.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.averagingDouble(d->d.getSalary())));
        System.out.println("Average Salalry for each department is: "+check);

        System.out.println("==================================================================");
        Optional<Employee> sample= employeeList.stream().
                filter(e->e.getDepartment().equals("Devops Development")).
                filter(e->e.getGender().equals("male")).
                min((a,b)->Integer.compare(a.getAge(),b.getAge()));
        System.out.println("Youngest male employee in Devops Development is: "+sample.get());

        System.out.println("==============================================================");
        Optional<Employee> sample2= employeeList.stream().min((a,b)->Integer.compare(a.getYearOfJoining(),b.getYearOfJoining()));
        System.out.println("Most working experiance in organization has: "+sample2.get());

        System.out.println("==================================================================");
        Map<String,Long> upper= employeeList.stream().filter(e->e.getDepartment().equals("Devops Development")).collect(Collectors.groupingBy(d->d.getGender(),Collectors.counting()));
        System.out.println("Total male and females present in devops team are: "+upper);

        System.out.println("=====================================================================");
        Map<String,Double> lower= employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingDouble(d->d.getSalary())));
        System.out.println("Average Salalry of male and female employee is: "+lower);

        System.out.println("=====================================================================");
        DoubleSummaryStatistics stats= employeeList.stream().collect(Collectors.summarizingDouble(e->e.getSalary()));
        System.out.println("Total salary is: "+stats.getSum());
        System.out.println("Average salaly is: "+stats.getAverage());
    }

}
