package Programs.com.example.BankApplication;

public class Main {
    
    public static void main(String[] args) {
        
        BankAccount ownerOne = new BankAccount("Shruti Agarwal", 2300000);
        BankAccount ownerTwo = new BankAccount("Abhay Malhotra", 400000);
        BankAccount ownerThree = new BankAccount("Isha Khanna", -500);
        ownerThree = new BankAccount("Isha Khanna", 1000);

        System.out.println(ownerOne.getBalance());
        System.out.println(ownerTwo.getBalance());
        System.out.println(ownerThree.getBalance());

        ownerOne.withdrawAmount(50000);

        System.out.println(ownerOne.getBalance());
        System.out.println(ownerTwo.getBalance());
    }
}
