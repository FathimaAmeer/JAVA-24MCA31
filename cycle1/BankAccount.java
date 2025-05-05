public class BankAccount { 
    private String accountNumber;
    private String accountHolder;
    private double balance;

    
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    
    public void displayAccountInfo() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.00); 
        
        account.displayAccountInfo();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
        account.displayAccountInfo();
    }
}