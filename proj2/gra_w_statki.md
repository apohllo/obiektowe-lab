# Gra w statki z AI

## Punktacja 

3

## Opis gry
Gracze (w tym przypadku gracz i komputer) najpierw rozmieszczają na kwadratowej mapie okręty.
Następnie starają się odgadnąć pozycje okrętów przeciwnika podając współrzędne mapy. Gracze
podają na zmianę współrzędne, po podaniu współrzędnych gracz otrzymuje informację o tym czy
trafił. W naszej wersji gry obaj gracze wykonują określoną liczbę ruchów na przemian (w przypadku
trafienia nie ma dodatkowego ruchu), w zależności od trafionego okrętu gracz otrzymuje pewną
liczbę punktów (ujawnienie punktacji następuje na koniec gry), gra kończy się kiedy obaj gracze
wykonają wszystkie ruchy albo gdy jeden z graczy zatopi wszystkie okręty przeciwnika. Wygrywa
gracz z większą liczbą punktów.

## Szczegóły gry
* Na początku gracz może wybrać długość krawędzi mapy oraz liczbę ruchów.
* Na początku gracz może wybrać zestaw okrętów do rozmieszczenia i punktacje za trafienie.
* Każdy okręt ma szerokość jednego pola mapy. Występują 3 rodzaje okrętów : Pancernik
  (długość 5 pól), Krążownik (długość 4 pola), Niszczyciel (długość 2 pola). Gracz wybiera na
  przykład: 1 pancernik za 10 pkt trafienie, 2 krążowniki za 5 pkt trafienie, 4 niszczyciele 2pkt
  trafienie (punkty za trafienie jednego pola okrętu a nie zatopienie całego).
* Komputer umieszcza na mapie swe okręty losowo, gracz wybiera gdzie je umieszcza.
* Gra powinna wyświetlać 2 mapy: mapę gracza z okrętami, każdy wybór komputera powinien
  być zaznaczony na tej mapie oraz mapę gdzie zaznaczone będą wybory gracza; w przypadku
  trafienia pole mapy powinno być wyróżnione (np. inny kolor). Po zakończeniu gry powinna
  wyświetlić się punktacja oraz wynik gry (przegrana, wygrana).
* Gra powinna umożliwiać wybór poziomu trudności gry komputera.
* Tryb łatwy – komputer wybiera pola losowo
* Tryb trudny – komputer powinien wybierać losowe pola spośród pół o tym samym kolorze;
  chodzi tu o standardowe kolorowanie szachownicy (pola o tej samej parzystości sumy
  współrzędnych mają ten sam kolor).
* W obu przypadkach komputer powinien odpowiednio zareagować na informację o trafieniu,
  tzn. powinien starać się zatopić cały okręt możliwie najszybciej (potem wraca do
  przeszukiwania).
