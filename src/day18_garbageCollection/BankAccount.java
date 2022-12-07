package day18_garbageCollection;

public class BankAccount {

    public String accountHolderName;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public void checkBalance(){
        System.out.println("Your available balance is: $"+ balance);

    }


    public void deposit(double amount){
        if( amount <1){
            System.out.println("Insufficient deposit amount "+amount);
            return;
        }
        System.out.println("Depositing $"+amount+" to "+accountHolderName);
        balance += amount;

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient deposit amount " + amount);
            return;
        }

            System.out.println("Withdrawing $" + amount + " from " + accountHolderName);
            balance -= amount;
        }

    }



