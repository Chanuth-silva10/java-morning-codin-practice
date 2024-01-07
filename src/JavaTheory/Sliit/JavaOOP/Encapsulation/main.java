package JavaTheory.Sliit.JavaOOP.Encapsulation;

public class main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(1000);
        double currentBalance = myAccount.getBalance();
    }
}
