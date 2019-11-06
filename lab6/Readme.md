# Laboratorium 6

Celem laboratorium jest zapoznanie się z mechanizmem wyjątków oraz interfejsem `Map`.

## Przydatne informacje

* Wyjątki są mechanizmem pozwalającym przekazywać informację o błędzie pomiędzy odległymi fragmentami kodu.
* Zgłoszenie błędu odbywa się poprze *rzucenie wyjątku*. W Javie służy do tego słowo kluczowe `throw`:

```java
throw new IllegalArgumentException("ABC argument is invalid")
```
* Nieobsłużony wyjątek powoduje przerwanie działania aplikacji.
* Obsługa wyjątków odbywa się za pomocą mechanizmu *przechwytywania wyjątków*. W Javie służy do tego konstrukcja
  `try...catch`:

```java
try {
  // kod który może rzucić wyjątek
} catch(IllegalArgumentException ex) {
  // kod obsługi wyjątku
}
```
Wyjątek może być rzucony na dowolnym poziomie w kodzie, który otoczony jest blokiem `try`. Tzn. w kodzie tym może być
wiele zagnieżdżonych wywołań funkcji, a i tak blok `try` przechwyci taki wyjątek, pod warunkim, że nie zostanie on obsłużony
na niższym poziomie.

* Interfejs `Map` definiuje w Javie strukturę słownikową, czyli mapę odwzorowującą *klucze* na *wartości*.
* Jedną z najczęściej wykorzystywanych implementacji interfejsu `Map` jest klasa `HashMap`, przykładowo:

```java
Map<Position,Car> cars = new HashMap<>();
```

* Poprawne działanie `HashMap` uzależnione jest od implementacji metod `equals` oraz `hashCode` w klasie, która stanowi
  klucze mapy (w ćwiczeniu dotyczy to klasy `Position`).

* Wynik działania metody `hashCode` musi być zgodny z wynikiem działania metody `equals`, tzn. jeśli dwa obiekty są
  równe według `equals` to ich `hashCode` musi być równy.

* Przykładowa implementacja metody `hashCode` dla klasy `Position` może wyglądać następująco:

```java
@Override
public int hashCode() {
  int hash = 13;
  hash += this.x * 31;
  hash += this.y * 17;
  return hash;
}
```

Istotą kodu nie są konkretne wartości, przez które mnożone są składniki `x` i `y` ale fakt, że dla identycznych wartości
`x` i `y` wartość funkcji `hashCode` będzie identyczna.

## Zadania do wykonania

### Obsługa wyjątków

1. Wykorzystaj klasy z laboratorium 5.
2. W metodzie odpowiedzialnej za zamianę argumentów aplikacji na ruchy samochodu rzuć wyjątek `IllegalArgumentException`,
  jeśli którykolwiek z parametrów nie należy do listy poprawnych parametrów (`f`, `forward`, `b`, `backward`, etc.).
  Jako przyczynę wyjątku wprowadź łańcuch znaków informujący, że określony parametr jest niepoprawny, np.
  `new IllegalArgumentException(argument + " is not legal move specification")`.
3. W metodach odpowiedzialnych za dodawanie elementów do mapy zweryfikuj, czy dane pole nie jest już zajmowane.
  Jeśli pole jest już zajęte, rzuć wyjątek `IllegalArgumentException`, podając jako przyczynę łańcuch znaków zawierający
  informację o tym, które pole jest już zajęte.
4. Obsłuż oba wyjątki w metodzie `main` klasy `CarSystem`. Obsługa powinna polegać na wyświetleniu komunikatu wyjątku
   oraz zakończeniu działania programu, a konstrukcja `try` powinna obejmować cały kod znajdujący się w metodzie `main`.
4. Przetestuj działanie wyjątków poprzez podanie nieprawidłowego parametru ruchu oraz dodanie do mapy dwa razy tego
   samego samochodu. Efektem powinno być kontrolowane zakończenie działania programu.

### Zmiana sposobu przechowywania obiektów na mapie

1. Implementacja metod `isOccupied` oraz `objectAt` w mapach nie jest wydajna, ponieważ za każdym razem wymaga przejścia
   przez wszystkie elementy znajdujące się na mapie. Można ją poprawić zamieniając listę na słownik (wykorzystując 
   interfejs `Map` oraz implementację `LinkedHashMap`) albo dodając obok listy samochodów osobne pole będące mapą (w tym
   wypadku wystarczy klasa `HashMap`).
   Kluczami słownika powinny być pozycje elementów, a wartościami konkretne obiekty.
6. Poprawna implementacja słownika wymaga, aby klasa `Position` implementowała metodę `hashCode`. Metoda ta jest
   wykorzystywana m.in. przez słownik oparty o tablicę haszującą (`HashMap`). Możesz wygenerować kod metody `hashCode` w
   klasie `Position` korzystając ze
   wsparcia środowiska programistycznego. Zasadniczo metoda ta musi być zgodna z działaniem metody `equals` - dwa
   obiekty, które są równe według metody `equals` muszą mieć identyczną wartość zwracaną przez metodę `hashCode`.
7. Zmodyfikuj metodę `run` w klasach obsługujących mapę, tak by po każdym ruchu samochodu sprawdzać, czy jego pozycja
   się zmieniła i w razie zmiany aktualizować słownik: pozycja - obiekt na mapie.
8. Zmiana implementacji kolekcji `cars` będzie wymagała zmiany implementacji metod `isOccupied`, `objectAt` oraz `run`.
   W tej ostatniej metodzie możesz wykorzystać wywołanie `values()` z klasy `Map`, które zwróci kolekcję obiektów
   (samochodów) na mapie. Niestety zwrócona kolekcja nie jest listą. Zastanów się jak rozwiązać ten problem.
9. Przetestuj działanie nowej implementacji korzystając z kodu z laboratorium nr 5.


