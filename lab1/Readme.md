# Laboratorium nr 1

Celem laboratorium jest zapoznanie się z podstawowymi narzędziami Javy.

## Zadania do wykonania

1. Otwórz program Eclipse.
2. Uwtórz nowy projekt: obiektowe
3. Zmień środowisko uruchomieniowe Javy na 1.7 (PPM na JRE system library -> properties)
4. Uwtórz pakiet `agh.cs.lab1`
5. Uwtórz klasę `CarSystem` ze statyczną funkcją `main` w pakiecie `agh.cs.lab1`.
6. Zaimplementuj metodę `main` tak aby wyświetlały się dwa komunikaty:
   - informujący o starcie systemu
   - informujący o zakończeniu działania systemu
7. Uruchom program z p. 6.
8. Dodaj metodę statyczną `run`, która jest wywoływana pomiędzy obiema komunikatami.
9. Metoda `run` powinna informować o tym, że samochód porusza się do przodu.
10. Uruchom program.
11. Rozszerz metodę `run` tak by akceptowała listę argumentów typu `String`.
12. Po komunikacie o poruszaniu się do przodu wypisz w konsoli wartości wszystkich argumentów oddzielone przecinkami.
13. Zwróć uwagę na to, żeby nie było nadmiarowych przecinków.
14. Uruchom program z dowolnymi parametrami (muszą występować co najmniej 2).
15. Zamknij Eclipse.
16. Otwórz konsolę Windows.
17. Skompliuj ten sam program poleceniem `javac`
18. Uruchom program poleceniem `java` przekazując co najmniej 2 argumenty.


## Przydatne informacje

* W programie Javy funkcja `main` musi być częścią jakieś klasy.
* Do wypisywania komunikatów użyj wywołań `System.out.print` oraz `System.out.println`.
* Standarowe wyjście można zaimportować do programu poleceniem `import static java.lang.System.out;`.
* Warunki logiczne w Javie są przechowywane w zmiennej typu `boolean`.
* Konstrukcja `for(String argument : arguments)` pozwala na iterowanie po elementach tablicy.
