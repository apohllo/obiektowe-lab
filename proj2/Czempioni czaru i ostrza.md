# Czempioni czaru i ostrza
## Punktacja
Za implementacje części podstawowej można otrzymać 6 pkt, a rozszerzonej 8 pkt
## Cel gry
Celem gracza jest pokonanie drugiego gracza przy użyciu swojej armii
## Opis gry
Po uruchomieniu, graczom powinien się ukazać ekran wyboru armii {nieumarli, ludzie, demony, elfy itp}, a następnie wybór jednostek do armii - każda armia składa się z kilku różnych jednostek oraz ich powtórek. Każda jednostka ma określony koszt w monetach, które każdy gracz ma ograniczone, do tego gracz nie może wybrać każdego rodzaju jednostek do swojej armii. Przykład: armia nieumarłych składa się z {zombie za 1 monetę, szkieleta łucznika za 5 monet, wampira za 20, rycerza śmierci za 100 i nekromanty za 50} gracz ma 200 monet więc może wziąć np.: rycerza śmierci, nekromante, wampira i 6 łuczników ale nie mógłby wziąć zombie. 

Gdy obaj gracze wybiorą swoje armie pojawia się ekran bitwy na której gracze wydają polecenia swoim jednostkom. Jednostki tego samego rodzaju zajmują wspólne pola. O kolejności poruszania się jednostek decyduje ich inicjatywa (oznacza to w szczególności, że jeśli jakiś gracz wybierze dużo jednostek o wysokiej inicjatywie te mogą atakować dużo częściej niż jego przeciwnika). Gracz każdą jednostką decyduje o tym czy chce się poruszyć, poruszyć i zaatakować, czy użyć mocy specjalnej (dotyczy niektórych jednostek). Jednostki są albo zasięgowe albo muszą znajdować się na polu obok przeciwnika by zaatakować. Jeśli jednostki znajdują się bezpośrednio obok siebie i próbujesz odejść to przeciwnik wykonuje bonusowy atak. 
Gra kończy się zwycięstwem gracza który wyeliminuje całą armię przeciwnika.
## Wymagania podstawowe
1. Gra powinna zawierać co najmniej 2 armie zawierające jednostki różniące się statystykami (Punkty życia, inicjatywa, zasięg ruchu, siła ataku, zasięgowość)
2. W wersji podstawowej tury rozgrywane są jedna po drugiej a inicjatywa decyduje tylko o kolejności ruchu
3. Armie składają się z jednostek które mogą w kilku sztukach zajmować jedno wspólne pole i zachowywać się jak jedna jednostka o pomnożonych statystykach np. 50 zombie o życiu 5 i sile 5 mają w sumie życie 250 zdrowia i 250 siły ale jeśli otrzymają 125 obrażeń to na planszy zostaje 25 zombie o 125 życia i 125 siły
4. Plansza powinna się składać z kwadratów, a jednostki przeciwnych armii powinny stać po przeciwległych bokach (rozmiar planszy jest dowolny (w granicach rozsądku))
5. Gra powinna sugerować która jednostka się rusza w danym momencie i pilnować czy ruchy są dozwolone
## Wersja rozszerzona
1. Niektóre jednostki powinny mieć zdolności (np nekromanta może wskrzesić poległe jednostki przeciwnika jako szkielety)
2. Na planszy znajdują się przeszkody blokujące ruch i atak zasięgowy
3. W grze znajduje się więcej różnorodnych armii
4. Plansza składa się z hexów 
5. Jednostki mają więcej statystyk (np.: szansa na unik, pancerz, szansa na trafienie krytyczne)
6. Gra liczy punktację bazując na niezużytych pieniądzach i pozostałej przy życiu armii i zapisuje tablicę wyników do pliku
7. Gra pozwala na zagranie większej liczbie graczy w trybie turniejowym

