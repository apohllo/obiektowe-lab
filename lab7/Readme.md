# Laboratorium 6

Celem laboratorium jest zapoznanie się z wzorcem projektowym `Observer`.

## Zadania do wykonania

1. Implementacja mechanizmu wymaga aktualizacji słownika mapy wymaga, aby mapa była informowana o zmianach pozycji samochodów.
  Dotychczasowa implementacja opiera się na modyfikacji metody `run`. Lepszym rozwiązaniem jest zastosowanie
   wzorca projektowego `Observer` - mapa ma zarejestrować się jako obserwator dla zmian pozycji samochodu.
2. Realizację implementacji rozpocznij od zdefiniowana interfejsu `IPositionChangeObserver`, który zawiera jedną metodę
  `positionChanged(Position old, Position new)`.
3. Obie mapy muszą implementować ten interfejs. Możesz to zrealizować, jeśli odpowiedni kod umieścisz w klasie
   `AbstractWorldMap`. Implementacja metody `positionChanged` powinna polegać na tym, że ze słownika usuwana jest para:
   stara pozycja - samochód, a dodawana jest para: nowa pozycja - samochód.
4. Klasa `Car` musi umożliwić rejestrowanie obserwatorów. Dodaj metody: `void addListener(IPositionChangeObserver
    observer)` oraz `void removeListener(IPositionChangeObserver observer)`, które będą dodawały i usuwały danego
    obserwatora do listy obserwatorów w klasie `Car`.
5. Klasa `Car` musi informować wszystkich obserwatorów, o tym że pozycja została zmieniona. Stwórz metodę
    `positionChanged` w klasie `Car`, która będzie notyfikowała wszystkich obserwatorów o zmianie.
6. Zweryfikuj poprawność implementacji korzystając z kodu z poprzednich laboratoriów.

## Przydatne informacje

* Wzorce projektowe są koncepcją występującą w programowaniu obiektowym polegającą na tym, że określona klasa problemów
  może być rozwiązana w schematyczny sposób. Rozwiązanie problemu jednak nie może być (najczęściej) zawarte w jednej
  klasie, dlatego wzorzec stanowi swego rodzaju szkielet rozwiązania, który określa jakie klasy i interfejsy muszą być
  wykorzystane, aby poprawnie rozwiązać dany problem.
* Przykładem wzorca jest obserwator (observer) - rozwiązuje on problem zmian wewnętrznego stanu obiektu.
  Więcej informacji na temat tego wzorca można znaleźć pod adresem https://en.wikipedia.org/wiki/Observer_pattern
