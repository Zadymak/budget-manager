package org.example;

import java.time.LocalDateTime;
import java.util.Locale;

public class Expense extends Transaction {
    public Expense(double amount, LocalDateTime date, Locale.Category category, String description) {
        super(amount, date, category, description);
    }
    @Override
    public double getSignedAmount() {
        return -getAmount();
    }
}
