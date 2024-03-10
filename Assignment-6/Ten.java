abstract class Accounts {
    protected double balance;
    protected int accountNumber;
    protected String accountHolderName;
    protected String address;

    abstract void withdrawal();
    abstract void deposit();
    
    void display() {
        System.out.println("Balance of account number " + accountNumber + ": " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    void calculateAmount() {
        double totalAmount = balance * (1 + rateOfInterest / 100);
        System.out.println("Total amount in the savings account: " + totalAmount);
    }

    @Override
    void withdrawal() {
        System.out.println("Withdrawal from savings account.");
    }

    @Override
    void deposit() {
        System.out.println("Deposit into savings account.");
    }
}

public class Ten {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.balance = 1000;
        savingsAccount.accountNumber = 123456;
        savingsAccount.accountHolderName = "John Doe";
        savingsAccount.address = "123 Main St, City";
        savingsAccount.rateOfInterest = 5.0;

        savingsAccount.display();
        savingsAccount.calculateAmount();
        savingsAccount.deposit();
        savingsAccount.withdrawal();
    }
}


/*
Balance of account number 123456: 1000.0
Total amount in the savings account: 1050.0
Deposit into savings account.
Withdrawal from savings account. 
 */