public class BankAccount {
    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;
    static int accountCounter = 1;

    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String name, double initialBalance) {
        accountNumber = "ACC" + String.format("%03d", accountCounter++);
        accountHolderName = name;
        balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for " + name + " with initial balance: $" + initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance for " + accountHolderName);
        } else {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}
