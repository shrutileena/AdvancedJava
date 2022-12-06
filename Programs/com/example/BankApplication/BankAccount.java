package Programs.com.example.BankApplication;

public class BankAccount {
    
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        if(startingBalance < 0) {
            System.out.println("Invalid Starting Balance. Please put minimum Balance of 500 rupees.");
        }
        this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdrawAmount(double amount) {
        if(amount > 0 && amount <= this.balance){
            this.balance = this.balance - amount;
        }
    }

    public void depositAmount(double amount) {
        if(amount > 0){
            this.balance = this.balance + amount;
        }
    }

}
