public class Bank {
    public int AccountNumber;
    public int balance;

    public Bank(int AccountNumber){
        this.AccountNumber = AccountNumber;
        this.balance = 1000000;
    }

    public String deposit(int amount){
        this.balance += amount;
        return this.AccountNumber + " has had a deposit! It now has " + this.balance + "amount!";
    }

    public String withdraw(int amountLoss){
        this.balance -= amountLoss;
        return this.AccountNumber + " has had a withdrawal! It now has " + this.balance + "amount!";
    }
}
