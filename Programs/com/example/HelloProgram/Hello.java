package Programs.com.example.HelloProgram;

import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("What is your Name ?");
        try (Scanner input = new Scanner(System.in)) {
            String name = input.next();

            System.out.println("Hello "+ name);
        }
    }
}
