package org.example;
import jdk.jfr.Category;

import java.time.LocalDate;

public abstract class Transaction {
    private static int nextId = 1;

    private int id;
    private double amount;
    private LocalDate date;
    private Category category;
    private String description;

    protected Transaction(double amount, LocalDate date, Category category, String description){
        this.id = nextId++;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    public abstract double getSignedAmount();

    public double getAmount(){
        return amount;
    }
}
