package Programs.com.example.Employee;

public class Employee {
    
    String name;
    int age;
    double salary;
    String location;

    Employee(String name, int age, double salary, String location) {

        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary() {
        this.salary = this.salary * 0.12;
    }

    void getSalary() {
        System.out.println(this.salary);
    }
}
