package org.example;
import java.util.ArrayList;
import java.util.List;

public class Account  implements IReportable {
    private double balance;
    private List<Transaction> transactions;

    public Account(double balance){
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t){
        transactions.add(t);
        balance += t.getSignedAmount();
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Account balance is " + balance + "\n");

        for (Transaction t : transactions){
            report.append(t).append("\n");
        }
        return report.toString();
    }
}
