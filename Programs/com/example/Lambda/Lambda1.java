package Programs.com.example.Lambda;

import java.util.Comparator;
import java.util.function.Consumer;

public class Lambda1 {
    
    public static void main(String[] args) {
        
        // Without using Lambda expression
        Comparator<Employee> byName = new Comparator<Employee>() {

            @Override
            public int compare(Employee a, Employee b) {
                return a.getName().compareTo(b.getName());
            }
            
        };

        // Using Lambda Expression
        Comparator<Employee> byNameLambda1 = (Employee a, Employee b) -> {
            return a.getName().compareTo(b.getName());
        };

        // Removing parameter types
        Comparator<Employee> byNameLambda2 = (a, b) -> {
            return a.getName().compareTo(b.getName());
        };

        // Removing {} and return
        // You cannot just remove {} and keep return expression
        Comparator<Employee> byNameLambda3 = (a, b) -> a.getName().compareTo(b.getName());



        // Expression with no parameters
        Runnable r = () -> { System.out.println("A compact Runnable!"); };
        Thread t1 = new Thread(r);

        // No need to even mention Runnable
        Thread t2 = new Thread(() -> { System.out.println("An implicit Runnable!"); } );

        // No need of braces here
        Thread t3 = new Thread(() -> System.out.println("An implicit Runnable!!") );
        

        // Using one parameter
        // Using Consumer Interface
        Consumer<String> lengthPrinter = s -> System.out.println(s.length());
        
        System.out.println(byName.compare(new Employee("Shruti Agarwal", 120000), new Employee("Abhay Malhotra", 2392301)));
        System.out.println(byNameLambda1.compare(new Employee("Shruti Agarwal", 120000), new Employee("Shruti Agarwal", 2392301)));
        System.out.println(byNameLambda2.compare(new Employee("Shruti Agarwal", 120000), new Employee("Shruti Agarwal", 2392301)));
        System.out.println(byNameLambda3.compare(new Employee("Shruti Agarwal", 120000), new Employee("Shruti Agarwal", 2392301)));

        t1.start();
        t2.start();
        t3.start();

        lengthPrinter.accept("shruti");
    }

}
