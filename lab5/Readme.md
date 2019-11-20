# Laboratorium 5

Celem laboratorium jest zapoznanie się z mechanizmem dziedziczenia oraz właściwym sposobem jego użycia w programowaniu
obiektowym.

## Przydatne informacje

* Klasa abstrakcyjna to klasa, która posiada niekompletną implementację. Wprowadza się ją, aby usunąć powtarzający się
  kod. Nie można tworzyć obiektów klasy abstrakcyjnej. Klasa jest oznaczana jako abstrakcyjna za pomocą słowa kluczowego
  `abstract`. Klasa abstrakcyjna może implementować jakiś interfejs. Nie wszystkie metody interfejsu muszą być w niej
  zaimplementowane.
* Każda klasa domyślnie dziedziczy z klasy `Object`. Dziedziczenie z innej klasy wskazujemy za pomocą słowa kluczowego
  `extends`:
```java
class RectangularMap extends AbstractWorldMap {
}
```
* Jeśli chcemy aby jakieś pole lub metoda nie była częścią publicznego interfejsu klasy, ale żeby były dostępne w
  klasach podrzędnych, to oznaczamy je jako chronione (`protected`). Przykładowo, lista zwierząt w klasie `AbstractWorldMap`
  powinna być chroniona:
```java
abstract class AbstractWorldMap implements IWorldMap {
  protected List<Animal> animals = new ArrayList<>():
}
```
* Klasa podrzędna może zmienić implementację metody dostępnej w klasie nadrzędnej - widzieliśmy to na przykładzie metody
  `toString()`. Wtedy dla każdego obiektu używana jest zawsze metoda z *faktycznego*, a nie deklarowanego typu tego
  obiektu. Innymi słowy w Javie domyślnie metody są *wirtualne*.
* Klasa podrzędna może odwołać się do implementacji z klasy nadrzędnej za pomocą słowa kluczowego `super`. Np.
```java
public Object objectAt(Vector2d position) {
  Object object = super.objectAt(position);
  //...
}
```
W ten sposób można *rozszerzać* zachowanie jakiejś metody w klasach podrzędnych.

## Zadania do wykonania

0. Wykorzystaj klasy z laboratorium nr 4.
1. Zdefiniuj klasę `Grass` (kępka trawy), która:
   * w konstruktorze akceptuje parametr `Vector2d`, określający pozycję kępki trawy,
   * posiada metodę publiczną `Vector2d getPosition()`, która zwraca jej pozycję,
   * posiada metodę publiczną `String toString()`, która zwraca `*` jako swoją reprezentację.
1. Zdefiniuj klasę `GrassField`, która:
   * implementuje interfejs `IWorldMap`,
   * w konstruktorze akceptuje parametr określający liczbę pól trawy, które znajdują się na mapie,
   * kępki trawy powinny być umieszczane losowo w obszarze o współrzędnych `(0,0)` - `(sqrt(n*10),sqrt(n*10))`, 
     gdzien `n` to liczba pól trawy, przy założeniu, że dwie kępki trawy nie mogą być w tym samym miejscu,
   * umożliwia nieograniczone poruszanie się zwierzęcia po mapie, pod warunkiem, że nie wchodzin na inne zwierzę,
   * posiada metodę `String toString()`, która rysuje fragment mapy, na którym znajdują się wszystkie elementy (zwierzęta oraz trawę). 
     W celu jej implementacji wykorzystaj klasę `MapVisualizer` z poprzedniego laboratorium oraz
     dynamicznie oblicz skrajne punkty, które powinny zostać wyświetlone. Obecność zwierząt ma priorytet nad obecnością
     kępki trawy na danym polu.
2. Sprawdź czy implementacja klasy jest poprawna - zainicjuj mapę z 10 kępkami trawy.
   Uruchom tę samą sekwencję ruchów co w laboratorium 4.
3. Dodaj testy do klas `RectangularMap` oraz `GrassField` weryfikujące poprawność działania metod dostępnych w
   interfejsie `IWorldMap`,
4. Przyjrzyj się implementacjom tych klas - łatwo można zauważyć, że duża część kodu w obu klasach się powtarza. 
5. Dodaj klasę abstrakcyjną `AbstractWorldMap`, która zawiera kod wspólny dla tych klas.
6. Spraw aby obie klasy dziedziczyły z `AbstractWorldMap` oraz usuń kod, który jest już zaimplementowany w klasie
   `AbstractWorldMap`. W szczególności dodaj implementację metody `toString()` w klasie `AbstractWorldMap`, w taki
   sposób, aby wykorzystywała ona abstrakcyjne metody zdefiniowane w tej klasie, posiadające odrębne implementacje w
   klasach dziedziczących. Jest wzorzec projektowy *metoda szablonowa*.
7. Uruchom testy i zweryfikuj, że mapy działają tak jak wcześniej.
8. Rozważ dodanie interfejsu `IMapElement`, który byłby implementowany przez klasy `Animal` oraz `Grass`. Zastanów się
   czy można by uprościć implementację klasy `GrassField` wykorzystując ten interfejs.
9. Zastanów się, czy celowe byłoby dodanie klasy `AbstractWorldMapElement`.
10. (**Dla zaawansowanych**). Zmodyfikuj implementację tak, żeby po spotkaniu zwirzęcia i trawy, trawa znikała. Nowe kępki
    trawy powinny pojawiać się losowo w obszarze z punktu 1, po zjedzeniu trawy przez zwierzę, przy założeniu, że nowe
    kępki trawy nie pokrywa się z istniejącą kępką trawy, ani z żadnym zwierzęciem.
