package org.example;

public class User {
    private String username;
    private String currency;
    private Account account;

    public User(String username, Currency currency, double initialBalance) {
        this.username = username;
        this.currency = currency;
        this.account = new Account(initialBalance);
    }
    public Account getAccount(){
        return account;
    }
}
