package com.company.abstraction;

public class CheckingAccount {
    private String id;
    private long balance;
    private String accountHolderName;
    private String pin;

    public CheckingAccount(String id, long balance, String accountHolderName, String pin) {
        this.id = id;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
    }

    private void setBalance(int amt) {
        balance += amt;
    }

    public String getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long withdraw(int amt, String code) {
        if (code.equals(pin)) {
            setBalance(Math.abs(amt) * - 1);
        }

        return balance;
    }
}
