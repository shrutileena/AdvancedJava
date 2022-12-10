package Programs.com.example.Lambda;

import java.util.function.Consumer;

public class LambdaInference {
    
    public static void main(String[] args) {
        
        // Identify the FI

        // Standard Syntax
        Consumer<String> c1 = msg -> System.out.println(msg.length());

        // Compile time error - not enough info
        // Object x1 = msg -> System.out.println(msg.length());

        // Compile time error - not enough info
        // Object x2 = (String msg) -> System.out.println(msg.length());

        // OK - cast added
        Object x3 = (Consumer<String>) ((String msg) -> System.out.println(msg.length()));



        // Identify parameter types
        // OK - but inferred parameter type is **Object**
        Consumer<?> c2 = msg -> System.out.println(msg);

        // Compile time error - Inference is not based on body of lambda
        // Consumer<?> c3 = msg -> System.out.println(msg.length());

        // OK - added manifest type to parameter
        Consumer<?> c4 = (String msg) -> System.out.println(msg.length());
        
    }
}
