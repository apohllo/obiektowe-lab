# Laboratorium 4

Celem laboratorium jest zapoznanie się z mechanizmem interfejsów oraz kolekcjami.

## Zadania do wykonania

1. Wykorzystaj definicje klas z poprzedniego laboratorium.
2. Przyjrzyj się interfejsowi `IWorldMap`, który znajduje się w tym katalogu.
3. Zmodyfikuje klasę `Car` z poprzedniego ćwiczenia:
   * zdefiniuj konstruktor `Car(IWorldMap map)`, który wiąże samochód z mapą,
   * zdefiniuj konstruktor `Car(IWorldMap map, int x, int y)`, który dodatkowo określa początkowe położenie samochodu na
     mapie,
   * dodaj metodę `Position getPosition()`, która zwraca pozycję samochodu,
   * zmodyfikuj metodę `toString` tak by zwracała jedynie schematyczną orientacje samochodu w postaci łańcucha
     składającego się z jednego znaku,
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
   * w metodzie `run` na przemian steruje ruchem wszystkich samochodów.
4. Wykonaj następujący kod w metodzie `main` klasy `CarSystem`:
```java
MoveDirection[] directions = new OptionsParser().parse(args);
IWorldMap map = new RectangularMap(10, 5);
map.add(new Car(map));
map.add(new Car(map,3,4));
map.run(directions);
```
Sprawdź czy samochody poruszają się poprawnie dla ciągu: 'f b r l f f r r f f f f f f f f'.

## Przydatne informacje

TBC
