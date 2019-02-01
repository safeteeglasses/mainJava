package com.techelevator;

public class BankAccount {

	private String accountHolderName;
    private String accountNumber;
    private DollarAmount balance;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = new DollarAmount(0);
    }

    public BankAccount(String accountHolder, String accountNumber, DollarAmount balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
	public String getAccountHolderName() {
        return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber()  {
        return accountNumber;          
    }

    public DollarAmount getBalance() {            
        return balance;            
    }

    // Update the balance by using the DollarAmount.Plus method
    public DollarAmount deposit(DollarAmount amountToDeposit) {
        balance = balance.plus(amountToDeposit);
        return balance;
    }

    // Update the balance by using the DollarAmount.Minus method
    public DollarAmount withdraw(DollarAmount amountToWithdraw) {
        balance = balance.minus(amountToWithdraw);
        return balance;
    }

    public DollarAmount TransferTo(BankAccount destination, DollarAmount amountToTransfer) {
        this.withdraw(amountToTransfer);
        destination.deposit(amountToTransfer);
        return balance;
    }

}
