# budget-manager
Projekt na zajęcia z programowania obiektowego

## Wymagania funkcjonalne
- Korzystanie z aplikacji przez jednego użytkownika. 
- Ustawienie podstawowych danych użytkownika (nazwa użytkownika, waluta, saldo początkowe).
- Dodawanie przychodu.
- Dodawanie wydatku.
- Każda transakcja zawiera: kwotę, datę, kategorię oraz opis (opcjonalne).
- Wybór kategorii transakcji z predefiniowanej listy (np. jedzenie, paliwo, inne).
- Aplikacja oblicza aktualne saldo na podstawie wszystkich transakcji.
- Aplikacja aktualizuje saldo po każdej dodanej lub usuniętej transakcji.
- Możliwość wyświetlania podsumowania miesięcznego
  - Podsumowanie zawiera sumę przychodów, sumę wydatków oraz saldo i listę transakcji z wybranego miesiąca.

 ## Wymagania- JDK17+
- Maven3.8+ w `PATH`
- Git## Klonowanie```bashgit clone https://github.com/Zadymak/bugdet_app.gitcd bugdet_app```

## Budowanie```bashmvn clean package```

## Uruchomienie (dev)
```bashmvn spring-boot:run```

## Dostęp- Aplikacja: http://localhost:8080/
- Pierwsza wizyta przekierowuje na `/setup` (utworzenie konta: nazwa użytkownika, początkowe saldo, waluta bazowa).

## Generowanie JavaDoc (opcjonalnie)
```bashmvn javadoc:javadoc```

## Stos technologiczny- Java17, Spring Boot3.x- Maven, Thymeleaf, Spring Data JPA- H2 (uruchomieniowa)
 
