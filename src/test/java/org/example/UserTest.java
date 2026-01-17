package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void shouldCreateUserWithAccount() {

        User user = new User("Adam", Currency.PLN, 100.0);

        assertNotNull(user.getAccount(), "Użytkownik powinien mieć przypisane konto");
        assertEquals(100.0, user.getAccount().getBalance(), "Konto powinno mieć saldo początkowe 100");
    }
}