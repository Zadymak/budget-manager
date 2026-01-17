package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class TransactionTypeTest {

    @Test
    void incomeShouldReturnPositiveAmount() {
        Income income = new Income(100.0, LocalDate.now(), null, "Bonus");
        assertEquals(100.0, income.getSignedAmount());
    }

    @Test
    void expenseShouldReturnNegativeAmount() {
        Expense expense = new Expense(100.0, LocalDate.now(), null, "Tax");
        assertEquals(-100.0, expense.getSignedAmount());
    }
}