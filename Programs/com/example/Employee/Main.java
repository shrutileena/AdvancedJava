package Programs.com.example.Employee;

public class Main {
    
    public static void main(String[] args) {
        
        Employee empOne = new Employee("Shruti Agarwal", 23, 370000, "Pune");

        empOne.raiseSalary();
        empOne.getSalary();
        System.out.println(empOne.location);
    }
}
