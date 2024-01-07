package JavaTheory.Sliit.JavaOOP.Encapsulation;

// Encapsulation is the bundling of data (attributes) and methods that operate on the data into a single unit (class).
// It helps in hiding the internal details of the object and allows controlled access through methods (getters and setters).

// Real-world analogy: Consider a bank account. Encapsulation ensures that the balance is private and can only be accessed or modified through controlled methods like deposit and withdrawal.


public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

