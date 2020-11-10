# Laboratorium 7

Celem laboratorium jest zapoznanie się z mechanizmem wyjątków oraz dalsze zapoznanie się z wzorcem projektowym `Observer`.

## Przydatne informacje

* Wyjątki są mechanizmem pozwalającym przekazywać informację o błędzie pomiędzy odległymi fragmentami kodu.
* Zgłoszenie błędu odbywa się poprzez *rzucenie wyjątku*. W Javie służy do tego słowo kluczowe `throw`:

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
Wyjątek może być rzucony na dowolnym poziomie w kodzie, który otoczony jest blokiem `try`. Tzn. w kodzie tym może być
wiele zagnieżdżonych wywołań funkcji, a i tak blok `try` przechwyci taki wyjątek, pod warunkim, że nie zostanie on obsłużony
na niższym poziomie.


## Zadania do wykonania

### Obsługa wyjątków

1. Wykorzystaj klasy z laboratorium 6.
2. W metodzie odpowiedzialnej za zamianę argumentów aplikacji na ruchy zwierzęcia rzuć wyjątek `IllegalArgumentException`,
  jeśli którykolwiek z parametrów nie należy do listy poprawnych parametrów (`f`, `forward`, `b`, `backward`, etc.).
  Jako przyczynę wyjątku wprowadź łańcuch znaków informujący, że określony parametr jest niepoprawny, np.
  `new IllegalArgumentException(argument + " is not legal move specification")`.
3. W metodach odpowiedzialnych za dodawanie elementów do mapy, jeśli dodanie elementu na wybrane pole jest niemożliwe
   rzuć wyjątek `IllegalArgumentException`, podając jako przyczynę łańcuch znaków zawierający
   informację o tym, które pole jest błędne. Wyjątek zastępuje sygnalizowanie błędu przy pomocy zwracania wartości `false`.
4. Obsłuż oba wyjątki w metodzie `main` klasy `World`. Obsługa powinna polegać na wyświetleniu komunikatu wyjątku
   oraz zakończeniu działania programu, a konstrukcja `try` powinna obejmować cały kod znajdujący się w metodzie `main`.
4. Przetestuj działanie wyjątków poprzez podanie nieprawidłowego parametru ruchu oraz dodanie do mapy dwa razy tego
   samego zwierzęcia. Efektem powinno być kontrolowane zakończenie działania programu.
6. Zaktualizuj testy metody `place`, aby były zgodne z nowym kontraktem.

### Wyodrębnienie klasy reprezentującej obszar zajęty przez obiekty

1. Dodaj nową klasę `MapBoundary`, która będzie odpowiedzialna za przechowywanie informacji o obszarze zajmowanym przez
   obiekty na mapie.
2. Klasa ta powinna implementować interfejs `IPositionChangeObserver`.
3. Klasa `MapBoundary` powinna zawierać dwa zbiory uporządkowane obiektów na mapie - jeden wzdłuż osi X, drugi wzdłuż
   osi Y. Ponieważ porządek musi być zupełny, w przypadku obiektów o tym samym indeksie wzdłuż danej osi wykorzystaj
   drugą współrzędną oraz typ obiektu, w celu określenia porządku zupełnego.
4. Dodanie obiektu do mapy `GrassField` (`UnboundedMap`) powinno skutkować dodaniem tego obiektu do instancji
   `MapBoundary`.
5. Obiekty mają być dodawane w ten sposób, że skrajne pozycje na liście zawsze zajmowane są przez obiekty które mają
   odpowiednio największą oraz najmniejszą wartość indeksu w danym wymiarze.
6. W przypadku aktualizacji pozycji obiektu, należy sprawdzić, czy należy zaktualizować odpowiedni indeks i zrobić to,
   tylko jeśli jest to konieczne.
7. Mapa powinna korzystać z instancji klasy `MapBoundary` w celu efektywnego obliczania obszaru, który ma zostać
   wyświetlony.
   
