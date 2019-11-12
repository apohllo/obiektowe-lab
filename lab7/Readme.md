# Laboratorium 7

Celem laboratorium jest zapoznanie się z wzorcem projektowym `Observer`.

## Przydatne informacje

* Wzorce projektowe są koncepcją występującą w programowaniu obiektowym polegającą na tym, że określona klasa problemów
  może być rozwiązana w schematyczny sposób. Rozwiązanie problemu jednak nie może być (najczęściej) zawarte w jednej
  klasie, dlatego wzorzec stanowi swego rodzaju szkielet rozwiązania, który określa jakie klasy i interfejsy muszą być
  wykorzystane, aby poprawnie rozwiązać dany problem.
* Przykładem wzorca jest obserwator (*observer*) - rozwiązuje on problem zmian wewnętrznego stanu obiektu.
  Więcej informacji na temat tego wzorca można znaleźć pod adresem https://en.wikipedia.org/wiki/Observer_pattern
* W Javie istnieje kolekcja `SortedSet`, która umożliwia przechowywanie uporządkowanego zbioru elementów. Elementy mogą
  implementować interfejs `Comparabel` lub przy tworzeniu zbioru należy wskazać obiekt implementujący interfejs
  `Comparator`, odpowiedzialny za porządkowanie elementów.

## Zadania do wykonania

### Aktualizacja słownika w mapie

1. Implementacja mechanizmu aktualizacji słownika mapy wymaga, aby mapa była informowana o zmianach pozycji zwierząt.
  Dotychczasowa implementacja opiera się na modyfikacji metody `run`. Lepszym rozwiązaniem jest zastosowanie
   wzorca projektowego `Observer` - mapa ma zarejestrować się jako obserwator dla zmian pozycji zwierzęcia.
2. Realizację implementacji rozpocznij od zdefiniowana interfejsu `IPositionChangeObserver`, który zawiera jedną metodę
  `positionChanged(Vector2d oldPosition, Vector2d newPosition)`.
3. Obie mapy muszą implementować ten interfejs. Możesz to zrealizować, jeśli odpowiedni kod umieścisz w klasie
   `AbstractWorldMap`. Implementacja metody `positionChanged` powinna polegać na tym, że ze słownika usuwana jest para:
   `<stara pozycja, zwierzę>`, a dodawana jest para: `<nowa pozycja, zwierzę>`.
4. Klasa `Animal` musi umożliwić rejestrowanie obserwatorów. Dodaj metody: `void addObserver(IPositionChangeObserver
    observer)` oraz `void removeObserver(IPositionChangeObserver observer)`, które będą dodawały i usuwały danego
    obserwatora do listy obserwatorów w klasie `Animal`.
5. Klasa `Animal` musi informować wszystkich obserwatorów, o tym że pozycja została zmieniona. Stwórz metodę
    `positionChanged` w klasie `Animal`, która będzie notyfikowała wszystkich obserwatorów o zmianie.
6. Zweryfikuj poprawność implementacji korzystając z kodu z poprzednich laboratoriów.

### Wyodrębnienie klasy reprezentującej obszar zajęty przez obiekty

1. Dodaj nową klasę `MapBoundary`, która będzie odpowiedzialna za przechowywanie informacji o obszarze zajmowanym przez
   obiekty na mapie.
2. Klasa ta powinna również implementować interfejs `IPositionChangeObserver`.
3. Klasa `MapBoundary` powinna zawierać dwie listy uporządkowane obiektów na mapie - jedną wzdłuż osi X, drugą wzdłuż
   osi Y. Ponieważ porządek musi być zupełny, w przypadku obiektów o tym samym indeksie wzdłuż danej osi wykorzystaj
   drugą współrzędną, w celu określenia porządku zupełnego.
4. Dodanie obiektu do mapy `GrassField` (`UnboundedMap`) powinno sktukować dodaniem tego obiektu do instancji
   `MapBoundary`.
5. Obiekty mają być dodawane w ten sposób, że skrajne pozycje na liście zawsze zajmowane są przez obiekty które mają
   odpowiednio największą oraz najmniejszą wartość indeksu w danym wymiarze.
6. W przypadku aktualizacji pozycji obiektu, należy sprawdzić, czy należy zaktualizować odpowiedni indeks i zrobić to,
   tylko jeśli jest to konieczne.
7. Mapa powinna korzystać z instancji klasy `MapBoundary` w celu efektywnego obliczania obszaru, który ma zostać
   wyświetlony.
