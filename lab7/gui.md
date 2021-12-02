# Lab 7a - graficzny interfejs użytkownika
Celem laboratorum jest zapoznanie się z frameworkiem **JavaFX**, służącym do budowy aplikacji okienkowej.

Treść laboratorium powstała we współpracy z Norbertem Morawskim.

## Przydatne informacje

### JavaFx
* JavaFX to [framework](https://pl.wikipedia.org/wiki/Framework) do obsługi środowiska graficznego.
* Aplikacja JavaFX składa się z:
    * `Stage` - okno aplikacji,
    * `Scene` - aktualna zawartość aplikacji (np. ekran symulacji, ekran podsumowania)
    * Scena zawiera wiele instancji `Node`. Są nimi m.in. przyciski, pola tekstowe, kontenery (`VBox`, `HBox`, `GridPane`, itp.).
* Główna klasa w aplikacji powinna dziedziczyć po `Application` i implementować metodę `start()`.
* Minimalna aplikacja powinna stworzyć jedną scenę, przypiąć ją do `Stage` i wyświetlić.

## Zadania do wykonania

### Podstawowa aplikacja JavaFX
1. W `build.gradle`:
    1. Dodaj `id 'org.openjfx.javafxplugin' version '0.0.10'` do sekcji `plugins`.
    2. Dodaj pod `repositories` sekcję:
        ```gradle
        javafx {
            version = "17"
            modules = [ 'javafx.controls' ]
        }
        ```
2. Utwórz nowy pakiet `agh.ics.oop.gui`.
3. Odśwież konfigurację Gradle'a (`Ctrl+Shift+O`).
4. Utwórz klasę `App` dziedziczącą z `Application` z pakietu `javafx.application`.
5. Zaimplementuj metodę `public void start(Stage primaryStage)`.
    * Będzie to metoda uruchamiająca interfejs graficzny Twojej aplikacji.
    * Na razie możesz w ciele metody wpisać `primaryStage.show();`. Wyświelti to puste okno aplikacji.
6. W metodzie `main` w `World` dodaj `Application.launch(App.class, args);`
    * Spowoduje to uruchomienie okna JavaFX.
7. Zobacz czy okno pokazuje się (może być nieresponsywne, ale powinno się pokazać).
*Pamiętaj, żeby importować brakujące klasy z pakietu `javafx`*

### Dodanie podstawowej funkcjonalności
1. W klasie `App` dodaj:
    ```java
    Label label = new Label("Zwierzak");
    Scene scene = new Scene(label, 400, 400);
    
    primaryStage.setScene(scene);
    primaryStage.show();
    ```
    Spowoduje to:
    * Utworzenie nowej etykiety z treścią `Zwierzak`.
    * Utworzenie sceny zawierającej tylko obiekt `Label`, z wymiarami 400 x 400 pikseli.
    * Ustawienie sceny jako aktywnej.
    * Pokazanie okna aplikacji.
2. Zmodyfikuj kod tak, aby zamiast pojedynczej etykiety wyświetlał siatkę z etykietami.
    * *Wskazówka:* Skorzystaj z klasy [`GridPane`](http://tutorials.jenkov.com/javafx/gridpane.html). Przydatne może być ustawienie `grid.setGridLinesVisible(true);`.
3. Przenieś kod inicjalizacyjny mapy z klasy `World` do `App` (możesz skorzystać z metody `init()`).
4. Użyj `getParameters().getRaw()` żeby odczytać parametry linii komend.
5. Wykorzystaj `AbstractWorldMap`, tak aby siatka odpowiadała rozmiarom i orientacji mapy. Pamiętaj, że współrzędne `y` rosną w kierunku "do góry", w `GridPane` jest na odwrót.
6. Dodaj w pierwszej kolumnie i w pierwszym rzędzie wartości współrzędnych (podobnie jak robi to `MapVisualizer`).
7. Do pozostałych wierszy dodaj obiekty z mapy.
8. Dodaj do siatki rozmiary kolumn i wierszy. Skorzystaj z:
    * `grid.getColumnConstraints().add(new ColumnConstraints(width));`
    * `grid.getRowConstraints().add(new RowConstraints(height));`
8. Wyśrodkuj etykiety korzystając z wywołania `GridPane.setHalignment(label, HPos.CENTER)`.
9. Aktualnie, twój program powinien wyglądać mniej więcej tak (użyto mapy `GrassField`, dodano 2 zwierzaki):<br>
![look1](img/look1.png)
