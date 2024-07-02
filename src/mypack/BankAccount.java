package mypack;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialbalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialbalance;
    }


public void deposit (double amount) throws InvalidAccountException{
  if (amount < 0) {
      throw new InvalidAccountException("Deposit Amoount must be positive");

  }
    balance += amount;
  System.out.println("Deposited: " + amount) ;

}

public void withdraw (double amount) throws InsufficientFundsException , InvalidAccountException {
    if (amount < 0) {
        throw new InvalidAccountException("Withdrawal amonut must be positive");
    }
    if (amount > balance) {
        throw new InsufficientFundsException("Insufficient Funds for withdrawal");
    }

    balance -= amount;
    System.out.println("Withdrawn: " + amount) ;
}

public double getBalance(){
    return balance;
}

public String getAccountNumber() {
    return accountNumber ;
}

public String getAccountHolderName() {
    return accountHolderName ;
}

}