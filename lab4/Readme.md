# Laboratorium 4

Celem laboratorium jest zapoznanie się z mechanizmem interfejsów oraz kolekcją `LinkedList`.

## Zadania do wykonania

1. Wykorzystaj definicje klas z poprzedniego laboratorium.
2. Zdefiniuj interfejs `IWorldMap` posiadający następujące metody: 
   * `boolean canMove(Position position)`, która zwraca informację, że
      obiekt może przesunąć się na daną pozycję,
   * `boolean add(Car car)`, która umieszcza samochód na mapie, pod warunkiem, że jego pozycja leży w obrębie mapy oraz
     na danej pozycji nie znajduje się inny obiekt. Zwracana wartość informuje, czy udało się umieścić samochód na
     mapie.
3. Zdefiniuj klasę `RectangleMap`, która:
   * implementuje interfejs `IWorldMap`
   * w konstruktorze akceptuje dwa parametry `Poisition` wskazujące prawy dolny oraz lewy górny róg mapy (pomiń
     sytuację, w której użytkownik podaje niepoprawne dane),
   * umożliwia poruszanie się w obrębie zdefiniowanego prostokąta (jak w laboratorium 3),
   * umożliwia występowanie więcej niż jednego samochodu na mapie,
   * posiada metodę `toString` rysującą aktualną konfigurację mapy.
4. Zdefiniuj klasę `UnboundedMap`, która:
   * implementuje interfejs `IWorldMap`,
   * w konstruktorze akceptuje parametr określający liczbę zajętych pozycji na mapie,
   * generuje losowe pokrycie mapy "przeszkodami" w ilości określonej w konstruktorze,
   * umożliwia nieograniczone poruszanie się samochodu po mapie, pod warunkiem, że nie wjeżdża na inny samochód oraz na
     przeszkodę,
   * posiada metodę `String toString(Position position1, Position position2)`, która rysuje wybrany fragment mapy.

CDN.
