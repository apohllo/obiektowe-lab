# Laboratorium 6

Celem laboratorium jest zapoznanie się z mechanizmem wyjątków, interfejsem `Map` oraz użycie wzorca projektowego `Observer`.

## Zadania do wykonania

1. Wykorzystaj klasy z laboratorium 5.
2. W metodzie odpowiedzialnej za zamianę argumentów aplikacji na ruchy samochodu rzuć wyjątek `IllegalArgumentException`,
  jeśli którykolwiek z parametrów nie należy do listy poprawnych parametrów (`f`, `forward`, `b`, `backward`, etc.).
  Jako przyczynę wyjątku wprowadź łańcuch znaków informujący, że określony parametr jest niepoprawny, np.
  `new IllegalArgumentException(argument + " is not legal move specification")`.
3. W metodach odpowiedzialnych za dodawanie elementów do mapy zweryfikuj, czy dane pole nie jest już zajmowane.
  Jeśli pole jest już zajęte, rzuć wyjątek `IllegalArgumentException`, podając jako przyczynę łańcuch znaków zawierający
  informację o tym, które pole jest już zajęte.
4. Obsłuż oba wyjątki w metodzie `main` klasy `CarSystem`. Obsługa powinna polegać na wyświetleniu komunikatu wyjątku
   oraz zakończeniu działania programu.
4. Przetestuj działanie wyjątków poprzez podanie nieprawidłowego parametru ruchu oraz dodanie do mapy dwa razy tego
   samego samochodu. Efektem powinno być kontrolowane zakończenie działania programu.
5. Implementacja metod `isOccupied` oraz `objectAt` w mapach nie jest wydajna, ponieważ za każdym razem wymaga przejścia
   przez wszystkie elementy znajdujące się na mapie. Można ją poprawić zamieniając listę na słownik (wykorzystując 
   interfejs `Map` oraz implementację `HashMap`).
   Kluczami słownika powinny być pozycje elementów, a wartościami konkretne obiekty.
6. Poprawna implementacja słownika wymaga, aby klasa `Position` implementowała metodę `hashCode`. Metoda ta jest
   wykorzystywana m.in. przez słownik oparty o tablicę haszującą (`HashMap`). Możesz wygenerować odpowiedni kod korzystając ze
   wsparcia środowiska programistycznego. Zasadniczo metoda ta musi być zgodna z działaniem metody `equals` - dwa
   obiekty, które są równe według metody `equals` muszą mieć identyczną wartość zwracaną przez metodę `hashCode`.
7. Poprawna implementacja nowego mechanizmu wymaga, aby mapa była informowana o zmianach pozycji samochodów.
  Właściwym sposobem na rozwiązanie tego zagadnienie nie jest modyfikacja metody `run`, ponieważ duplikowałaby ona część
  kodu, który znajduje się w metodzie `move` samochodu. Należy użyć wzorca projektowego `Observer` (w Javie tradycyjnie
  nazywany `Listener`) - mapa ma zarejestrować się jako obserwator dla ruchów samochodu.
8. Realizację implementacji rozpocznij od zdefiniowana interfejsu `IPositionChangeListener`, który zawiera jedną metodę
  `positionChanged(Position old, Position new)`.
9. Obie mapy muszą implementować ten interfejs. Możesz to zrealizować, jeśli odpowiedni kod umieścisz w klasie
   `AbstractWorldMap`. Implementacja metody `positionChanged` powinna polegać na tym, że ze słownika usuwana jest para:
   stara pozycja - samochód, a dodawana jest para: nowa pozycja - samochód.
10. Klasa `Car` musi umożliwić rejestrowanie obserwatorów. Dodaj metody: `void addListener(IPositionChangeListener
    listener)` oraz `void removeListener(IPositionChangeListener listener)`, które będą dodawały i usuwały danego
    obserwatora do listy obserwatorów w klasie `Car`.
11. Klasa `Car` musi informować wszystkich obserwatorów, o tym że pozycja została zmieniona. Stwórz metodę
    `positionChanged` w klasie `Car`, która będzie notyfikowała wszystkich obserwatorów o zmianie.
12. Zmiana implementacji kolekcji `cars` będzie wymagała zmiany implementacji metod `isOccupied` oraz `objectAt`.
12. Przetestuj działanie nowej implementacji korzystając z kodu z laboratorium nr 5.


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
Wyjątek może być rzucony na dowolnym poziomie w kodzie, który otoczony jest blokiem `try`.

* Interfejs `Map` definiuje w Javie strukturę słownikową, czyli mapę odwzorowującą *klucze* na *wartości*.
* Jedną z najczęściej wykorzystywanych implementacji interfejsu `Map` jest klasa `HashMap`, przykładowo:

```java
Map<Position,Car> cars = new HashMap<>();
```
Poprawność działania powyższego kodu uzależniona jest od poprawności implementacji metody `hashCode` w klasie-kluczu (w
tym wypadku `Position`).

* Wzorce projektowe są koncepcją występującą w programowaniu obiektowym polegającą na tym, że określona klasa problemów
  może być rozwiązana w schematyczny sposób. Rozwiązanie problemu jednak nie może być (najczęściej) zawarte w jednej
  klasie, dlatego wzorzec stanowi swego rodzaju szkielet rozwiązania, który określa jakie klasy i interfejsy muszą być
  wykorzystane, aby poprawnie rozwiązać dany problem.
* Przykładem wzorca jest obserwator (observer) - rozwiązuje on problem zmian wewnętrznego stanu obiektu.
  Więcej informacji na temat tego wzorca można znaleźć pod adresem https://en.wikipedia.org/wiki/Observer_pattern
