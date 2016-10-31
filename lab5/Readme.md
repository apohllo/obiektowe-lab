# Laboratorium 5

Celem laboratorium jest zapoznanie się z mechanizmem dziedziczenia oraz właściwym sposobem jego użycia w programowaniu
obiektowym.

## Zadania do wykonania

0. Wykorzystaj klasy z laboratorium nr 4.
1. Zdefiniuj klasę `HayStack` (stóg siana), która:
   * w konstruktorze akceptuje parametr `Position`, określający pozycję stogu siana,
   * posiada metodę publiczną `Position getPosition()`, która zwraca jego pozycję,
   * posiada metodę publiczną `String toString()`. która zwraca napis "s".
1. Zdefiniuj klasę `UnboundedMap`, która:
   * implementuje interfejs `IWorldMap`,
   * w konstruktorze akceptuje parametr określający listę stogów siana, które znajdują się na mapie,
   * umożliwia nieograniczone poruszanie się samochodu po mapie, pod warunkiem, że nie wjeżdża na inny samochód oraz na
     stóg siana,
   * posiada metodę `String toString()`, która rysuje fragment mapy, na którym znajdują się wszystkie elementy (stogi
     siana oraz samochody). W celu jej implementacji wykorzystaj klasę `MapWisualizer` z poprzedniego laboratorium.
2. Sprawdź czy implementacja klasy jest poprawna - umieść na mapie stogi na pozycjach: (-4,-4), (7,7), (3,6) oraz (2,0).
   Uruchom tę samą sekwencję ruchów co w laboratorium 4.
3. Dodaj testy do klas `RectangularMap` oraz `UnboundedMap` weryfikujące poprawność działania metod dostępnych w
   interfejsie `IWorldMap`,
4. Przyjrzyj się implementacjom tych klas - łatwo można zauważyć, że duża część kodu w obu klasach się powtarza. 
5. Dodaj klasę abstrakcyjną `AbstractMap`, która zawiera kod wspólny dla tych klas.
6. Spraw aby obie klasy dziedziczyły z `AbstractMap` oraz usuń kod, który jest już zaimplementowany w klasie
   `AbstractMap`.
7. Uruchom testy i zweryfikuj, że mapy działają tak jak wcześniej.
8. Rozważ dodanie interfejsu `IMapElement`, który byłby implementowany przez klasy `Car` oraz `HayStack`. Zastanów się
   czy można by uprościć implementację klasy `UnboundedMap` wykorzystując ten interfejs.
9. Zastanów się, czy celowe byłoby dodanie klasy `AbstractMapElement`.

## Przydatne informacje

* Klasa abstrakcyjna to klasa, która posiada niekompletną implementację. Wprowadza się ją, aby usunąć powtarzający się
  kod. Nie można tworzyć obiektów klasy abstrakcyjnej. Klasa jest oznaczana jako abstrakcyjna za pomocą słowa kluczowego
  `abstract`. Klasa abstrakcyjna może implementować jakiś interfejs. Nie wszystkie metody interfejsu muszą być w niej
  zaimplementowane.
* Każda klasa domyślnie dziedziczy z klasy `Object`. Dziedziczenie z innej klasy wskazujemy za pomocą słowa kluczowego
  `extends`:
```java
class RectangularMap extends AbstractMap {
}
```
* Jeśli chcemy aby jakieś pole lub metoda nie była częścią publicznego interfejsu klasy, ale żeby była dostępną w
  klasach podrzędnych, to oznaczamy je jako chronione (`protected`). Przykładowo lista samochodów w klasie `AbstractMap`
  powinna być chroniona:
```java
class AbstractMap implements IWorldMap {
  protected List<Car> cars = new ArrayList<>():
}
```
* Klasa podrzędna może zmienić implementację metody dostępne w klasie nadrzędnej - widzieliśmy to na przykładzie metody
  `toString`. Wtedy dla każdego obiektu używana jest zawsze metoda z *faktycznego*, a nie deklarowanego typu tego
  obiektu. Innymi słowy w Javie domyślnie metody są *wirtualne*.
* Klasa podrzędna może odwołać się do implementacji z klasy nadrzędnej za pomocą słowa kluczowego `super`. Np.
```java
public Object objectAt(Position position) {
  Object object = super.objectAt(position);
  \\...
}
```
W ten sposób można *rozszerzać* zachowanie jakiejś metody w klasach podrzędnych.
