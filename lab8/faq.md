1. W jaki sposób rozmnażają się zwierzęta?
   1. Zwierzaki muszą spotkać się na tej samej komórce.
   2. Dziecko powstaje na losowej, pustej (tzn. bez zwierząt i trawy) sąsiedniej pozycji.
   3. Kierunek dziecka jest losowy.
   4. Jeżeli jest więcej niż dwoje zwierząt na jednej pozycji, to rozmnażają się te, które mają największą energię.
   5. Dziecko dostaje ćwierć energii od każdego z rodziców. Rodzice tracę tę energię.
   6. Może powstać tylko 1 dziecko. 
2. Ile zwierząt jest na początku?
   1. Ta wartość powinna być parametrem uruchomieniowym aplikacji. Prawdopodobnie potrzebna będzie większa liczba zwierząt
      niż 2, ponieważ jest mało prawdopodobne, że się spotkają.
3. Kto zjada roślinę, jeśli jest więcej zwierząt?
   1. Roślinę zjada ten kto ma największą energię.
   2. Jeśli > 1, który ma taką samą największą energię, to dzielą roślinę między siebie.
4. Następujące parametry są danymi wejściowymi do aplikacji:
   1. rozmiar mapy (`width`, `height`)
   2. ilość energii początkowej zwierząt (`startEnergy`)
   3. ilość energii traconej w każdym dniu (`moveEnergy`)
   4. ilość energii zyskiwanej przy zjedzeniu rośliny (`plantEnergy`)
   4. proporcje dżungli do sawanny (`jungleRatio`)
5. Dane wejściowe są ładowane z pliku `parameters.json` znajdującego się w katalogu, w których uruchamiana jest
   aplikacja.
6. Struktura pliku powinna być następująca:
```
{ 
  "width": 200,
  "height": 100,
  ...
}
```
7. Czy roślina może urosnąć tam gdzie stoi zwierzę?
   1. Nie
8. Co w sytuacji, w której dżungla jest pełna i nie może urosnąć więcej trawy? 
   1. Nowa trawa nie pojawia się.
9. „Oczywiście na początku symulacji na środku świata umieszczamy jedno lub kilka zwierząt (Adam/Ewa).”
   Czy to znaczy, że wszystkie zwierzęta są na początku na tym samym, środkowym polu, czy może każde z nich powinno zajmować 
   losową pozycję?
   1. Zwierzęta na początku zajmują losowe pozycji i na jednej pozycji nie może być 2 zwierząt.
5. Czy kierunek początkowy każdego zwierzęcia jest losowy?
   1. Tak.
6. Czy dżungla może się rozrastać, a jeśli tak, to w sposób dowolny czy określony?
   1. Nie.
7. Czy energia potrzebna do rozmnażania nie powinna być danymi wejściowymi? Jeżeli nie, to czy powinna wynosić jakiś % energii startowej, a jeśli tak, to jaki?
   1. Minimalna energia potrzebna do rozmnożenia to połowa energii początkowej zwierzęcia, 
      tzn. 50% `startEnergy`, a nie 50% energii początkowej danego osobnika.
8. Czy położenie dżungli na mapie powinno być centralne, losowe, czy dowolne?
   1. Centralne, choć zasadniczo nie ma to znaczenia innego niż estetyka. 
9. Co się dzieje w przypadku, gdy para zwierząt się rozmnaża, a wszystkie pozycje dookoła są zajęte?
   1. Potomek ląduje na losowym zajętym kwadraciku.
10. "określenie epoki, w której zmarło" - czyli mam pokazywać też zmarłe zwierzęta ??
    1. Kwestia dotyczy pojedynczego zwierzęcia, wybranego przez użytkownika (gdy jeszcze żyło). Nie chodzi o to, żeby pokazywać zmarłe zwierzęta.
11. "określenia liczby wszystkich potomków, po n-epokach" - chodzi tutaj o liczbę potomków w aktualnej epoce
    czy może oczekujemy na wprowadzenie liczby `n` jako epoki dla której mamy pokazać ile wtedy dane 
    zwierze miało potomków?
    1. Chodzi o wprowadzenie liczby `n`, po której wyświetli się ta informacja.
12. Co to jest epoka?
    1. Epoka to jeden pełny cykl obejmujący generowanie nowych roślin, poruszanie się zwierząt, jedzenie, rozmnażanie
       oraz usuwanie martwych osobników. Innymi słowy epoka = dzień.
13. Co oznacza śledzenie statystyk?
    1. Chodzi o wskazanie bieżącej sytuacji w symulacji, a nie uśrednionych wartości z wielu epok.
14. Które zwierzę jest wybierane, jeśli jest wiele zwierząt?
    1. Zwierzę o największej energii.
15. Czy po wybraniu zwierzęcia do śledzenia, należy uwzględnić jego wcześniejszych potomków?
    1. Nie, należy uwzględnić tylko nowe dzieci i nowych potomków.
16. Czy trzeba obsługiwać konkretną liczbę epok ("po n-epokach"), czy wystarczy wyświetlić tę wartość po zatrzymaniu
    symulacji?
    1. Wystarczy po zatrzymaniu symulacji.
17. Co to znaczy, że genom jest dominujący?
    1. To znaczy, że posiada go największa liczba osobników.
18. Do czego odnoszą się statystyki z punktu 4?
    1. Do pojedynczego dnia/epoki.
19. Czy przez określenie "Program musi umożliwiać zatrzymywanie oraz wznawianie animacji w dowolnym momencie" należy rozumieć, że po zatrzymaniu zapisujemy do pliku stan animacji (snapshot), a następnie wznawiamy ją na drugi dzień bazując na danych z pliku?
    1. Nie, chodzi o interaktywne użycie programu, bez zapisywania jego stanu do pliku.
20. Jak należy rozumieć p. 7 dotyczący uśrednionych statystyk, np. w odniesieniu do genotypu?
    1. Należy rejestrować liczbę konkretnych genotypów w każdej epoce i jako wartość "uśrednioną" określić genotyp, który miał największą liczbę wystąpień
       łącznie, we wszystkich epokach (a nie tylko w ostatniej epoce).

