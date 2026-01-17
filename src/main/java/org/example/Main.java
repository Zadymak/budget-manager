package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- System Zarządzania Finansami ---");

        // 1. Tworzymy użytkownika i jego konto
        User user = new User("Jan Kowalski", Currency.PLN, 1000.0);
        Account account = user.getAccount();

        System.out.println("Początkowe saldo: " + account.getBalance() + " PLN");

        // 2. Dodajemy przychód (np. Pensja)
        Income salary = new Income(3500.0, LocalDate.now(), null, "Wynagrodzenie");
        account.addTransaction(salary);
        System.out.println("Dodano przychód: +3500.0 PLN");

        // 3. Dodajemy wydatek (np. Jedzenie)
        Expense food = new Expense(250.0, LocalDate.now(), null, "Zakupy spożywcze");
        account.addTransaction(food);
        System.out.println("Dodano wydatek: -250.0 PLN");

        // 4. Wyświetlamy końcowy raport
        System.out.println("\n--- RAPORT KOŃCOWY ---");
        System.out.println(account.generateReport());
    }