# Laboratorium nr 1

Celem laboratorium jest zapoznanie się z podstawowymi narzędziami Javy.

## Przydatne informacje
* W programie Javy funkcja (a właściwie metoda) `main` musi być częścią jakiejś klasy. Jest ona punktem startowym programu.
* Metoda `main` akceptuje tablicę argumentów typu `String`, ponadto jest publiczną metodą statyczną:
```java
public class World {
   public static void main(String[] args) {
      // treść metody
   }
}
```
* Do wypisywania komunikatów użyj wywołań `System.out.print` oraz `System.out.println`.
* Standardowe wyjście można zaimportować do programu poleceniem `import static java.lang.System.out;`. 
  Wtedy komunikaty można wypisywać za pomocą wywołania `out.print` i `out.println`.
* Warunki logiczne w Javie są przechowywane w zmiennej typu `boolean` - nie ma automatycznej konwersji z innych typów.
* W Javie dostępna jest standardowa pętla `for` znana z C/C++. Można również użyć alternatywnej pętli `for` (tzw. `for each`) 
  do iterowania po elementach kolekcji:
```java
for(String argument : arguments){
}
```
* **Uwaga!** W Javie łańcuchy znaków (oraz inne typy referencyjne) porównuje się za pomocą wywołania `equals`, np.
  `string1.equals(string2)`.
* Typ wyliczeniowy deklaruje się za pomocą słowa kluczowego `enum`, np.:
```java
enum Direction {
  FORWARD,
  BACKWARD,
  RIGHT,
  LEFT
}
```
* Typu wyliczeniowego można użyć odwołując się do jego składowych, np.:
```java
Direction direction = Direction.FORWARD;
```
* W Javie (od wersji 7) można wykonywać instrukcję `switch` na łańcuchach znaków, np.
```java
switch(argument){
  case "f":
    out.println("Do przodu");
    break;
  case "b":
    out.println("Do tyłu");
    break;
}
```
* Od Javy w wersji 13 można również używać nowej składni wyrażenia `switch`, która pozwala przypisać jego wynik do
  zmiennej:
```java
String message = switch(argument){
  case "f" -> "Do przodu";
  case "b" -> "Do tyłu";
  default -> "Nieznana komenda";
}

out.println(message);
```

* W Javie można dość łatwo przekazać fragment tablicy, np. jako rezultat wywołania funkcji lub jako argument pętli for.
  Służy do tego wywołanie 
  ```java
  Arrays.copyOfRange(array, startInclusive, endExclusive);
  ```


## Zadania do wykonania

1. Uruchom program IntelliJ.
2. Utwórz nowy projekt: lab1
3. Zmień środowisko uruchomieniowe Javy na JDK 1.8 (kliknij "New" obok okienka "Project SDK", 
   wybierz ścieżkę `c:\Program files\Java\jdk1.8_101`)
3. Zmień wersję używanej Javy na **8** (File -> Project structure -> Project -> Project language level -> 8 (lambdas...))
4. Utwórz pakiet `agh.cs.lab1`
5. W pakiecie `agh.cs.lab1` utwórz klasę `World` ze statyczną funkcją `main`.
6. Zaimplementuj metodę `main` tak aby wyświetlały się dwa komunikaty:
   - informujący o starcie systemu
   - informujący o zakończeniu działania systemu
7. Uruchom program z p. 7.
8. Dodaj metodę statyczną `run`, która jest wywoływana pomiędzy tymi komunikatami.
9. Metoda `run` powinna informować o tym, że zwierzak idzie do przodu.
10. Uruchom program.
11. Rozszerz metodę `run` tak by akceptowała tablicę argumentów typu `String`.
12. Po komunikacie o poruszaniu się do przodu wypisz w konsoli wartości wszystkich argumentów tej metody oddzielone przecinkami.
13. Zwróć uwagę na to, żeby nie było nadmiarowych przecinków.
14. Uruchom program z dowolnymi parametrami (muszą występować co najmniej 2).
15. Zmodyfikuj program tak aby interpretował wprowadzone argument:
    - `f` - oznacza, że zwierzak idzie do przodu,
    - `b` - oznacza, że zwierzak idzie do tyłu,
    - `r` - oznacza, że zwierzak skręca w prawo,
    - `l` - oznacza, że zwierzak skręca w lewo,
    - pozostałe argumenty powinny być ignorowane.
16. Poruszanie się oraz zmiana kierunku ma być oznajmiana odpowiednim komunikatem. Program powinien akceptować dowolną liczbę
    argumentów. Przykładowo wprowadzenie sekwencji `f f r l` powinno dać w wyniku następujące komunikaty:
    - Start
    - Zwierzak idzie do przodu
    - Zwierzak idzie do przodu
    - Zwierzak skręca w prawo
    - Zwierzak skręca w lewo
    - Stop
17. Zmodyfikuj program w ten sposób, aby metoda `run` nie akceptowała tablicy łańcuchów znaków, lecz tablicę
    wartości typu wyliczeniowego (`enum`). Zamiana łańcuchów znaków powinna być realizowana przez metodę wywoływaną w
    funkcji `main` przed wywołaniem metody `run`, natomiast typ wyliczeniowy powinien być zdefiniowany w osobnym pliku
    (`Direction.java`) w pakiecie `agh.cs.lab1`.
18. Zweryfikuj poprawność działania programu poprzez jego uruchomienie.
19. Zamknij IntelliJ.
20. Otwórz konsolę Windows (np. PowerShell).
21. Skompiluj ten sam program poleceniem `javac` (o ile znajdziesz polecenie `javac`, możliwe, że trzeba będzie podać bezwzględną ścieżkę do pliku javac.exe): <br/>
    `javac agh\cs\lab1\*.java`
22. Uruchom program poleceniem `java` przekazując co najmniej 2 argumenty: <br/>
    `java agh.cs.lab1.World f l`
23. (**Dla zaawansowanych**) Zmień kod odpowiedzialny za konwersję argumentów oraz wyświetlanie kierunków, tak by 
    korzystał z interfejsu `stream` dostępnego w Javie 8.
