# Gra 2D Strzelaninka
Tworzymy grę, strzelaninkę 2D z widokiem z góry, do zrealizowania w dwóch wersjach: dwuosobowej (PvP), bądź jednoosobową z botami (PvE). Wykorzystujemy oczywiście graficzne GUI.

## Liczba punktów: 4 (pod warunkiem implementacji obu wariantów)

## Wejściowe GUI: 
- Gra posiada wejściowe gui, gdzie można wybierać parametry wejściowe, takie jak rodzaj planszy czy dostępne bonusy/rodzaje przeciwników (patrz poniżej)

## Plansza: 
- Plansza jest szachownicą (niekoniecznie kwadratową), posiada pola, po których można się poruszać, oraz takie, po których nie można (ściany). 
- Nie można przechodzić za krawędzie planszy. 
- Istnieją co najmniej dwie różne plansze do wyboru. 

## Postać:
- Nasze postacie (postać) potrafią strzelać, strzał jest natychmiastowy, odbywa się w linii prostej i kończy na napotkaniu przeszkody (ściany, postaci albo bota). 
- Nasze postacie (postać) poruszają się tylko: lewo, prawo, góra, dół. 
- Strzały oraz ruchy postaci mają ograniczenia czasowe (to znaczy, jeżeli np. strzelisz to następny strzał możesz oddać dopiero za określoną ilość czasu). 
- Mechanikę poruszania, czyli co powodują klawisze pozostawiam wam (czyli np. po wciśnięciu strzałki w górę postać idzie do góry, czy się obraca do góry, czy idzie w kierunku, w którym jest obrócony) 
- Postać ma widoczne Hp (w postaci paska z boku planszy) oraz listę posiadanych przedmiotów (patrz poniżej). 
- Hp postaci nie może wyjść ponad normę (startową ilość). 
- Postacie ani boty nie mogą przez siebie nawzajem przechodzić.

## Oprócz tego w poszczególnych wersjach:

### Wersja A — dwuosobowa: 
- Wygrywa osoba, która przeżyje. 
- Dostępne są bonusy takie jak: apteczka + 3 inne dodatkowe zrobione wdł. własnego uznania, które spełniają założenia: 
	- Każdy może zebrać bonus. 
	- Bonusy znikają po pewnym czasie, jeżeli nikt ich nie zbierze. 
	- Pojawiają się w losowych miejscach dostępnych dla postaci.

### Wersja B — jednoosobowa: 
- Istnieją co najmniej 3 rodzaje różnych przeciwników (botów)
- Każdy przeciwnik ma pokazane swoje hp. 
- Jeżeli przeciwnik nas zauważy (to znaczy w linii prostej nie ma przeszkód uniemożliwiające mu zobaczenie nas, np. ścian) to nas atakuje (np. strzela lub idzie do nas, jeżeli atakuje wręcz)


