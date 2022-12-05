package Programs.com.example.Calculator;

public class Calculator {
    
    static int firstNumber;
    static int secondNumber;

    public void addition(int firstNumber, int secondNumber) {

        System.out.println(firstNumber + secondNumber);
    }

    public void subtract(int firstNumber, int secondNumber) {

        System.out.println(firstNumber - secondNumber);
    }

    public void multiply (int firstNumber, int secondNumber) {

        System.out.println(firstNumber * secondNumber);
    }

    public double divide (int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        
        Calculator calculatorOne = new Calculator();

        calculatorOne.addition(2, 3);
        calculatorOne.subtract(5, 6);
        calculatorOne.multiply(4, 5);
        System.out.println(calculatorOne.divide(4, 2));
    }
}
