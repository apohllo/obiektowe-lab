1. W jaki sposób rozmnażają się zwierzęta?
   1. Zwierzaki muszą spotkać się na tej samej komórce.
   2. Dziecko powstaje na tej samej pozycji co rodzice
   3. Kierunek dziecka jest losowy.
   4. Jeżeli jest więcej niż dwoje zwierząt na jednej pozycji, to rozmnażają się te, które mają największą energię.
   5. Dziecko dostaje ćwierć energii od każdego z rodziców. Rodzice tracę tę energię.
   6. Może powstać tylko 1 dziecko. 
2. Ile zwierząt jest na początku?
   1. Ta wartość powinna być parametrem aplikacji ustalanym na starcie. Minimalna sensowna wartość to 10.
3. Kto zjada roślinę, jeśli jest więcej zwierząt?
   1. Roślinę zjada ten kto ma największą energię.
   2. Jeśli > 1, który ma taką samą największą energię, to dzielą roślinę między siebie.
4. Następujące parametry są danymi wejściowymi do aplikacji:
   1. rozmiar mapy (`width`, `height`)
   2. ilość energii początkowej zwierząt (`startEnergy`)
   3. ilość energii traconej w każdym dniu (`moveEnergy`)
   4. ilość energii zyskiwanej przy zjedzeniu rośliny (`plantEnergy`)
   4. proporcje dżungli do sawanny (`jungleRatio`)
5. Dane wejściowe ustalane za pomocą graficznego interfejsu użytkownika. Interfejs musi mieć wprowadzone przykładowe wartości
   początkowe.
7. Czy roślina może urosnąć tam gdzie stoi zwierzę?
   1. Nie
8. Co w sytuacji, w której dżungla jest pełna i nie może urosnąć więcej trawy? 
   1. Nowa trawa nie pojawia się.
9. „Oczywiście na początku symulacji na środku świata umieszczamy jedno lub kilka zwierząt (Adam/Ewa).”
   Czy to znaczy, że wszystkie zwierzęta są na początku na tym samym, środkowym polu, czy może każde z nich powinno zajmować 
   losową pozycję?
   1. Zwierzęta na początku zajmują losowe pozycji i na jednej pozycji może być wtedy tylko jedno zwierze.
5. Czy kierunek początkowy każdego zwierzęcia jest losowy?
   1. Tak.
6. Czy dżungla może się rozrastać, a jeśli tak, to w sposób dowolny czy określony?
   1. Nie.
7. Czy energia potrzebna do rozmnażania nie powinna być danymi wejściowymi? Jeżeli nie, to czy powinna wynosić jakiś % energii startowej, a jeśli tak, to jaki?
   1. Minimalna energia potrzebna do rozmnożenia to połowa energii początkowej zwierzęcia, 
      tzn. 50% `startEnergy`, a nie 50% energii początkowej danego osobnika.
8. Czy położenie dżungli na mapie powinno być centralne, losowe, czy dowolne?
   1. Centralne. 
10. "określenie epoki, w której zmarło" - czyli mam pokazywać też zmarłe zwierzęta ??
    1. Ta informacja nie ma być pokazywana na mapie, tylko na panelu obok.
12. Co to jest epoka?
    1. Epoka to jeden pełny cykl obejmujący generowanie nowych roślin, poruszanie się zwierząt, jedzenie, rozmnażanie
       oraz usuwanie martwych osobników. Innymi słowy epoka = dzień.
13. Co oznacza śledzenie statystyk?
    1. Wyświetlanie wartości liczbowych w formie wykresu.
14. Które zwierzę jest wybierane, jeśli jest wiele zwierząt?
    1. Zwierzę o największej energii.
15. Czy po wybraniu zwierzęcia do śledzenia, należy uwzględnić jego wcześniejszych potomków?
    1. Nie, należy uwzględnić tylko nowe dzieci i nowych potomków.
17. Co to znaczy, że genom jest dominujący?
    1. To znaczy, że posiada go największa liczba osobników (matematyczne określenie to dominanta).
18. Do czego odnoszą się statystyki z punktu 4?
    1. Do pojedynczej epoki.
19. Czy przez określenie "Program musi umożliwiać zatrzymywanie oraz wznawianie animacji w dowolnym momencie" należy rozumieć, że po zatrzymaniu zapisujemy do pliku stan animacji 
    (snapshot), a następnie wznawiamy ją na drugi dzień bazując na danych z pliku?
    1. Nie, chodzi o interaktywne użycie programu, bez zapisywania jego stanu do pliku.
