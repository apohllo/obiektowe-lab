# Laboratorium 2

Celem laboratorium jest wprowadzenie do modelu obiektowego Javy.


## Zadania do wykonania

1. Pliki projektu należy umieszczać w pakiecie `agh.cs.lab2`.
2. Utwórz klasę `CarSystem` z metodą `main`.
3. Utwórz typ wyliczeniowy `MoveDirection` z czterema kierunkami: `Forward, Backward, Right, Left`.
4. Utwórz typ wyliczeniowy `MapDirection` z czterema kierunkami: `North, South, West, East`.
5. Utwórz klasę `Position`, która:
   * posiada dwa publiczne pola `x` i `y` typu `int, które nie moga być modyfikowane,
   * posiada konstruktor akceptujący parametry `x` i `y`, która są przypisywane do pól `x` i `y`,
   * posiada metodę `toString`, która zamienia pozycję na napis `(x,y)`, np. dla `x = 1` oraz `y = 2`, napis ma postac
     `(1,2)`,
   * posiada metodę `smaller`, akceptującą inny obiekt tej klasy i zwracającą wartość `true`, jeśli oba pola mają
     wartość mniejszą bądź równą polom drugiego obiektu,
   * posiada metodę `larger`, akceptującą inny obiekt tej klasy i zwracającą wartość `true`, jeśli oba pola mają
     wartość większą bądź równą polom drugiego obiektu,
   * posiada metodę `add`, która zwraca nowy obiekt klasy `Position`, którego składowe są sumą odpowiednich składowych
     dodawanych pozycji.
6. W metodzie `main` wprowadź następujący kod:
```java
Position position1 = new Position(1,2);
System.out.println(position1);
Position position2 = new Position(-2,1);
System.out.println(position2);
System.out.println(position1.add(position2));
```
7. Sprawdź czy uzyskane wyniki są poprawne.
8. Utwórz klasę `Car`, która:
   * określa początkowe położenie samochodu na mapie jako `Position(2,2)`,
   * określa początkową orientacje samochodu jako `North`,
   * definiuje metodę `toString()`, która w reprezentacji łańcuchowej zawiera informacje o położeniu samochodu (pozycję
     oraz orientację),
   * definuje swoje pola jako prywatne.
9. W metodzie `main` utwórz samochów i wyświetl w konsoli jego pozycję.
10. Dodaj do klasy `Car` metodę `move(MoveDirection direction), która:
   * Dla kierunków `Right` i `Left` zmienia orientację samochodu na mapie, np. kiedy samochód jest w pozycji `North` a
     zmiana kierunku to `Right` to orientacja samochodu powinna wynosić `East`.
   * Dla kierunków `Forward` i `Backward` zmienia pozycję samochodu uwzględniając jego orientację, np. kiedy samochód
     jest na pozycji `(2,2)` i jego orientacja to `North`, to po ruchu `Forward` jego pozycja to `(2,3)`.
   * Uniemożliwia wyjechanie poza mapę, która ustalona jest od pozycji `(0,0)` do pozycji `(4,4)` (pięć na pięć pól). W
     sytuacji, w której samochód miałby wyjechać poza mapę, wywołanie `move` nie ma żadnego skutku.
11. W metodzie `main` dodaj wywołania, które przetestują poprawność implementacji, np. po ciągu wywołań: `Right, Forward,
   Forward, Forward` pozycja samochodu powinna wynosić `(4,2)` a orientacja `East`.
12. Utwórz klasę `OptionsParser` a w niej metodę `parse`, która:
   * akceptuje tablicę łańcuchów znaków,
   * zwraca tablicę kierunków ruchu `MoveDirection`,
   * zamienia łańcuchy `f` oraz `forward` na kierunek `MoveDirection.Forward`, `b` oraz `backward` na kierunek
     `MoveDirection.Backward`,
   * dla nieznanych kierunków nie umieszcza ich w tablicy wynikowej.
13. Zmodyfikuj metodę `main` tak aby korzystając z klasy `OptionsParser` umożliwiała sterowanie samochodem.
14. Przetestuj zachowanie samochodu dla różnych danych wejściowych.

## Przydatne informacje

* Pola w obiekcie deklarowane są w ciele klasy, np. 
```java
class Position {
  public int x;
  public int y;
}
```
* Konstruktor jest specjalną metodą w każdej klasie. Nazywa się tak samo jak klasa i nie zwraca wartości. Konstruktor 
pozwala ustalić początkową wartość pól obiektu jeśli mają być przekazane przez użytkownika, np.
```java
class Position {
  public Position(int x, int y){
    this.x = x;
    this.y = y;
  }
}
```
* Obiekty klasy tworzy się za pomocą wywołania `new`, np. 
```java
Position position1 = new Position(1,2);
```
* Początkowe wartości obiektu można określić w konstruktorze albo bezpośrednio przypisując je do pól, np.
```java
class Car {
  private Position position = new Position(2,2);
}
```
