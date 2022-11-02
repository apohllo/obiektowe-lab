# Laboratorium 4

Celem laboratorium jest zapoznanie się z mechanizmem interfejsów oraz kolekcjami.

Najważniejsze zadania:

1. Modyfikacja klasy `Animal` (akceptowanie mapy w konstruktorze).
2. Stworzenie klasy `RectangularMap`.
3. Stworzenie klasy `SimulationEngine`.
4. Testy integracyjne.

## Przydatne informacje

* Mechanizm interfejsów pozwala na określenie pewnego zestawu metod, które muszą być implementowane przez określony typ.
  Interfejs `IWorldMap` jest tego przykładem - określa on sposób interakcji mapy z zwierzętami oraz klasą
  `MapVisualizer`.
* Interfejs jedynie określa, że dana klasa ma posiadać określoną metodę - dlatego w interfejsie nie ma implementacji - wszystkie metody są
  z założenia abstrakcyjne (można pominąć modyfikator `abstract`).
* Od Javy 8 interfejsy mogą posiadać metody statyczne (takie same jak metody statyczne w klasach) oraz metody domyślne
  (oznaczane modyfikatorem `default`), które posiadają implementację.
* W interfejsie wszystkie metody są z założenia publiczne, dlatego nie ma potrzeby dodania kwalifikatora dostępu
  `public`.
* Od Javy 9 interfejs może posiadać także metody prywatne.
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
* W Javie występują typy parametryzowane i typ `List` jest tego przykładem. Taki typ jest podobny do szablonów w C++.
  Wymaga on podania innego typu (lub typów) jako parametru (parametr musi być typem obiektowym):
```java
List<Animal> animals = new ArrayList<>();
```
W tym przykładzie tworzona jest lista zwierząt, a jako implementacja wybrana została klasa `ArrayList`. Dzięki temu
wywołania takie jak:
```java
animals.get(1);
```
zwracają obiekty klasy `Animal`, dzięki czemu mogą one być używane w "bezpieczny" sposób - tzn. kompilator może sprawdzić
czy wywoływane metody faktycznie występują w klasie `Animal`.

## Zadania do wykonania

1. Wykorzystaj definicje klas z poprzedniego laboratorium.
2. Przyjrzyj się interfejsom `IWorldMap` oraz `IEngine`, które znajdują się w tym katalogu.
3. Zmodyfikuj klasę `Animal` z poprzedniego ćwiczenia:
   * zdefiniuj konstruktor `Animal(IWorldMap map)`; wykorzystaj argument `map` tak, aby w metodzie `move` można było odwołać
     się do mapy i zweryfikować, czy zwierzę może przesunąć się na daną pozycję,
   * zdefiniuj konstruktor `Animal(IWorldMap map, Vector2d initialPosition)`, który dodatkowo określa początkowe położenie zwierzęcia na
     mapie,
   * zastanów się nad dotychczasowym konstruktorem bezparametrowym, czy nadal ma on sens? W jaki sposób uprościć wszystkie konstruktory?
   * zmodyfikuj metodę `toString` tak by zwracała jedynie schematyczną orientację zwierzęcia w postaci łańcucha
     składającego się z jednego znaku, Np. jeśli zwierzę ma orientację północną, to metoda `toString()` powinna zwracać
     łańcuch "N" albo "^".
   * zmodyfikuj metodę `move`, tak by korzystała z wywołania `canMoveTo` interfejsu `IWorldMap`.
4. Zdefiniuj klasę `RectangularMap`, która:
   * definiuje prostokątną mapę,
   * implementuje interfejs `IWorldMap`
   * w konstruktorze akceptuje dwa parametry `width` oraz `height` wskazujące szerokość oraz wysokość mapy (możesz założyć
     że otrzymane wartości są poprawne),
   * umożliwia poruszanie się w obrębie zdefiniowanego prostokąta (jak w laboratorium 3),
   * umożliwia występowanie więcej niż jednego zwierzęcia na mapie,
   * uniemożliwia występowanie więcej niż jednego zwierzęcia na tej samej pozycji,
   * posiada metodę `toString` rysującą aktualną konfigurację mapy (wykorzystaj klasę `MapVisualizer`, która znajduje się
     w tym katalogu).
5. Zdefiniuj klasę `SimulationEngine` implementującą interfejs `IEngine`, która:
   * w konstruktorze akceptuje tablicę ruchów (`MoveDirection`), instancję mapy (`IWorldMap`) oraz tablicę wektorów
     oznaczających początkowe pozycje zwierząt,
   * dodaje zwierzęta do mapy (początkowa orientacja zwierząt to `NORTH`),
   * w metodzie `run` na przemian steruje ruchem wszystkich zwierząt. Przykładowo, jeśli użytkownik wprowadzi ciąg: `f
     b r l` a na mapie są dwa zwierzęta, to pierwsze zwierzę otrzyma ruchy `f` i `r`, a drugie `b` i `l`. Ruchy obu
     zwierząt mają być wykonywane na przemian, tzn. po każdym ruchu pierwszego zwierzęcia następuje ruch drugiego
     zwierzęcia.
6. Wykonaj następujący kod w metodzie `main` klasy `World`:
```java
MoveDirection[] directions = new OptionsParser().parse(args);
IWorldMap map = new RectangularMap(10, 5);
Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
IEngine engine = new SimulationEngine(directions, map, positions);
engine.run();
```
Sprawdź, czy zwierzęta poruszają się poprawnie dla ciągu: `f b r l f f r r f f f f f f f f`.

7. Dodaj testy integracyjne weryfikujące, że implementacja jest poprawna. Wykorzystaj dane z punktu 6. w celu
   ustalenia przebiegu testu.
8. (**Dla zaawansowanych**) Stwórz tekstowy widget biblioteki Swing (lub innej wybranej biblioteki), który będzie
   wyświetlał animację poruszających się zwierzaków.
11. Otaguj gotowe rozwiązanie jako lab4.
