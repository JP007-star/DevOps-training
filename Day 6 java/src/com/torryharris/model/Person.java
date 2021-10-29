package com.torryharris.model;

import com.torryharris.exception.InsufficientBalanceException;
import com.torryharris.exception.WithdrawLimitExceedException;

public class Person {
    private  String name;
    private int accountNumber;
    private int balance;
    private int amountWithdrawn;
    private final int DAILY_WITHDRAWN_LIMIT=4000;

    public Person(String name, int accountNumber, int balance, int amountWithdrawn) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amountWithdrawn = amountWithdrawn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmountWithdrawn() {
        return amountWithdrawn;
    }

    public void setAmountWithdrawn(int amountWithdrawn) {
        this.amountWithdrawn = amountWithdrawn;
    }

    public int getDAILY_WITHDRAWN_LIMIT() {
        return DAILY_WITHDRAWN_LIMIT;
    }
    public void withdrawalAmount(int amount) throws WithdrawLimitExceedException, InsufficientBalanceException {
        if(amount>balance){
           throw new InsufficientBalanceException("Insufficient Balance ,Your Balance is"+balance);
        }
        if (amountWithdrawn+amount>DAILY_WITHDRAWN_LIMIT){
            throw new WithdrawLimitExceedException("Withdrawal limit exceed:\n" +
                    "Total Amount of Withdraw today is:"+amountWithdrawn);
        }
        balance-=amount;
        amountWithdrawn+=amount;
        System.out.println("Amount withdrawal of Rs."+amount+" is success");
        System.out.println("Your account balance is:"+balance);
        System.out.println("Amount Withdrawn today is:"+amountWithdrawn);
    }
}
