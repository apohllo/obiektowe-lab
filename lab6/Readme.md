# Laboratorium 6

Celem laboratorium jest zapoznanie się z mechanizmem wyjątków, interfejsem Map oraz użycie wzorca projektowego Observer.

## Zadania do wykonania

1. Wykorzystaj klasy z laboratrium 5.
2. W metodzie odpowiedzialnej za zamianę argumentów aplikacji na ruchy samochodu rzuć wyjątek IllegalArgumentException,
  jeśli, którykolwiek z parametrów nie należy do listy poprawnych parametrów (`f`, `forward`, `b`, `backward`, etc.).
  Jako przyczynę wyjatku wprowadź łańcych znaków informujący, że określony parametr jest niepoprawny, np.
  new IllegalArgumentException(argument + " is not legal move specification").
3. W metodach odpowiedzialnych za dodawanie elementów do mapy zweryfikuj, czy dane pole nie jest już zajmowane.
  Jeśli pole jest już zajęte, rzuć wyjątek IllegalArgumentException, podając jako przyczynę łańcuch znaków zawierający
  informację o tym, które pole jest już zajęte.
4. Obsłuż oba wyjątki w metodzie `main` klasy `CarSystem`. Obsługa powinna polegać na wyświetleniu komunikatu wyjątku
   oraz zakończeniu działania programu.
4. Przetestuj działanie wyjątków poprzez podanie nieprawidłowego parametru ruchu oraz dodanie do mapy dwa razy tego
   samego samochodu. Efektem powinno być kontrolowane zakończenie działania programu.
5. Implementacja metod `isOccupied` oraz `objectAt` w mapach nie jest wydajna, ponieważ za każdym razem wymaga przejścia
   przez wszystkie elementy znajdujące się na mapie. Można ją poprawić zamieniając listę na słownik (wykorzystując 
   interfejs `Map` oraz implementację `HashMap`).
   Kluczami słownika powinny być pozycje elementów, a wartościami konkretne obiekty.
6. Poprawna implementacja słownika wymaga, aby klasa `Position` implementowała metodę `hashCode`. Metoda ta jest
   wykorzystywana m.in. przez słownik oparty o tablicę hashującą (`HashMap`). Możesz wygenerować odpowiedni kod korzystając z
   wsparcia środowiska programistycznego. Zasadniczo metoda ta musi być zgodna z działaniem metody `equals` - dwa
   obiekty, które są równe według metody `equals` muszą mieć identyczną wartość zwracaną przez metodę `hashCode`.
7. Poprawna implementacja nowego mechanizmu wymaga, aby mapa była informowana o zmianach pozycji przez samochody.
  Właściwym sposobem na rozwiązanie tego zagadnienie nie jest modyfikacja metody `run`, ponieważ duplikowałaby ona część
  kodu, który znajduje się w metodzie `move` samochodu. Należy użyć wzorca projektowego `Observer` (w Javie tradycyjnie
  nazywany `Listener`) - mapa ma zarejestrować się jako obserwator dla ruchów samochodu.
8. Realizację implementacji rozpocznij od zdefiniowana interfejsu `IPositionChangeListener`, który zawiera jedną metodę
  `positionChanged(Position old, Position new)`.
9. Obie mapy muszą implementować ten interfejs. Możesz to zrealizować, jeśli odpowiedni kod umieścisz w klasie
   `AbstractWorldMap`. Implementacja metody `positionChanged` powinna polegać na tym, że ze słownika usuwana jest para:
   stara pozycja - samochód, a dodawna jest para: nowa pozycja - samochód.
10. Klasa `Car` musi umożliwić rejestrowanie obserwatorów. Dodaj metody: `void addListener(IPositionChangeListener
    listener)` oraz `void removeListener(IPositionChangeListener listener)`, które będą dodawały i usuwały danego
    obserwatora do listy obserwatorów w klasie `Car`.
11. Klasa `Car` musi informować wszystkich obserwatorów, o tym że pozycja została zmieniona. Stwórz metodę
    `positionChanged` w klasie `Car`, która będzie notyfikowała wszystkich obserwatorów o zmianie.
12. Przetestuj działanie nowej implemetacji korzystając z kodu z laboratorium nr 5.


## Przydatne informacje

TODO
