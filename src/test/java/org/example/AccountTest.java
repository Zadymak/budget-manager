package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {

        account = new Account(1000.0);
    }

    @Test
    void shouldIncreaseBalanceOnIncome() {

        Income income = new Income(500.0, LocalDate.now(), null, "Salary");

        account.addTransaction(income);

        assertEquals(1500.0, account.getBalance(), "Saldo powinno wzrosnąć o 500");
    }

    @Test
    void shouldDecreaseBalanceOnExpense() {

        Expense expense = new Expense(200.0, LocalDate.now(), null, "Grocery");

        account.addTransaction(expense);

        assertEquals(800.0, account.getBalance(), "Saldo powinno zmaleć o 200");
    }

    @Test
    void shouldGenerateReportWithCorrectBalance() {

        String report = account.generateReport();

        assertTrue(report.contains("Account balance is 1000.0"));
    }
}