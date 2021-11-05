# Lab 8 - graficzny interfejs użytkownika
Celem laboratorum jest zapoznanie się z frameworkiem **JavaFX**, służącym do budowy aplikacji okienkowej, jak również z mechanizmem wątków w Javie.
## Przydatne informacje

### JavaFx
* JavaFX to [framework](https://pl.wikipedia.org/wiki/Framework) do obsługi środowiska graficznego.
* Aplikacja JavaFX składa się z:
    * `Stage` - okno aplikacji,
    * `Scene` - aktualna zawartość aplikacji (np. ekran symulacji, ekran podsumowania)
    * Scena zawiera wiele instancji `Node`. Są nimi m.in. przyciski, pola tekstowe, kontenery (`VBox`, `HBox`, `GridPane`, itp.).
* Główna klasa w aplikacji powinna dziedziczyć po `Application` i implementować metodę `start()`.
* Minimalna aplikacja powinna stworzyć jedną scenę, przypiąć ją do `Stage` i wyświetlić.

### Wątki
* Wątek jest to niezależnie wykonujący się fragment kodu. Nie blokuje on działania reszty programu. Dzięki wielu wątkom działającym w tle można zrealizować operacje zajmujące dużo czasu, jednocześnie nie blokując wątku obsługującego interfejs graficzny. Unikamy w ten sposób wizualnego "zacinania się" aplikacji. Przykładami takich operacji może być np. dostęp do zasobu sieciowego albo w naszym przypadku sztucznie generowane opóżnienie pomiędzy ruchami.
* Wątek UI jest to główny wątek aplikacji w graficznym interfejsem użytkownika. Tylko ten wątek może modyfikować zawartość sceny w *JavaFX*.
* Aby stworzyć wątek możemy skorzystać z klasy `Thread` i interfejsu `Runnable`.
    ```java
    class SimulationEngine implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread started.");
        }
    }
    
    SimulationEngine engine = new SimulationEngine();
    Thread engineThread = new Thread(engine);
    engineThread.start();
    ```
* Jeżeli wątek zakończy działanie, tzn. zakończy się funkcja `run()`, nie może on ponownie wystartować. Trzeba stworzyć nową instancję `Thread`, ale można ponownie użyć instancji `Runnable`.

### Różne
* Do testowania czy dana zmienna zawiera klasę implementującą interfejs/przedstawiciela klasy można wykorzystać słowo kluczowe `instanceof`.
    * *Przykład:* `if (element instanceof IObservable || element instanceof Animal)`
* Interfejs `Collection` - jest to najogólniejszy interfejs reprezentujący zbiór obiektów. Zwraca go m.in. metoda `values()` w interfejsie `Map`. Można go wykorzystać w pętli `for (Object obj : collection)`.

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
3. Naciśnij `Ctrl+Shift+O` żeby odświeżyć Gradle'a.
4. Utwórz klasę `App` dziedziczącą po `Application` z pakietu `javafx.application`.
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
7. Do pozostałych wierszy dodaj obiekty z mapy
8. Dodaj do siatki rozmiary kolumn i wierszy. Skorzystaj z:
    * `grid.getColumnConstraints().add(new ColumnConstraints(width));`
    * `grid.getRowConstraints().add(new RowConstraints(height));`
9. Aktualnie, twój program powinien wyglądać mniej więcej tak (użyto mapy `GrassField`, dodano 2 zwierzaki): ...
   
### Tekstury
1. Stwórz albo wykorzystaj gotowe 4 tekstury z informacją o orientacji dla zwierzaka (folder `resources`)
2. Stwórz albo wykorzystaj teksturę dla trawy.
3. Dodaj utworzone tekstury do folderu `src/main/resources`
4. Utwórz klasę `GuiElementBox`, która przy pomocy poniższego kodu pozwoli na dodanie obrazka do siatki:
    ```java
    Image image = new Image(new FileInputStream("src/main/resources/animal.png"));
    ImageView imageView = new ImageView(image);
    imageView.setFitWidth(100);
    imageView.setFitHeight(100);

    Label label = new Label(name);
    label.setTextAlignment(TextAlignment.CENTER);

    this.box = new VBox(imageView, label);
    this.box.setAlignment(Pos.CENTER);
    ```
    * Tworzymy obraz reprezentujący naszą teksturę.
    * Przypisujemy go do `ImageView`.
    * Ustawiamy rozmiar `ImageView` na 100 x 100 pikseli.
    * Tworzymy podpis pod zwierzęciem (opcjonalne).
    * Używamy widoku `VBox`, który ustawia swoje dzieci w pionie jedno pod drugim.
    * Centrujemy elementy w poziomie.
5. Dodaj do interfejsu `IMapElement` metody pozwalające na pobranie imienia (np. składającego się z pozycji zwierzaka) i tekstury danego elementu (uwzględniające różne orientacje zwierzaka). Zaimplementuj je w klasach implementujących ten interfejs.
6. Wykorzystaj powyższe metody w konstruktorze klasy `GuiElementBox`, który powinien przyjmować instancję `IMapElement`.
7. Zamień reprezentację tekstową na graficzną w klasie `App`.
8. Wydziel kod renderujący mapę do funkcji `renderGrid()`, a zmienną lokalną `grid` uczyń prywatnym polem klasy `App`. Utwórz nową instancję `GridPane` w konstruktorze.
8. Docelowy wygląd: ...

### Wątek symulacyjny
1. Skorzystaj ze wzorca *Observer* i dodaj interfejs `IAnimalUpdateObserver`, zaimplementuj go w `App` i dodaj jako obserwatora do `ThreadedSimulationEngine`.
    * Poprzedni interfejs do obserwowania *zmiany pozycji* zwierząt nie wystarczy, ponieważ oprócz pozycji może zmienić się także orientacja zwierzęcia.
2. Wywołaj `animalUpdate()` kiedy metoda `run()` wykona `move()` na `Animal`.
3. W klasie `App` obsłuż aktualizację stanu zwierzęcia. Uruchom na wątku UI czyszczenie siatki `grid.getChildren().clear()` i wyrenderuj ją od nowa przy użyciu `renderGrid()`. Wykonanie na wątku UI można osiągnąć przy użyciu `Platform.runLater(() -> { ... })`.
    * **Dla zaawansowanych:** Spróbuj zopytmalizować aktualizacje siatki aby nie była ona tworzona od nowa za każdym razem.
4. Dodaj pole `moveDelay` które będzie służyć do opóźniania sekwencji ruchów zwierząt (aby widzieć zmiany na żywo).
    * Zastanów się kiedy ustawić wartość tego pola.
5. Opóźnienie pomiędzy ruchami dodaj za pomocą `Thread.sleep(1000)` (usypia wątek na 1000 ms). Umieść `sleep()` w bloku `try-catch` i wypisz stosowny komunikat w razie przerwania symulacji.
6. Zaimplementuj `Runnable` przez `SimulationEngine`.
7. W metodzie `init()` stwórz nowy wątek używając `SimulationEngine` jako parametru. Uruchom wątek metodą `start()`. Pamiętaj o ustawieniu `moveDelay` na np. 1000 [ms].

### Inne elementy interfejsu
1. Dodaj do interfejsu pole tekstowe i przycisk start. Skorzystaj z klas [`HBox`](http://tutorials.jenkov.com/javafx/hbox.html), [`VBox`](http://tutorials.jenkov.com/javafx/vbox.html), [`Button`](http://tutorials.jenkov.com/javafx/button.html) i [`TextField`](http://tutorials.jenkov.com/javafx/textfield.html).
2. Utwórz setter dla pola `directions` w `ThreadedSimulationEngine` tak, aby dało się je dynamicznie zmieniać przy naciśnięciu przycisku. Utwórz konstruktor który nie ustawia tego pola.
3. Usuń `engineThread.start()` z metody `init()`.
4. Dodaj obsługę kliknięcia *Start* (użyj `setOnAction`). Odczytaj wartość pola tekstowego (`getText()`) i użyj jego zawartości w parserze. Ustaw nową sekwencję ruchów i uruchom **za każdym razem** nową instancję `Thread`.
