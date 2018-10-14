# Laboratorium 3

Celem laboratorium jest wykorzystanie modelu obiektowego Javy do rozwiązania prostego zadania.


## Zadania do wykonania

1. Wykorzystaj definicje klas `Position`, `MapDirection` oraz `MoveDirection` z laboratorium 2.
8. Utwórz klasę `Car`, która:
   * określa początkową orientacje samochodu jako `NORTH`,
   * określa początkowe położenie samochodu na mapie jako `Position(2,2)` (przyjmij, że samochód znajduje się w
     pierwszej ćwiartce układu współrzędnych, a północ jest tożsama z kierunkiem wyznaczanym przez rosnące wartości na
     osi OY),
   * definiuje metodę `toString()`, która w reprezentacji łańcuchowej zawiera informacje o położeniu samochodu (pozycję
     oraz orientację),
   * definuje swoje pola jako prywatne.
9. W metodzie `main` utwórz samochów i wyświetl w konsoli jego pozycję.
10. Dodaj do klasy `Car` metodę `move(MoveDirection direction)`, która:
   * Dla kierunków `RIGHT` i `LEFT` zmienia orientację samochodu na mapie, np. kiedy samochód jest w pozycji `NORTH` a
     zmiana kierunku to `RIGHT` to orientacja samochodu powinna wynosić `EAST`.
   * Dla kierunków `FORWARD` i `BACKWARD` zmienia pozycję samochodu uwzględniając jego orientację, np. kiedy samochód
     jest na pozycji `(2,2)` i jego orientacja to `NORTH`, to po ruchu `FORWARD` jego pozycja to `(2,3)`.
   * **Uniemożliwia** wyjechanie poza mapę, która ustalona jest od pozycji `(0,0)` do pozycji `(4,4)` (pięć na pięć pól). W
     sytuacji, w której samochód miałby wyjechać poza mapę, wywołanie `move` nie ma żadnego skutku.
11. W metodzie `main` dodaj wywołania, które przetestują poprawność implementacji, np. po ciągu wywołań: `RIGHT, FORWARD,
   FORWARD, FORWARD` pozycja samochodu powinna wynosić `(4,2)` a orientacja `EAST`.
12. Utwórz klasę `OptionsParser` a w niej metodę `parse`, która:
   * akceptuje tablicę łańcuchów znaków,
   * zwraca tablicę kierunków ruchu `MoveDirection`,
   * zamienia łańcuchy `f` oraz `forward` na kierunek `MoveDirection.FORWARD`, `b` oraz `backward` na kierunek
     `MoveDirection.BACKWARD`,
   * dla nieznanych kierunków nie umieszcza ich w tablicy wynikowej.
13. Zmodyfikuj metodę `main` tak aby korzystając z klasy `OptionsParser` umożliwiała sterowanie samochodem.
14. Przetestuj zachowanie samochodu dla różnych danych wejściowych.
15. Napisz testy integracyjne weryfiujące poprawność implementacji. Uwzględnij przede wszystkim czy
    samochód ma właściwą orientację, czy przemieszcza się na właściwe pozycje oraz czy nie wyjeżdża poza mapę. Testy
    integracyjne powinny uwzględniać wszystkie stworzone klasy (również klasę `OptionsParser`).

## Przydatne informacje

* Początkowe wartości obiektu można określić albo w konstruktorze, albo bezpośrednio przypisując je do pól, np.
```java
class Car {
  private Position position = new Position(2,2);
}
```
