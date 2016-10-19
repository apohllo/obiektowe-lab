# Laboratorium 2

Celem laboratorium jest zapoznanie się z modelem obiektowym Javy.


## Zadania do wykonania

### Klasa `Position`

1. Pliki projektu należy umieszczać w pakiecie `agh.cs.lab2`.
2. Utwórz klasę `CarSystem` z metodą `main`.
3. Utwórz klasę `Position`, która:
   * posiada dwa publiczne pola `x` i `y` typu `int`, które nie moga być modyfikowane,
   * posiada konstruktor akceptujący parametry `x` i `y`, która są przypisywane do pól `x` i `y`,
   * posiada metodę `toString`, która zamienia pozycję na napis `(x,y)`, np. dla `x = 1` oraz `y = 2`, napis ma postać
     `(1,2)`,
   * posiada metodę `smaller`, akceptującą inny obiekt tej klasy i zwracającą wartość `true`, jeśli oba pola mają
     wartość mniejszą bądź równą polom drugiego obiektu,
   * posiada metodę `larger`, akceptującą inny obiekt tej klasy i zwracającą wartość `true`, jeśli oba pola mają
     wartość większą bądź równą polom drugiego obiektu,
   * posiada metodę `add`, która zwraca nowy obiekt klasy `Position`, którego składowe są sumą odpowiednich składowych
     dodawanych pozycji.
4. W metodzie `main` wprowadź następujący kod:
```java
Position position1 = new Position(1,2);
System.out.println(position1);
Position position2 = new Position(-2,1);
System.out.println(position2);
System.out.println(position1.add(position2));
```
Sprawdź czy uzyskane wyniki są poprawne.

### Pozostałe klasy

6. Utwórz typ wyliczeniowy `MoveDirection` z czterema kierunkami: `Forward, Backward, Right, Left`.
7. Utwórz typ wyliczeniowy `MapDirection` z czterema kierunkami: `North, South, West, East`, który:
   * posiada metodę `toString`, która dla kierunku `East` zwraca łańcuch `Wschód`, dla `West` - `Zachód`, itd.
   * posiada metodę `next`, która dla kierunku `East` zwraca `South` (kolejny kierunek zgodnie z ruchem wskazówek
     zegara), itd.
   * posiada metodę `previous`, która dla kierunku `East` zwraca `North` (kolejny kierunek zgodnie z ruchem przeciwnym
     do ruchu wskazówek zegara), itd.
7. Sprawdź w metodzie `main` czy metody te działają zgodnie z opisem.

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
* Słowo kluczowe this odnosi się do obiekt, na rzecz którego wywołano metodę.
Przykładowo w języku C moglibyśmy zdefiniować metodę `createPoint`:

```C
struct Point {
  int x;
  int y;
}

Point * createPoint(int x, int y){
  Point * result = malloc(sizeof(struct Point));
  result->x = x;
  result->y = y;
  return result;
}

Point * p1 = createPoint(1,2);
```

Ten kod jest analogiczny do konstruktora, z ta różnicą, że w konstruktorze nie tworzymy obiektu explicite, tylko mamy do
niego dostęp za pomocą słowa kluczowego `this`.


* Definicję typu wyliczeniowego można rozszerzać dodając do niego metody. Wymaga to umieszczenia średnika po ostatniej
  wartości typu, np.:
```java
enum MapDirection {
  North,
  South,
  East,
  West;

  public String toString(){
    switch(this) {
      case North: return "Północ";
      case South: return "Południe";
      //...
    }
  }
}
```
