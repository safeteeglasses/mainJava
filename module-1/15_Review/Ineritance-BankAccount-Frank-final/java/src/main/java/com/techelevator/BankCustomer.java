package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
    private String name;
    private String address;
    private String phone;
    private List<BankAccount> accounts = new ArrayList<BankAccount>();

    public String getName() {
        return name;
    }

    public void getName(String name) {
    	this.name = name;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BankAccount[] getAccounts() {
    	BankAccount[] accountArray = new BankAccount[accounts.size()];
    	for (int i = 0; i < accounts.size(); i++) {
    		accountArray[i] = accounts.get(i);
    	}
        return accountArray;
    }

    public boolean isVip() {
        DollarAmount totalBalance = new DollarAmount(0);
        for (BankAccount account : accounts) {
            totalBalance = totalBalance.plus(account.getBalance());
        }
        return totalBalance.getDollars() >= 25000;
    }

    public void addAccount(BankAccount newAccount) {
        accounts.add(newAccount);
    }

}
