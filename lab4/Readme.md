# Laboratorium 4

Celem laboratorium jest zapoznanie się z mechanizmem interfejsów oraz kolekcjami.

## Zadania do wykonania

1. Wykorzystaj definicje klas z poprzedniego laboratorium.
2. Przyjrzyj się interfejsowi `IWorldMap`, który znajduje się w tym katalogu.
3. Zmodyfikuje klasę `Car` z poprzedniego ćwiczenia:
   * zdefiniuj konstruktor `Car(IWorldMap map)`; wykorzystaj argument `map` tak aby w metodzie `move` można było odwołać
     się do mapy i zweryfikować, czy samochód może przesunąć się na daną pozycję,
   * zdefiniuj konstruktor `Car(IWorldMap map, int x, int y)`, który dodatkowo określa początkowe położenie samochodu na
     mapie,
   * dodaj metodę `Position getPosition()`, która zwraca pozycję samochodu,
   * zmodyfikuj metodę `toString` tak by zwracała jedynie schematyczną orientacje samochodu w postaci łańcucha
     składającego się z jednego znaku, Np. jeśli samochód ma orientację północną to metoda `toString()` powinna zwracać
     łańcuch "N".
   * zmodyfikuj metodę `move`, tak by korzystała z wywołania `canMoveTo` interfejsu `IWorldMap`.
3. Zdefiniuj klasę `RectangularMap`, która:
   * definiuje prostokątną mapę,
   * implementuje interfejs `IWorldMap`
   * w konstruktorze akceptuje dwa parametry `width` oraz `height` wskazujące szerokość oraz wysokość mapy (zignoruj
     sytuację, w której użytkownik klasy poda niepoprawne wartości),
   * umożliwia poruszanie się w obrębie zdefiniowanego prostokąta (jak w laboratorium 3),
   * umożliwia występowanie więcej niż jednego samochodu na mapie,
   * posiada metodę `toString` rysującą aktualną konfigurację mapy (wykorzystaj klasę `MapVisualizer` która znajduje się
     w tym katalogu),
   * w metodzie `run` na przemian steruje ruchem wszystkich samochodów. Przykładowo, jeśli użytkownik wprowadzi ciąg: `f
     b r l` a na mapie są dwa samochody, to pierwszy samochód otrzyma ruchy `f` i `r`, a drugi `b` i `l`. Ruchy obu
     samochodów mają być wykonywane na przemian, tzn. po każdym ruchu pierwszego samochodu następuje ruch drugiego
     samochodu.
4. Wykonaj następujący kod w metodzie `main` klasy `CarSystem`:
```java
MoveDirection[] directions = new OptionsParser().parse(args);
IWorldMap map = new RectangularMap(10, 5);
map.add(new Car(map));
map.add(new Car(map,3,4));
map.run(directions);
```
Sprawdź czy samochody poruszają się poprawnie dla ciągu: `f b r l f f r r f f f f f f f f`.

## Przydatne informacje

* Mechanizm interfejsów pozwala na określenie pewnego zestawu metod, które muszą być implementowane przez określony typ.
  Interfejs `IWorldMap` jest tego przykładem - określa on sposób interakcji mapy z samochodami oraz klasą
  `MapVisualizer`.
* W interfejsie wszystkie metody są z definicji publiczne, dlatego nie ma potrzeby dodania kwalifikatora dostępu
  `public`.
* Interfejs jedynie określa, że dana klasa ma posiadać określoną metodę - dlatego w interfejsie nie ma implementacji.
* Nazwa interfejsu najczęściej zaczyna się od wielkiej litery `I`.
* Klasa deklaruje fakt implementacji interfejsu za pomocą słowa kluczowego `implements`, np. 
```java
class RectangularMap implements IWorldMap {
}
```
* W Javie istnieją dwie podstawowe struktury sekwencyjne (poza tablicami): [LinkedList](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html) 
  oraz [ArrayList](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html). W
  przeciwieństwie do tablic obie klasy pozwalają na określenie początkowego rozmiaru na 0 i dowolne rozszerzanie
  kolekcji. 
* Obie klasy implementują interfejs `List`, który definiuje podstawowe operacje na listach.
* Klasy te różnią się implementację - `LinkedList` oparta jest o listę dwukierunkową, przez co operacje dodawania i
  usuwania elementów są szybkie, ale swobodny dostęp za pomocą operatora `get` jest wolniejszy. `ArrayList` oparta jest
  o tablicę, dlatego dostęp jest szybki, ale dodawanie i usuwanie elementów jest wolniejsze.
* W Javie występują typu parametryzowane i typ `List` jest tego przykładem. Taki typ jest podobny do szablonów w C++.
  Wymaga on podania innego typu (lub typów) jako parametru:
```java
List<Car> cars = new ArrayList<>();
```
W tym przykładzie tworzona jest lista samochodów, a jako implementacja wybrana została klasa `ArrayList`. Dzięki temu
wywołania takie jak:
```java
cars.get(1);
```
zwracają obiekty klasy `Car`, dzięki czemu mogą one być używane w "bezpieczny" sposób - tzn. kompilator może sprawdzić
czy wywoływane metody faktycznie występują w klasie `Car`.
