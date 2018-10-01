# Laboratorium nr 1

Celem laboratorium jest zapoznanie się z podstawowymi narzędziami Javy.

## Zadania do wykonania

1. Uruchom program IntelliJ.
2. Utwórz nowy projekt: lab1
3. Zmień środowisko uruchomieniowe Javy na JDK 1.8 (kliknij "New" obok okienka "Project SDK", 
   wybierz ścieżkę `c:\Program files\Java\jdk1.8_101`)
3. Zmień wersję używanej Javy na **8** (File -> Project structure -> Project -> Project language level -> 8 (lambdas...))
4. Utwórz pakiet `agh.cs.lab1`
5. W pakiecie `agh.cs.lab1` utwórz klasę `CarSystem` ze statyczną funkcją `main`.
6. Zaimplementuj metodę `main` tak aby wyświetlały się dwa komunikaty:
   - informujący o starcie systemu
   - informujący o zakończeniu działania systemu
7. Uruchom program z p. 7.
8. Dodaj metodę statyczną `run`, która jest wywoływana pomiędzy tymi komunikatami.
9. Metoda `run` powinna informować o tym, że samochód porusza się do przodu.
10. Uruchom program.
11. Rozszerz metodę `run` tak by akceptowała tablicę argumentów typu `String`.
12. Po komunikacie o poruszaniu się do przodu wypisz w konsoli wartości wszystkich argumentów tej metody oddzielone przecinkami.
13. Zwróć uwagę na to, żeby nie było nadmiarowych przecinków.
14. Uruchom program z dowolnymi parametrami (muszą występować co najmniej 2).
15. Zmodyfikuj program tak aby interpretował wprowadzone argument:
    - `f` - oznacza, że samochód ma jechać do przodu,
    - `b` - oznacza, że samochód ma jechać do tyłu,
    - `r` - oznacza, że samochód ma skręcić w prawo,
    - `l` - oznacza, że samochód ma skręcić w lewo,
    - pozostałe argumenty powinny być ignorowane.
16. Jazda w określonym kierunku ma być oznajmiana odpowiednim komunikatem. Program powinien akceptować dowolną liczbę
    argumentów. Przykładowo wprowadzenie sekwencji 'f f r l' powinno dać w wyniku następujące komunikaty:
    - Start
    - Samochód jedzie do przodu
    - Samochód jedzie do przodu
    - Samochód skręca w prawo
    - Samochód skręca w lewo
    - Stop
17. Zmodyfikuj program w ten sposób, aby metoda `run` nie akceptowała tablicy łańcuchów znaków, lecz tablicę
    wartości typu wyliczeniowego (`enum`). Zamiana łańcuchów znaków powinna być realizowana przez metodę wywoływana w
    funkcji `main` przed wywołaniem metody `run`, natomiast typ wyliczeniowy powinien być zdefiniowany w osobnym pliku
    (`Direction.java`) w pakiecie `agh.cs.lab1`.
18. Zweryfikuj poprawność działania programu poprzez jego uruchomienie.
19. Zamknij IntelliJ.
20. Otwórz konsolę Windows.
21. Skompiluj ten sam program poleceniem `javac` (o ile znajdziesz polecenie `javac`): <br/>
    `javac agh\cs\lab1\*`
22. Uruchom program poleceniem `java` przekazując co najmniej 2 argumenty: <br/>
    `java agh.cs.lab1.CarSystem f l`
23. (**Dla zaawansowanych**) Zmień kod odpowiedzialny za konwersję argumentów oraz wyświetlanie kierunków, tak by 
    korzystał z interfejsu `stream` dostępnego w Javie 8.


## Przydatne informacje
* W programie Javy funkcja `main` musi być częścią jakiejś klasy. Jest ona punktem startowym programu.
* Metoda `main` akceptuje listę argumentów typu `String`, ponadto jest publiczną metodą statyczną:
```java
public class Application {
   public static void main(String[] args) {
      // treść metody
   }
}
```
* Do wypisywania komunikatów użyj wywołań `System.out.print` oraz `System.out.println`.
* Standardowe wyjście można zaimportować do programu poleceniem `import static java.lang.System.out;`. 
  Wtedy komunikaty można wypisywać za pomocą wywołania `out.print` i `out.println`.
* Warunki logiczne w Javie są przechowywane w zmiennej typu `boolean`.
* W Javie dostępna jest standardowa pętla `for` znana z C/C++. Można również użyć alternatywnej pętli `for` 
  do iterowania po elementach kolekcji:
```java
for(String argument : arguments){
}
```
* W Javie łańcuchy znaków (oraz inne typy referencyjne) porównuje się za pomocą wywołania `equals`, np.
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
